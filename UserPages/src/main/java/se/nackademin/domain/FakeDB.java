/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.domain;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author robin
 */
public class FakeDB {
     private static Map<String, User> users = new HashMap<>();
     
     private static FakeDB fakeDB;
     
     private FakeDB(){
         
     }
     
     public static void addUser(String username, String password){
        User user = new User(username, password);
        users.put(user.getUsername(), user);
     }
     
     public static FakeDB getFakeDB(){
         return fakeDB;
     }
     
     public static void setFakeDB(FakeDB fakeDB){
         FakeDB.fakeDB = fakeDB;
     }
    
}
