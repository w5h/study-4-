
package com.chaojilaji.messageborad.service;


public interface UserSerivice {
    Boolean checkUser(String userName, String password);
    Boolean checkLogin(String userName,String password);
    //Boolean board(String userName,String password,String word);
}