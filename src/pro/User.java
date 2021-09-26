
package pro;

public class User {
    
    private int number;                   //this class is generally used to store data from the database 
     private String title;                //we did this in another class because it will be easier to create objects from
    private String question;              //this class with all the data for a given row
                                          //and if we use this class with arrayLists and loops all of the data from the specified 
                                          //database table can be accessed. Which is what is done in our case
    public User(int num, String title, String question)
    {
        this.number = num;
        this.title = title;
        this.question = question;
        
    }
    
    public int getNumber()
    {
        return number;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getQuestion()
    {
        return question;
    }
  
}
