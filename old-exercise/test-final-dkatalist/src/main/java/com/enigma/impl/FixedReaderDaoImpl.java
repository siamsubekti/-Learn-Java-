package com.enigma.impl;

import com.enigma.dao.BoatingDockDao;
import com.enigma.dao.FixedReaderDao;
import com.enigma.model.Boat;

import java.io.BufferedReader;
import java.io.IOException;

public class FixedReaderDaoImpl implements FixedReaderDao {
    public static final String CREATE_BOATING_DOCK = "create_boating_dock";
    public static final String BOATING_DOCK = "dock";
    public static final String BOATING_LEAVE = "leave";
    public static final String BOATING_STATUS = "status";

    private static BoatingDockDao boatingDockDao;
    public FixedReaderDaoImpl() {
    }

    @Override
    public String read(BufferedReader bufferedReader) throws IOException {
        while (true) {
            String text = bufferedReader.readLine();

            if (text == null)
                break;
            String [] array = text.trim().split("\\s+");

            for (int i=0; i < array.length; i++) {
                switch (array[i]) {
                    case CREATE_BOATING_DOCK :
                        Integer capacity = Integer.parseInt(array[i+1]);
                        boatingDockDao = new BoatingDockDaoImpl(capacity);
                        System.out.println(boatingDockDao.createParkingBoat());
                        break;
                    case BOATING_DOCK :
                        String licenseNumber = array[i+1];
                        String colour = array[i+2];
                        System.out.println(boatingDockDao.dock(new Boat(licenseNumber, colour)));
                        break;
                    case BOATING_LEAVE :
                        String pierNumber = array[i+1];
                        System.out.println(boatingDockDao.leave(new Boat(pierNumber)));
                        break;
                    case BOATING_STATUS :
                        System.out.println(boatingDockDao.status());
                    default:
                        break;
                }
            }
        }
        return null;
    }
}
