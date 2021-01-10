package school;
import java.util.TreeMap;
import java.util.Set;

/*****************************************************************************
* Class Name : Directory (Tree Version)
* Author     : Alex Kovaka
* Date       : 12/2/2020
* Description: Stores Contacts in a TreeMap with full name as key
* Constants  :
* Variables  : dir : TreeMap<String, Contact>
* Methods    :
*   +Directory :
*   +insert    : void
*   +search    : void
*   +delete    : void
*   +toString  : String
******************************************************************************/

public class Directory
{

    //Local Constants
    
    //Local Variables
    TreeMap<String, Contact> dir;                    //Stores Contact entries

    /**************************************************************************
     * Method Name: +Directory
     * Author     : Alex Kovaka
     * Date       : 12/3/2020
     * Returns    : 
     * Description: Constructor for Directory class, instantiates 
     *              tree directory
     * Args       : 
     * Constants  :
     * Variables  : 
     * Algorithm  :
     *  BEGIN Directory
     *      Instantiate tree directory
     *  END Directory 
     *************************************************************************/
    public Directory()
    {
        
        //Local Constants
        
        //Local Variables
        
        
        //************************* BEGIN Directory ***************************
        
        //Instantiate TreeMap dir
        dir = new TreeMap<>();
        
    } //END Directory

    /**************************************************************************
     * Method Name: +insert
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : void
     * Description: Adds new Contact to directory
     * Args       : con : Contact
     * Constants  :
     * Variables  : 
     * Algorithm  :
     *  BEGIN insert
     *      Add new Contact to directory
     *  END insert 
     *************************************************************************/
    public void insert(Contact con)
    {
        
        //Local Constants
        
        //Local Variables
                
        //*************************** BEGIN insert ****************************
        
        //Add new Contact to directory
        dir.put(con.getName(),con);
        
    } //END insert

    /**************************************************************************
     * Method Name: +search
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : void
     * Description: Searches for Contact in directory and prints results
     * Args       : lName    : String
     *              fName    : String
     * Constants  :
     * Variables  : fullName : String
     * Algorithm  :
     *  BEGIN search
     *      IF hash table contains fullName key
     *          Print Contact
     *      ELSE
     *          Inform user Contact not found
     *      END IF
     *  END search 
     *************************************************************************/
    public void search(String lName, String fName)
    {
        
        //Local Constants
        
        //Local Variables
        String fullName = lName + ", " + fName;   //Full name from input as key
                        
        //*************************** BEGIN search ****************************
        
        //IF hash table contains fullName key
        if(dir.containsKey(fullName))
        {
            
            //Print Contact
            System.out.println(dir.get(fullName));
            
        } //end if
        
        //ELSE
        else
        {
            
            //Infom user Contact not found
            System.out.println("Contact not found!");
            
        } //END IF
        
    } //END search

    /**************************************************************************
     * Method Name: +delete
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : boolean
     * Description: Removes Contact from directory if they exist
     * Args       : lName    : String
     *              fName    : String
     * Constants  :
     * Variables  : fullName : String
     * Algorithm  :
     *  BEGIN delete
     *      IF hash table contains fullName key
     *          Remove Contact from directory
     *          Mark done as true
     *      ELSE
     *          Inform user Contact not found
     *      END IF
     *      RETURN done
     *  END delete 
     *************************************************************************/
    public boolean delete(String lName, String fName)
    {
        
        //Local Constants
        
        //Local Variables
        boolean done = false;                     //Marks completed delete
        String fullName = lName + ", " + fName;   //Full name from input as key
                        
        //*************************** BEGIN delete ****************************
        
        //IF directory contains fullName key
        if(dir.containsKey(fullName))
        {
            
            //Remove Contact from directory
            dir.remove(fullName);
            
            //Mark done as true
            done = true;
            
        } //end if
        
        //ELSE
        else
        {
            
            //Inform user Contact not found
            System.out.println("Contact not found!");
            
        } //END IF
        
        //RETURN done
        return done;
        
    } //END delete

    /**************************************************************************
     * Method Name: +toString
     * Author     : Joshua Chase
     * Date       : 12/2/2020
     * Returns    : String
     * Description: Removes Contact from directory if they exist
     * Args       :
     * Constants  :
     * Variables  : output : String
     * Algorithm  :
     *  BEGIN toString
     *      IF directory is empty
     *          Store empty message in output
     *      ELSE
     *          Add title and border to output
     *          Initialize directory keyset as names
     *          FOR each name in names keyset
     *              Add Contact from directory to output
     *          END FOR
     *      END IF
     *      RETURN output
     *  END toString 
     *************************************************************************/
    public String toString()
    {
        
        //Local Constants
        
        //Local Variables
        String output = "";                                     //Output string
                                
        //************************** BEGIN toString ***************************
        
        //IF directory is empty
        if(dir.isEmpty())
        {
            
            //Store empty message in output
            output = "\nDirectory is empty!";
            
        } //end if
        
        //ELSE
        else
        {
        
            //Add title and border to output
            output = "\nFull Directory\n"
                    + Common.border() + "\n";
            
            //Initialize directory keyset as names
            Set<String> names = dir.keySet();

            //FOR each name in names directory
            for(String name: names)
            {
                
                //Add Contact from hash table to output
                output += dir.get(name) + "\n";
                
            } //END FOR
            
        } //END IF
        
        //RETURN output
        return output;
        
    } //END toString
    
} //END class Directory