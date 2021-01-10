package test;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

class HelloWorld {
    public static void main(String args[]) {
    	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  //create date format object 
    	LocalDateTime timestamp = LocalDateTime.now();  //create timestamp object
        System.out.println("Hello World!");
        System.out.print("Current time and date is: ");
        System.out.println(dtf.format(timestamp)); //output properly formatted timestamp
        System.out.println("My name is Alex, I'm happy to be in this course :)");
    }
}