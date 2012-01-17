package com.classified;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

public class search {
    public boolean searchByAuthor(){
           return true;
        //search if full name or initials provided
        //fold lower case and upper case letters
        //use auto complete
    }
    public boolean searchByCategory(){
        return true;
        //use auto complete if category exists
            //else show results in miscellaneous category
        //fold lowercase and upper case letters

    }
    public boolean searchByName(){
        return true;
        //search by the name of the book
        //take key words,ignore articles
        //use autocomplete
        //use fold
    }
    void autocomplete(){
        // searches the database and show all results beginning with the letters
        // show only first ten results
    }
    void fold(){

    }

    String initials(String name){
            //converts a name into initials
         return "initials";
    }
    String removeArticles(String name){
        return "";
    }

    String[] topTenSearches(){
        //display the ten most searched items
        String str[]= {" "," "};
        return str;
    }
}
