package com.enigma;

import com.enigma.constant.MessageConstant;
import com.enigma.dao.FixedReaderDao;
import com.enigma.dao.ParkingLotDao;
import com.enigma.impl.FixedReaderDaoImpl;
import com.enigma.impl.ParkingLotDaoImpl;
import com.enigma.model.Car;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MainApplication {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = Files.newBufferedReader(Paths.get("E:\\Java\\fromExcerciseDkatalis\\file-text.txt"));
        FixedReaderDao fixedReader = new FixedReaderDaoImpl();
        try {
            fixedReader.read(reader);
        } catch (FileNotFoundException fileNotFound) {
            fileNotFound.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }


//        BufferedReader reader = new BufferedReader(new FileReader("E:\\Java\\fromExcerciseDkatalis\\file-text.txt"));
//        while (true) {
//            String text = reader.readLine();
//            if (text == null)
//                break;
//            String [] array = text.trim().split("\\s+");
//
//            for (int i=0; i < array.length; i++){
//                switch (array[i]) {
//                    case "create_parking_lot":
//                        Integer capacity = Integer.parseInt(array[i +1]);
//                        parkingLotDao = new ParkingLotDaoImpl(capacity);
//                        System.out.println(parkingLotDao.createParkingLot());
//                        break;
//                    case "park":
//                        String lincenseNumber = array[i + 1];
//                        System.out.println(parkingLotDao.park(new Car(lincenseNumber)));
//                        break;
//                    case "leave":
//                        String lincenseNumberLeave = array[i + 1];
//                        Integer hour = Integer.parseInt(array[i + 2]);
//                        System.out.println(parkingLotDao.leave(new Car(lincenseNumberLeave), hour));
//                        break;
//                    case "status":
//                        System.out.println(parkingLotDao.getStatus());
//                    default:
//                        break;
//                }
//            }
//
//        }
    }
}
