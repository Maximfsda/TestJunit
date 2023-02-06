package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersList {

    private Map<Integer,User>allUsers;
    private int countId = 1;


    public void creationUser(User user){
        if(allUsers == null){
            allUsers = new HashMap< Integer,User>();
        }
        user.setId(countId);
        allUsers.put(countId,user);
        countId++;
    }

    public List<User> getAllUser(){
        return new ArrayList<User>(allUsers.values());
    }


}
