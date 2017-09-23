package com.example.atulsachdeva.pndlec9assign;

import java.util.ArrayList;

/**
 * Created by AtulSachdeva on 18/09/17.
 */

public class User {

    Integer faceId;
    String name;
    String dob;
    String email;

    public User(Integer faceId, String name, String email, String dob) {
        this.faceId = faceId;
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    public Integer getFaceId() {
        return faceId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDob() {
        return dob;
    }

    static public  ArrayList<User> generateList(){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(R.drawable.user_1,"Katherine Russell","katherine.russell@example.com","1990-11-08 14:35:29"));
        users.add(new User(R.drawable.user_2,"Fredrick Crawford","fredrick.crawford@example.com","1963-09-12 18:30:35"));
        users.add(new User(R.drawable.user_3,"Riley Medina","riley.medina@example.com","1983-08-21 05:55:40"));
        users.add(new User(R.drawable.user_4,"Tony Ross","tony.ross@example.com","1947-08-06 02:24:54"));
        users.add(new User(R.drawable.user_5,"Noah Wright","noah.wright@example.com","1947-12-06 13:01:39"));
        users.add(new User(R.drawable.user_6,"Junilvana Almeida","junilvana.almeida@example.com","1949-06-05 12:05:59"));
        return users;
    }

}
