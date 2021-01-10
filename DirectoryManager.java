
package school;





/*****************************************************************************
* Class Name : DirectoryManager
* Author     : Joshua Chase
* Date       : 12/2/2020
* Description: Cycles through menu to manage a Contact Directory
* Constants  : RESET  : int
*              INSERT : int
*              DELETE : int
*              SEARCH : int
*              PRINT  : int
*              EXIT   : int
* Variables  : 
* Methods    :
*   +main   : void
*   -prompt : int
*   -menu   : String
******************************************************************************/

public class DirectoryManager 
{
    
    //Class Constants
    private static final int RESET  = 1;                        //Reset option
    private static final int INSERT = 2;                        //Insert option
    private static final int DELETE = 3;                        //Delete option
    private static final int SEARCH = 4;                        //Search option
    private static final int PRINT  = 5;                        //Print option
    private static final int EXIT   = 6;                        //Exit option

    //Class Variables

    /**************************************************************************
     * Method Name: +main
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : void
     * Description: Entry method, initiates a menu interface to 
     *              manage directory
     * Args       : args : String[]
     * Constants  :
     * Variables  : opt   : int
     *              num   : long
     *              fName : String
     *              lName : String
     *              title : String
     *              con   : Contact
     *              dir   : Directory
     * Algorithm  :
     *  BEGIN main
     *      WHILE user doesn't choose EXIT
     *          Prompt for input from menu and store as opt
     *          SWITCH opt
     *              CASE RESET
     *                  Reinitialize dir
     *                  Inform user new directory created
     *              END CASE
     *              CASE INSERT
     *                  Prompt for First Name and store as fName
     *                  Prompt for Last Name and store as lName
     *                  Prompt for Title and store as title
     *                  Prompt for Phone Number and store as num
     *                  Instantiate new Contact
     *                  Insert Contact into dir
     *                  Inform user contact was added
     *              END CASE
     *              CASE DELETE
     *                  Prompt for First Name and store as fName
     *                  Prompt for Last Name and store as lName
     *                  IF able to delete contact by name
     *                      Inform user contact deleted
     *                  END IF
     *              END CASE
     *              CASE SEARCH
     *                  Prompt for First Name and store as fName
     *                  Prompt for Last Name and store as lName
     *                  Search dir for full name
     *              END CASE
     *              CASE PRINT
     *                  Print dir
     *              END CASE
     *          END SWITCH
     *      END WHILE
     *  END main 
     *************************************************************************/
    public static void main(String[] args) 
    {
     
        //Local Constant
        
        //Local Variables
        int opt       = 0;                                       //Option
        long num      = 0;                                       //Phone Number
        String fName  = "";                                      //First Name
        String lName  = "";                                      //Last Name
        String title  = "";                                      //Job Title
        Contact con;                                             //Contact
        Directory dir = new Directory();                         //Directory   
                
        //*************************** BEGIN main ******************************
        
        //WHILE user doesn't choose EXIT
        while(opt != EXIT)
        {
            
            //Prompt for input from menu and store as opt
            opt = prompt();
            
            //SWITCH opt
            switch(opt)
            {
                
                //CASE RESET
                case RESET:
                    
                    //Instantiate new directory
                    dir = new Directory();
                    
                    //Inform user new directory created
                    System.out.println();
                    System.out.println("New directory created.");
                    
                    //END CASE
                    break;
                    
                //CASE INSERT
                case INSERT:
                    
                    //Prompt for First Name and store as fName
                    System.out.println();
                    System.out.print("First Name  : ");
                    fName = Common.readString();
                    
                    //Prompt for Last Name and store as lName
                    System.out.print("Last Name   : ");
                    lName = Common.readString();
                    
                    //Prompt for Title and store as title
                    System.out.print("Title       : ");
                    title = Common.readString();
                    
                    //Prompt for Phone Number and store as num
                    System.out.print("Phone Number: ");
                    num = Common.readLong();
                    
                    //Instantiate new contact
                    con = new Contact(num, fName, lName, title);
                    
                    //Insert Contact into dir
                    dir.insert(con);
                    
                    //Inform user contact was added
                    System.out.println();
                    System.out.println(fName + " " + lName + " has been "
                            + "added to the directory.");
                    
                    //END CASE
                    break;
                    
                //CASE DELETE
                case DELETE:
                    
                    //Prompt for First Name and store as fName
                    System.out.println();
                    System.out.print("First Name: ");
                    fName = Common.readString();
                    
                    //Prompt for Last Name and store as lName
                    System.out.print("Last Name : ");
                    lName = Common.readString();
                    
                    //IF able to delete contact by name 
                    if(dir.delete(lName, fName))
                    {
                        
                        //Inform user contact deleted
                        System.out.println();
                        System.out.println(fName + " " + lName + " has been "
                                + "deleted from the directory.");
                        
                    } //END IF
                    
                    //END CASE
                    break;
                    
                //CASE SEARCH
                case SEARCH:
                    
                    //Prompt for First Name and store as fName
                    System.out.println();
                    System.out.print("First Name: ");
                    fName = Common.readString();
                    
                    //Prompt for Last Name and store as lName
                    System.out.print("Last Name : ");
                    lName = Common.readString();
                    
                    //Search dir for full name
                    System.out.println(Common.border());
                    dir.search(lName, fName);
                    
                    //END CASE
                    break;
                    
                //CASE PRINT
                case PRINT:
                    
                    //Print dir
                    System.out.println(dir);
                                 
            } //END SWITCH            
            
        } //END WHILE                
    
    } //END main

    /**************************************************************************
     * Method Name: -prompt
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : int
     * Description: Prompts user to select from menu
     * Args       :
     * Constants  :
     * Variables  : opt   : int
     * Algorithm  :
     *  BEGIN prompt
     *      Print menu
     *      Read user input and store as opt
     *      RETURN opt
     *  END prompt 
     *************************************************************************/
    private static int prompt()
    {
        
        //Local Constants
        
        //Local Variables
        int opt = 0;                                         //Output selection   
                
        //************************** BEGIN prompt *****************************
        
        
        //Print menu
        System.out.println();
        System.out.print(menu());
        
        //Read user input and store as opt
        opt = Common.readInt();
        
        //RETURN opt
        return opt;
        
    } //END prompt

    /**************************************************************************
     * Method Name: -menu
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : String
     * Description: Returns menu
     * Args       :
     * Constants  :
     * Variables  : m : String
     * Algorithm  :
     *  BEGIN menu
     *      Store menu as m
     *      RETURN m
     *  END menu 
     *************************************************************************/
    private static String menu()
    {
        
        //Local Constants
        
        //Local Variables
        String m = "";                                            //Output menu   
                
        //*************************** BEGIN menu ******************************
                
        //Store menu as m
        m = RESET    + ". Reset directory.\n"
            + INSERT + ". Insert contact.\n"
            + DELETE + ". Delete contact.\n"
            + SEARCH + ". Search for contact.\n"
            + PRINT  + ". Print directory.\n"
            + EXIT   + ". Exit Program.\n"
            + "\nPlease select from the menu: ";
        
        //RETURN m
        return m;
        
    } //END menu
    
} //END class DirectoryManager
