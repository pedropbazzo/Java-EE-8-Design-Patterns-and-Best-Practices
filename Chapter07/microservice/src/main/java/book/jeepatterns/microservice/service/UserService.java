package book.jeepatterns.microservice.service;

import java.text.SimpleDateFormat;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import book.jeepatterns.microservice.model.User;

@Stateless
@LocalBean
public class UserService {

    /**
     * Default constructor. 
     */
    public UserService() {
    
    public User getUserById (Long id) {
    	User user = new User();
    	user.setCode("F555777");
    	user.setName("Fulano X");
    	return user;
    }

}
