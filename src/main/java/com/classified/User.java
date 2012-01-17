package com.classified;

import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;

public class User implements DbSerializable{
    public String   name, displayname,
                    contact,
                    emailid,
                    address;
    public String passwd;

    public User(String name, String displayname, String contact, String emailid, String address, String passwd) {
        this.name = name;
        this.displayname = displayname;
        this.contact = contact;
        this.emailid = emailid;
        this.address = address;
        this.passwd = passwd;
    }

    public User (DBObject o) {
        this.name = o.get("name").toString();
        this.passwd = o.get("passwd").toString();
    }

    public DBObject toDBObject() {
        BasicDBObject o = new BasicDBObject();
        o.put("name", name);
        o.put("passwd", passwd);
        // todo: add more fields;
        return o;
    }
}
