package com.example.springusermodel.dao;

import com.example.springusermodel.model.Login;
import com.example.springusermodel.model.User;

import java.util.ArrayList;
import java.util.List;

//Lớp UserDao chứa một danh sách các user cho trước và phương thức checkLogin() cho phép kiểm tra thông tin login.
public class UserDao {
    private static List<User> users;
    static  {
        users= new ArrayList<>();
        User u1=new User("john","123456","John","john@codegym.vn",10);
        users.add(u1);
        User u2=new User("bill","123456","Bill","bill@codegym.vn",15);
        users.add(u2);
        User u3=new User("mike","123456","Mike","mike@codegym.vn",16);
        users.add(u3);
    }
    public static User checkLogin(Login login){
        for(User u: users){
            if(u.getAccount().equals(login.getAccount())
                && u.getPassword().equals(login.getPassword())){
                return u;
            }

        }
        return null;
    }

}
