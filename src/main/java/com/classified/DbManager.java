package com.classified;

import com.mongodb.*;
import com.mongodb.util.JSON;

import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class DbManager {
    private DB db;
    public DbManager() throws UnknownHostException {
        db = new Mongo("localhost", 27017).getDB("classified");        
    }
    
    public DBCollection usercol() {
        return db.getCollection("user");
    }
    
    public DBCollection dealcol(){
        return db.getCollection("deal");
    }
    void createDeal(Deal deal){
        dealcol().insert(deal.toDBObject());
    }
    
    List<Deal> dealByUser(String username){
        List<Deal> res = new LinkedList<Deal>();
        DBCursor c = dealcol().find(new BasicDBObject("username",username));
        for (DBObject o : c)
            res.add(new Deal(o));
        return res;
    }
    

    void createAcc(User user){
        usercol().insert(user.toDBObject());
    }
    
    User getUser(String username) {
        DBObject o =usercol().findOne(new BasicDBObject("name", username));
        return new User(o);
    }
    
    List<User> getAllUsers() {
        List<User> res = new LinkedList<User>();
        DBCursor c = usercol().find();
        for (DBObject o : c){
            res.add(new User(o));
        }
        return res;
    }

}
