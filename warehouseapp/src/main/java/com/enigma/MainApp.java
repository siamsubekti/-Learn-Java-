<<<<<<< HEAD
package com.enigma;

import com.enigma.dao.StorageDao;
import com.enigma.impl.StorageDaoImpl;

public class MainApp {
    public static void main(String[] args) {
        StorageDao storageDao = new StorageDaoImpl(3);
        storageDao.createStorageRoom();

        System.out.println(storageDao.setStorageRoom(2,10, "amunisi, weapons, medics"));
        System.out.println(storageDao.setStorageRoom(2,20, "newspaper, poster, books"));
    }
}
=======
package com.enigma;

import com.enigma.dao.StorageDao;
import com.enigma.impl.StorageDaoImpl;

public class MainApp {
    public static void main(String[] args) {
        StorageDao storageDao = new StorageDaoImpl(3);
        storageDao.createStorageRoom();

        System.out.println(storageDao.setStorageRoom(2,10, "amunisi, weapons, medics"));
        System.out.println(storageDao.setStorageRoom(2,20, "newspaper, poster, books"));
    }
}
>>>>>>> 4ebe7e994d89cdcc758f8fb91670f3511a676257
