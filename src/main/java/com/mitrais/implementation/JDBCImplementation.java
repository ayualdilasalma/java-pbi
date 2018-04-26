package com.mitrais.implementation;

import com.mongodb.*;
import com.mongodb.MongoClient;

public class JDBCImplementation {

    /**
     * Show all records from database
     * @param collection - chosen collection to show the data
     */
    private static void selectAllRecordsFromACollection(DBCollection collection) {
        DBCursor cursor = collection.find();
        while(cursor.hasNext()) {
            System.out.println(cursor.next());
        }
    }

    public static void main(String[] args) {
        try {
            MongoClientURI uri = new MongoClientURI("mongodb+srv://dila:Helloworld123@cluster0-82r3u.mongodb.net/test");
            MongoClient mongoClient = new MongoClient(uri);
            DB db = mongoClient.getDB("test");

            DBCollection collection = db.getCollection("artists");
            JDBCImplementation.selectAllRecordsFromACollection(collection);

        } catch (Exception e) {
            System.out.println("Failed to connect");
        }
    }
}
