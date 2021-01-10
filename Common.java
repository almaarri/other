
/*****************************************************************************
* Class Name : Common
* Author     : Joshua Chase
* Date       : 12/2/2020
* Description: Static methods shared between classes of Directory program.
* Constants  :
* Variables  :
* Methods    :
*   +ACfromNumber : int
*   +ECfromNumber : int
*   +SNfromNumber : int
*   +border       : String
*   +readInt      : int
*   +readLong     : long
*   +readString   : String
******************************************************************************/
package school;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Common 
{
    
    //Class Constants
    
    //Class Variables

    /**************************************************************************
     * Method Name: +ACfromNumber
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : int
     * Description: Obtains area code from input phone number
     * Args       : number : long
     * Constants  :
     * Variables  : ac     : int
     * Algorithm  :
     *  BEGIN ACfromNumber
     *      Compute ac = number / 10000000
     *      RETURN ac
     *  END ACfromNumber 
     *************************************************************************/
    public static int ACfromNumber(long number)
    {
        
        //Local Constants
        
        //Local Variables
        int ac = 0;                                        //Area Code returned
        
        //************************ BEGIN ACfromNumber *************************
        
        //Compute ac = number / 10000000
        ac =(int)(number / 10000000l);
        
        //RETURN ac
        return ac;
        
    } //END ACfromNumber

    /**************************************************************************
     * Method Name: +ECfromNumber
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : int
     * Description: Obtains exchange code from input phone number
     * Args       : number : long
     * Constants  :
     * Variables  : ec     : int
     * Algorithm  :
     *  BEGIN ECfromNumber
     *      Compute ec = number MOD 10000000 / 10000
     *      RETURN ec
     *  END ECfromNumber 
     *************************************************************************/
    public static int ECfromNumber(long number)
    {
        
        //Local Constants
        
        //Local Variables
        int ec = 0;                                    //Exchange Code returned
        
        //************************ BEGIN ECfromNumber *************************
        
        //Compute ec = number MOD 10000000 / 10000
        ec = (int) (number % 10000000l / 10000l);
        
        //RETURN ec
        return ec;
        
    } //END ECfromNumber

    /**************************************************************************
     * Method Name: +SNfromNumber
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : int
     * Description: Obtains subscriber number from input phone number
     * Args       : number : long
     * Constants  :
     * Variables  : sn     : int
     * Algorithm  :
     *  BEGIN SNfromNumber
     *      Compute sn = number MOD 10000
     *      RETURN sn
     *  END SNfromNumber 
     *************************************************************************/
    public static int SNfromNumber(long number)
    {
        
        //Local Constants
        
        //Local Variables
        int sn = 0;                                //Subscriber number returned
        
        //************************ BEGIN SNfromNumber *************************
        
        //Compute sn = number MOD 10000
        sn = (int) (number % 10000l);
        
        //RETURN sn
        return sn;
        
    } //END SNfromNumber

    /**************************************************************************
     * Method Name: +border
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : String
     * Description: Returns a common border string for command line display
     * Args       :
     * Constants  :
     * Variables  :
     * Algorithm  :
     *  BEGIN border
     *      RETURN border dashes
     *  END border 
     *************************************************************************/
    public static String border()
    {
        
        //Local Constants
        
        //Local Variables
        
        //*************************** BEGIN border ****************************
        
        //RETURN border dashes
        return "\n----------------------------";
        
    } //END border

    /**************************************************************************
     * Method Name: +readInt
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : int
     * Description: Uses scanner object to read and validate int 
     *              input from user
     * Args       :
     * Constants  :
     * Variables  : isValid : boolean
     *              num     : int
     *              scan    : Scanner
     * Algorithm  :
     *  BEGIN readInt
     *      WHILE input not valid
     *          BEGIN try
     *              Read user input and store as num
     *              Mark input as valid
     *          END try
     *          BEGIN catch InputMismatchException
     *              Reset scanner
     *              Request valid input from user
     *          END catch
     *      END WHILE
     *      RETURN num
     *  END readInt 
     *************************************************************************/
    public static int readInt()
    {
        
        //Local Constants
        
        //Local Variables
        boolean isValid = false;                            //Marks valid input
        int num         = 0;                                //Return value
        Scanner scan    = new Scanner(System.in);           //Reads user input
        
        //************************** BEGIN readInt ****************************
        
        //WHILE input not valid
        while(!isValid)
        {
            
            //BEGIN try
            try
            {
                
                //Read user input and store as num
                num = scan.nextInt();

                //Mark input as valid
                isValid = true;
                
            } //END try
            
            //BEGIN catch InputMismatchException
            catch(InputMismatchException e)
            {

                //Reset scanner
                scan.next();
                
                //Request valid input from user
                System.out.println("Please provide valid input: ");

            } //END catch
            
        } //END WHILE
        
        //RETURN num
        return num;
        
    } //END readInt

    /**************************************************************************
     * Method Name: +readLong
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : long
     * Description: Uses scanner object to read and validate long 
     *              input from user
     * Args       :
     * Constants  :
     * Variables  : isValid : boolean
     *              num     : long
     *              scan    : Scanner
     * Algorithm  :
     *  BEGIN readLong
     *      WHILE input not valid
     *          BEGIN try
     *              Read user input and store as num
     *              Mark input as valid
     *          END try
     *          BEGIN catch InputMismatchException
     *              Reset scanner
     *              Request valid input from user
     *          END catch
     *      END WHILE
     *      RETURN num
     *  END readLong
     *************************************************************************/
    public static long readLong()
    {
        
        //Local Constants
        
        //Local Variables
        boolean isValid = false;                            //Marks valid input
        long num        = 0;                                //Return value
        Scanner scan    = new Scanner(System.in);           //Reads user input
        
        //************************* BEGIN readLong ****************************
        
        //WHILE input not valid
        while(!isValid)
        {
            
            //BEGIN try
            try
            {
                
                //Read user input and store as num
                num = scan.nextLong();

                //Mark input as valid
                isValid = true;
                
            } //END try
            
            //BEGIN catch InputMismatchException
            catch(InputMismatchException e)
            {

                //Reset scanner
                scan.next();
                
                //Request valid input from user
                System.out.println("Please provide valid input: ");

            } //END catch
            
        } //END WHILE
        
        //RETURN num
        return num;
        
    } //END readLong

    /**************************************************************************
     * Method Name: +readString
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : String
     * Description: Uses scanner object to read String input from user
     * Args       :
     * Constants  :
     * Variables  : str  : String
     *              scan : Scanner
     * Algorithm  :
     *  BEGIN readString
     *      Read user input and store as str
     *      RETURN str
     *  END readString
     *************************************************************************/
    public static String readString()
    {
        
        //Local Constants
        
        //Local Variables
        String str   = "";                                   //Output string
        Scanner scan = new Scanner(System.in);               //Reads user input
        
        //************************ BEGIN readString ***************************
        
        //Read user input and store as str
        str = scan.nextLine();
        
        //RETURN str
        return str;
        
    } //END readString
    
} //END class Common
