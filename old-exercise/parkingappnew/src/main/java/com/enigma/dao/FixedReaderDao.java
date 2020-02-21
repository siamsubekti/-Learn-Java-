package com.enigma.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface FixedReaderDao {
    void read(BufferedReader bufferedReader) throws IOException;
}
