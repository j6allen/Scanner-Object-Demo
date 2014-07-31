/*********************
 @Author Jesse Allen
 @Date 8/27/2013
*********************/

/*This program will record input from user regarding name, address, phone, 
and college major and display the information back in the form of a paragraph*/

import java.util.Scanner; //Needed in order to create an object of the Scanner class later in program

public class ScannerDemo
{
   public static void main(String[] args)
   {
      //Did not comment individual variables since names are self descriptive
      String firstName, lastName, streetNo, streetName, city, state, zip, telephone, collegeMajor;
      
      //new scanner object
      Scanner keyboard = new Scanner(System.in); 
      
      //Get first name
      System.out.print("What is your first name?: ");
      firstName = keyboard.nextLine();  
      
      //Get last name
      System.out.print("What is your last name?: ");
      lastName = keyboard.nextLine();

      //Get street number, should be numeric string only
      System.out.print("What is your street number?, ex. 2247: ");
      streetNo = keyboard.nextLine();

      //Get street name including prefix and suffix
      System.out.print("What is your street name?, ex. W. Fake St.: ");
      streetName = keyboard.nextLine();
      
      //Get city name
      System.out.print("What city do you live in?: ");
      city = keyboard.nextLine();

      //Get state name, can be written out or abbreviated
      System.out.print("What state do you live in?: ");
      state = keyboard.nextLine();

      //Get zip code
      System.out.print("What is your zip code?: ");
      zip = keyboard.nextLine();
      
      //Get phone number
      System.out.print("What is your telephone number?, ex. 555-555-5555: ");
      telephone = keyboard.nextLine();

      //get college major
      System.out.print("What is your college Major?: ");
      collegeMajor = keyboard.nextLine();

      //print object to display user imput
      System.out.print("Hello " + firstName + " " + lastName + ",\n");
      System.out.print("You live at " + streetNo + " " + streetName +  
                       " " + city + ", " + state + " " + zip + ".\n"); 
      System.out.print("Your phone number is " + telephone + "\n");
      System.out.println("and your college major is " + collegeMajor + ".");
   }
}                              
                       
                       