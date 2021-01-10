package school;
import java.util.Random;
import java.util.Scanner;

public class Module4 {

	public static int[] flags = new int[99999999];
	
	public static void main(String[] args) {
		userInput();
	}//main
	
	public static void userInput() {
		System.out.println("What do you want to do? Type 'get any ID' for a random ID; type 'request specific ID' to request a specific ID; type 'exit' to quit.");
		Scanner s = new Scanner(System.in);
		String userinput1 = s.nextLine();
		if (userinput1.contains("get any ID")) {
			System.out.println("Your ID is: "+getNumber());
			userInput();}
		else if (userinput1.contains("request specific ID")) {
			System.out.println("Enter an integer: ");
			int IDrequest = Integer.parseInt(s.nextLine());
			if (requestNumber(IDrequest)) {
				System.out.println("Congratulations! Your ID is: "+IDrequest);
				userInput();}
			else {
				System.out.println("That ID is already reserved.  Your ID is: "+getNumber());
				userInput();}
		}//if
	else if (userinput1.contains("exit")) { 
			s.close();
			return;}
	else {
		System.out.println("Huh??");
		userInput();
	}
		s.close();
	}//userInput
	
	public static int getNumber() {
		Random rand = new Random();
		int id = rand.nextInt(100000000);
		while (flags[id] ==1) {
			id = rand.nextInt(100000000);
		}
		flags[id] = 1;
		return id;
	}//getNumber
	
	public static boolean requestNumber (int request) {
		if (flags[request] == 1)
			return false;
		else {
			flags[request] = 1;
			return true;
		}//else
	}//requestNumber

	//string search algorithms
	
	//brute force search caller
	public static int bruteForceSearchCaller(String text, String pattern) {
		return bruteForceSearch(text.toCharArray(), pattern.toCharArray());
	}//BFS caller
	
	//brute force search
	public static int bruteForceSearch(char[] text, char[] pattern) {
		int i = 0, j = 0;
		final int n = text.length;
		final int m = pattern.length;
		while (i <=n-m) {
			j=0;
			while(j < m && pattern[j] == text[i+j]) {
				j++;
			}//inner while
			if (j==m) {
				return (i);
			}//if
			i++;
		}//outer while
		return -1;
	}//BFS
} //Module 4


