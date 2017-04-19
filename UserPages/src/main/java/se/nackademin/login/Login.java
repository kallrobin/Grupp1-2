package se.nackademin.login;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import se.nackademin.domain.UserHandler;


@Named
@RequestScoped
public class Login {
    
    @Inject
    private UserHandler userHandler;
    
    public void doLogin(String username, String password) {
        //TODO: Redirecting users on success
        userHandler.login(username, password);
    }
    
}
