package com.classified;


import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

import java.util.Date;
import java.util.UUID;

public class Deal implements DbSerializable{

    UUID id; 

    enum Status {
        open, closed
    }

    Date createtime;
    String author;
    long price;
    String username;

    public Deal(DBObject o){
        this.id = UUID.fromString(o.get("id").toString());
        this.price = Long.parseLong(o.get("price").toString());
        this.author = o.get("author").toString();
        this.username = o.get("username").toString();

    }

    public DBObject toDBObject() {
        BasicDBObject o = new BasicDBObject();
        o.put("id", id.toString());
        o.put("author", author);
        o.put("username",username);
        o.put("price", new Long(price).toString());
        // todo: add more fields;
        return o;
    }
    
    

    
}
