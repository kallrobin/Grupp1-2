package se.nackademin.domain;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class UserHandler implements Serializable {
    
    public void doRegister(User selectedUser){
        //TODO; Lägga till en varning om id redan finns
        if(!FakeDB.isUserExists(selectedUser)){
          FakeDB.addUser(selectedUser);
        }
    }
    

}
