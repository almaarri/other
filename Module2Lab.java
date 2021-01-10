package test;

import java.util.*;

public class Module2Lab {
    public static void main(String args[]) {
	String[] items = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
	LinkedList<String> Rainbow = new LinkedList<String>();
	for(String x: items)
		Rainbow.add(x);
	System.out.println("Number of items:" + Rainbow.size());
	for(String x: Rainbow)
		System.out.printf("%s ", x);
		System.out.println();
	
	//add something to head
	System.out.println("Input item to add at the head of the list:");
	String addtohead;
	Scanner userinput1 = new Scanner(System.in);
	addtohead = userinput1.nextLine();
	Rainbow.addFirst(addtohead);
	for(String x: Rainbow)
		System.out.printf("%s ", x);
		System.out.println();
		
	//add something to end
	System.out.println("Input item to add at the end of the list:");
	String addtoend;
	Scanner userinput2 = new Scanner(System.in);
	addtoend = userinput2.nextLine();
	Rainbow.addLast(addtoend);
	for(String x: Rainbow) 
			System.out.printf("%s ", x);
	System.out.println();
	removeStuff(Rainbow); //remove items from list
    whatNow(Rainbow); //ask user what they want to do now
    userinput1.close();
    userinput2.close();
    
    } //main
   
    
	//remove an item
	public static void removeStuff(Collection<String> inputList) {
	System.out.println("Input item to remove from list:");
	String remove;
	Scanner userinput3 = new Scanner(System.in);
	remove = userinput3.nextLine();
	if (inputList.contains(remove) && inputList.size()>0) {
		inputList.remove(remove);
		for(String x: inputList)
			System.out.printf("%s ", x);
			System.out.println();
		whatNow(inputList);
	} //end if
	else 
		System.out.println("Error! Item not in list or list is empty!");
		whatNow(inputList);
	userinput3.close();
	}//removeStuff
     
	//ask user what they want to do now
    public static void whatNow(Collection<String> inputList) {
    	System.out.println("Type exit to quit the program; type continue to remove more elements");
    	String whatnow;
    	Scanner userinput4 = new Scanner(System.in);
    	whatnow = userinput4.nextLine();
    	System.out.println(whatnow);
    	if (whatnow.contains("exit")) {
    	    userinput4.close();
    		System.exit(0);}
    	else if (whatnow.contains("continue")) 
    		removeStuff(inputList);
    	else {
    		System.out.println("Huh??");
    		whatNow(inputList);
    	}//else
      userinput4.close();
    	}//whatNow
	}//Module2Lab
