package school;


/*****************************************************************************
* Class Name : Contact
* Author     : Joshua Chase
* Date       : 12/2/2020
* Description: Stores name, phone number, and job title for Contact info
* Constants  :
* Variables  : number : long
*              fName  : String
*              lName  : String
*              title  : String
* Methods    :
*   +Contact             :
*   +hashCode            : int
*   +equals              : boolean
*   +getNumber           : long
*   +setName             : void
*   +getName             : String
*   +setTitle            : void
*   +getTitle            : String
*   +getAreaCode         : int
*   +getExchangeCode     : int
*   +getSubscriberNumber : int
*   -formatNumber        : String
*   +toString            : String
******************************************************************************/

public class Contact 
{
    
    //Class Constants
    
    //Class Variables
    private long number  = 0;                                    //Phone number
    private String fName = "";                                   //First Name
    private String lName = "";                                   //Last Name
    private String title = "";                                   //Job Title

    /**************************************************************************
     * Method Name: +Contact
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : 
     * Description: Main constructor for Contact class, stores number, fName
     *              lName, and title
     * Args       : num       : long
     *              firstName : String
     *              lastName  : String
     *              jobTitle  : String
     * Constants  :
     * Variables  : 
     * Algorithm  :
     *  BEGIN Contact
     *      Store num as number
     *      Store firstName as fName
     *      Store lastName as lName
     *      Store jobTitle as title
     *  END Contact 
     *************************************************************************/
    public Contact(long num, String firstName, String lastName, String jobTitle)
    {
        
        //Local Constants
        
        //Local Variables
                
        //************************** BEGIN Contact ****************************
        
        //Store num as number
        number = num;
        
        //Store firstName fName
        fName = firstName;
        
        //Store lastName as lName
        lName = lastName;
        
        //Store jobTitle as title
        title = jobTitle;
        
    } //END Contact

    /**************************************************************************
     * Method Name: +Contact
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : 
     * Description: Alternate constructor for Contact class, stores firstName
     *              and lastName
     * Args       : firstName : String
     *              lastName  : String
     * Constants  :
     * Variables  : 
     * Algorithm  :
     *  BEGIN Contact
     *      Call main constructor with only firstName and lastName input
     *  END Contact 
     *************************************************************************/
    public Contact(String firstName, String lastName)
    {
        
        //Local Constants
        
        //Local Variables
                
        //************************** BEGIN Contact ****************************
        
        //Call main constructor with only firstName and lastName input
        this(0l, firstName, lastName, "");
        
    } //END Contact

    /**************************************************************************
     * Method Name: +Contact
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : 
     * Description: Alternate constructor for Contact class, stores only
     *              firstName
     * Args       : firstName : String
     * Constants  :
     * Variables  : 
     * Algorithm  :
     *  BEGIN Contact
     *      Call main constructor with only firstName input
     *  END Contact 
     *************************************************************************/
    public Contact(String firstName)
    {
        
        //Local Constants
        
        //Local Variables
                
        //************************** BEGIN Contact ****************************
        
        //Call main constructor with only firstName input
        this(0l, firstName, "", "");
        
    } //END Contact

    /**************************************************************************
     * Method Name: +hashCode
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : int
     * Description: Overrides hashCode method to compute hashCode based on
     *              Contact fullName
     * Args       : 
     * Constants  :
     * Variables  : hash     : int
     *              fullName : String
     * Algorithm  :
     *  BEGIN hashCode
     *      IF fullName not null
     *          Compute hash = 31 * hash + fullName hash code
     *      END IF
     *      RETURN hash
     *  END hashCode 
     *************************************************************************/
    public int hashCode()
    {
        
        //Local Constants
        
        //Local Variables
        int hash        = 7;                   //Hash code returned
        String fullName = lName + fName;       //String that computes hash code
                
        //************************* BEGIN hashCode ****************************
        
        //IF fullName not null
        if(fullName != null)
        {
            
            //Compute hash = 31 * hash + fullName hash code
            hash = 31 * hash + fullName.hashCode();
            
        } //END IF
        
        //RETURN hash
        return hash;       
        
    } //END hashCode

    /**************************************************************************
     * Method Name: +equals
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : boolean
     * Description: Overrides equals method to use full name as unique 
     *              identifier
     * Args       : o : Object
     * Constants  :
     * Variables  :
     * Algorithm  :
     *  BEGIN equals
     *      IF this is input object, RETURN true
     *      IF input object is null, RETURN false
     *      IF classes don't match, RETURN false
     *      Cast input object as Contact and store as con
     *      RETURN if full name from con matches this full name
     *  END equals 
     *************************************************************************/
    public boolean equals(Object o)
    {
        
        //Local Constants
        
        //Local Variables        
                
        //************************* BEGIN hashCode ****************************
        
        //IF this is input object, RETURN true
        if(this == o) return true;
        
        //IF input object is null, RETURN false
        if(o == null) return false;
        
        //IF classes don't match, RETURN false
        if(this.getClass() != o.getClass()) return false;
        
        //Cast input object as Contact and store as con
        Contact con = (Contact) o;
        
        //RETURN if full name from con matches this full name
        return getName() == con.getName();
        
    } //END equals

    /**************************************************************************
     * Method Name: +getNumber
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : long
     * Description: Returns number
     * Args       :
     * Constants  :
     * Variables  :
     * Algorithm  :
     *  BEGIN getNumber
     *      RETURN number
     *  END getNumber
     *************************************************************************/
    public long getNumber()
    {
        
        //Local Constants
        
        //Local Variables        
                
        //************************ BEGIN getNumber ****************************
        
        //RETURN number
        return number;
        
    } //END getNumber

    /**************************************************************************
     * Method Name: +setName
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : void
     * Description: Edits Contact name
     * Args       : firstName : String
     *              lastName  : String
     * Constants  :
     * Variables  :
     * Algorithm  :
     *  BEGIN setName
     *      Store firstName as fName
     *      Store lastName as lName      
     *  END setName
     *************************************************************************/
    public void setName(String firstName, String lastName)
    {
        
        //Local Constants
        
        //Local Variables        
                
        //************************* BEGIN setName *****************************
        
        //Store firstName as fName
        fName = firstName;
        
        //Store lastName as lName
        lName = lastName;
        
    } //END setName

    /**************************************************************************
     * Method Name: +getName
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : String
     * Description: Returns full Contact name
     * Args       : 
     * Constants  :
     * Variables  :
     * Algorithm  :
     *  BEGIN getName
     *      RETURN full Contact name 
     *  END getName
     *************************************************************************/
    public String getName()
    {
        
        //Local Constants
        
        //Local Variables        
                
        //************************* BEGIN getName *****************************
        
        //RETURN full Contact name
        return lName + ", " + fName;
        
    } //END getName

    /**************************************************************************
     * Method Name: +setTitle
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : void
     * Description: Edits Contact job title
     * Args       : jobTitle : String
     * Constants  :
     * Variables  :
     * Algorithm  :
     *  BEGIN setTitle
     *      Store jobTitle as title
     *  END setTitle
     *************************************************************************/
    public void setTitle(String jobTitle)
    {
        
        //Local Constants
        
        //Local Variables        
                
        //************************ BEGIN setTitle *****************************
        
        //Store jobTitle as title
        title = jobTitle;
        
    } //END setTitle

    /**************************************************************************
     * Method Name: +getTitle
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : String
     * Description: Returns job title
     * Args       :
     * Constants  :
     * Variables  :
     * Algorithm  :
     *  BEGIN getTitle
     *      RETURN title
     *  END getTitle
     *************************************************************************/
    public String getTitle()
    {
        
        //Local Constants
        
        //Local Variables        
                
        //************************ BEGIN getTitle *****************************
        
        //RETURN title
        return title;
        
    } //END getTitle

    /**************************************************************************
     * Method Name: +getAreaCode
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : int
     * Description: Computes and returns area code from number
     * Args       :
     * Constants  :
     * Variables  :
     * Algorithm  :
     *  BEGIN getAreaCode
     *      Find Area Code from number and return result
     *  END getAreaCode
     *************************************************************************/
    public int getAreaCode()
    {
        
        //Local Constants
        
        //Local Variables        
                
        //********************** BEGIN getAreaCode ****************************
        
        //Find Area Code from number and return result
        return Common.ACfromNumber(number);
        
    } //END getAreaCode

    /**************************************************************************
     * Method Name: +getExchangeCode
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : int
     * Description: Computes and returns exchange code from number
     * Args       :
     * Constants  :
     * Variables  :
     * Algorithm  :
     *  BEGIN getExchangeCode
     *      Find Exchange Code from number and return result
     *  END getExchangeCode
     *************************************************************************/
    public int getExchangeCode()
    {
        
        //Local Constants
        
        //Local Variables        
                
        //******************** BEGIN getExchangeCode **************************
        
        //Find Exchange Code from number and return result
        return Common.ECfromNumber(number);
        
    } //END getExchangeCode

    /**************************************************************************
     * Method Name: +getSubscriberNumber
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : int
     * Description: Computes and returns subscriber number from number
     * Args       :
     * Constants  :
     * Variables  :
     * Algorithm  :
     *  BEGIN getSubscriberNumber
     *      Find Subscriber Number from number and return result
     *  END getSubscriberNumber
     *************************************************************************/
    public int getSubscriberNumber()
    {
        
        //Local Constants
        
        //Local Variables        
                
        //****************** BEGIN getSubscriberNumber ************************
        
        //Find Subscriber Number from number and return result
        return Common.SNfromNumber(number);
        
    } //END getSubscriberNumber

    /**************************************************************************
     * Method Name: -formatNumber
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : String
     * Description: Computes and returns phone number in (xxx) xxx-xxxx format
     * Args       :
     * Constants  :
     * Variables  : phoneNumber : String
     * Algorithm  :
     *  BEGIN formatNumber
     *      Format number in (xxx) xxx-xxxx format and store as phoneNumber
     *      RETURN phoneNumber
     *  END formatNumber
     *************************************************************************/
    private String formatNumber()
    {
        
        //Local Constants
        
        //Local Variables
        String phoneNumber = "";                          //Output phone number        
                
        //********************* BEGIN formatNumber ****************************
        
        //Format number in (xxx) xxx-xxxx format and store as phoneNumber
        phoneNumber = "(" + getAreaCode() 
                          + ") " 
                          + getExchangeCode() + "-" 
                          + getSubscriberNumber();        
        
        //RETURN phoneNumber
        return phoneNumber;
        
    } //END formatNumber

    /**************************************************************************
     * Method Name: +toString
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : String
     * Description: Formats contact card output
     * Args       :
     * Constants  :
     * Variables  : output : String
     * Algorithm  :
     *  BEGIN toString
     *      Format contact card and save as output
     *      RETURN output
     *  END toString
     *************************************************************************/
    public String toString()
    {
        //Local Constants
        
        //Local Variables
        String output = "";                                     //Output string        
                
        //*********************** BEGIN toString ******************************
        
        //Format contact card and save as output
        output = "Name        : " + fName + " " + lName 
             + "\nTitle       : " + title
             + "\nPhone Number: " + formatNumber()
             + Common.border();
        
        //RETURN output
        return output;                
        
    } //END toString
    
} //END class Contact
