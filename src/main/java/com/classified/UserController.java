package com.classified;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class UserController {
    DbManager db;

    boolean validateUser(String user, String passwd) {
        User u =  db.getUser(user);
        return u==null? false : u.passwd.equals(passwd);
    }

}
