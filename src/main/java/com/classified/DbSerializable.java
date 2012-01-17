package com.classified;

import com.mongodb.DBObject;

public interface DbSerializable {
    DBObject toDBObject();
}
