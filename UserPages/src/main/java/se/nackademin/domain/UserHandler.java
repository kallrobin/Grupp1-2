package se.nackademin.domain;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class UserHandler {
    
    public void doRegister(User selectedUser){
        //TODO; Lägga till en varning om id redan finns
        if(!userExists(selectedUser)){
          FakeDB.addUser(selectedUser);
        }
    }
    
    private boolean userExists(User selectedUser){
        User dbUser = FakeDB.getUser(selectedUser.getUsername());
        
    }
    
    
    
}
