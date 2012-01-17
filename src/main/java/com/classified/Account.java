package com.classified;

import java.lang.String;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


@Path("/account")
@Produces("application/json")
public class Account {

    @GET
    @Path("/hello")
    public String hello() {
        return "Hello World";
    }

    /*
    @GET
    @Path("/echo/{msg}")
    public String echo(@PathParam("msg") String id) {
        return id.toUpperCase();
    } */
    @GET
    @Path("/signin/{username}/{passwrd}")
    public boolean signin(@PathParam("username") String user,@PathParam("passwrd") String passwd){
        return true;
        //for user to sign in
    }
    public void updateProfile(){
        //can update profile only if the user is signed in
    }
    public String encryption(){
        return "encryption";
    }
    public boolean passwrdStrength(String passwd){
        if(passwd.length()>=12)
            return true;
        return false;
    }
    public boolean confirmPasswrd(String p1,String p2){
        if(p1.equals(p2))
            return true;
        return false;
    }
    public boolean checkAvailability(String username){
        return true;
    }

    @GET
    @Path("/createAccount")
    public void account(){
       //encrypted word
        //passwrd strength
        //confirmation of password
        //check availability of username
    }

    @GET
    @Path("/signout")
    public void signout(){

    }

    @GET
    @Path("profile")
    public void viewProfile(){

    }

}