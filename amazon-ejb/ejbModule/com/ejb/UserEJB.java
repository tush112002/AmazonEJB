package com.ejb;


import java.sql.SQLException;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import com.model.Status;
import com.model.Users;

import dao.UsersDAO;


/**
 * Session Bean implementation class UserEJB
 */
@Stateless
@LocalBean
public class UserEJB implements UserEJBLocal {

    /**
     * Default constructor. 
     */
    public UserEJB() {
        // TODO Auto-generated constructor stub
    }
    
    @Inject
    private UsersDAO userdao;
    
    
    public Status registerUser(Users user) throws SQLException{
    	System.out.println("hello");
    	System.out.println("register user from usersEJB");
    	return userdao.signUp(user);
    }
    
    public Users loginUser(Users user)throws SQLException{
    	System.out.println("Login user from usersEJB");
    	return userdao.signIn(user);
    }

}
