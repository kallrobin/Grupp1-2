package se.nackademin.registration;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import se.nackademin.domain.UserHandler;

@Named
@RequestScoped
public class Registration {
    
@Inject
private UserHandler userHandler;
    
    
}
