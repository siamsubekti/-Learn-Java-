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
        fixedReader.read(reader);

    }
}
