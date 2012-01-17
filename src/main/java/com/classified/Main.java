package com.classified;

public class Main {
    public static void main(String[] args) throws Exception {
        DbManager dbm = new DbManager();

        System.out.println(dbm.getUser("anuj").passwd);
        System.out.println(dbm.getUser("mahak").passwd);


    }
}
