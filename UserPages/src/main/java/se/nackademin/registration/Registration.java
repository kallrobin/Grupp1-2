package se.nackademin.registration;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import se.nackademin.domain.User;
import se.nackademin.domain.UserHandler;

@Named
@RequestScoped
public class Registration {
    
@Inject
private UserHandler userHandler;
    
    //TODO: Error handling of failed register
    //TODO: Redirecting users on success
    public void register(String username, String password) {
        User user = new User(username,password);
        userHandler.doRegister(user);
    }
    
}
