package com.exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Maping {

    //difference HashMap and LinkedHashMap in output syso
        public static void main(String[] args) {
            //HashMap
            Map<Integer, String> mapHttpError = new HashMap<>();
            mapHttpError.put(200, "OK");
            mapHttpError.put(500, "Internal Server Error");
            mapHttpError.put(404, "Not Found");
            mapHttpError.put(403, "Forbidden");

            //LinkedHashMap
            Map<String, String> mapContact = new LinkedHashMap<>();
            mapContact.put("083727", "tr");
            mapContact.put("09382704", "gr");
            mapContact.put("29038024", "jk");

            //TreeMap
            Map<String, String> mapAlphabetic = new TreeMap<>();
            mapAlphabetic.put("A", "ABA");
            mapAlphabetic.put("H", "AHA");
            mapAlphabetic.put("F", "AFA");
            mapAlphabetic.put("B", "ABA");
            mapAlphabetic.put("C", "ACA");

            System.out.println("HashMap: " + mapHttpError);
            System.out.println("Linked: " + mapContact);
            System.out.println("TreeMap: " + mapAlphabetic);
            // perbedaanya terletak saat linked masih mempertahankan isi dari urutan yang masih alami
            // di TreeMap akan mengurutkan berdasarakan aplhabetik sort A-Z
            // di HashMap akan free sorting
    }
}
