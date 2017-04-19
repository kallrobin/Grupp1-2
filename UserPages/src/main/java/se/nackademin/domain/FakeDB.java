package se.nackademin.domain;

import java.util.HashMap;
import java.util.Map;

public class FakeDB {
     private static Map<String, User> users = new HashMap<>();
     
     private static FakeDB fakeDB;
     
     private FakeDB(){
        addUser(new User("Carl", "Secret"));
        addUser(new User("Test", "Test"));
        addUser(new User("John", "Doe"));
     }
     
     private static User getUser(String username){
        User user = users.get(username);
        return user;    
     }
     
     public static boolean isUserExists(User selectedUser){
        User dbUser = FakeDB.getUser(selectedUser.getUsername());
        return (dbUser != null);
    }
     
     
     public static void addUser(User user){
        users.put(user.getUsername(), user);
     }
     
     public static FakeDB retrieveFakeDB(){
         return fakeDB;
     }
     
     public static void persistFakeDB(FakeDB fakeDB){
         FakeDB.fakeDB = fakeDB;
     }
    
}
