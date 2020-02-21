package com.enigma;

import com.enigma.dao.FixedReaderDao;
import com.enigma.impl.FixedReaderDaoImpl;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = Files.newBufferedReader(Paths.get("C:\\test-final-dkatalist\\file_inputs.txt"));
        FixedReaderDao fixedReaderDao = new FixedReaderDaoImpl();

        try {
            fixedReaderDao.read(reader);
        }catch (FileNotFoundException fileNotFound) {
            fileNotFound.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
