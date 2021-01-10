package school;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

public class Module5 {
	public static void main(String[] args) {
		System.out.println("Current Date and Time:");
    	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd, yyyy \nHH:mm");  //create date format object 
    	LocalDateTime timestamp = LocalDateTime.now();  //create timestamp object
        System.out.println(dtf.format(timestamp));
		System.out.println("Welcome! Enter your first name:");
		Scanner s = new Scanner(System.in);
		String fName = s.nextLine();
		System.out.println("Enter your last name:");
		String lName = s.nextLine();
		String UserFullName = fName+" "+lName;
		System.out.println("Hello "+UserFullName);
		System.out.println("Your name is "+UserFullName.length()+" characters long.");
		System.out.println("Uppercase: "+UserFullName.toUpperCase());
		System.out.println("Lowercase: "+UserFullName.toLowerCase());
		String lowercase = UserFullName.toLowerCase();
		char[] nameArray = lowercase.toCharArray();
		int vowels = 0;
		int consonants = 0;
		for (char x: nameArray) {
			if(x =='a' || x=='e'||x=='i'||x=='o'||x=='u')
				vowels++;
			else 
				consonants++;
		}//for
		System.out.println("Number of vowels: "+vowels);
		System.out.println("Number of consonants: "+(consonants-1));
		String text = "I am a very good student who works hard";
		System.out.println(text);
		System.out.println("Character at position 10 of above string: "+text.charAt(10));
		System.out.println("The word 'good' begins at position "+text.indexOf('d')+"and ends at position "+text.indexOf('d'));
		System.out.println("Enter the word 'Excellent'.");
		String word = s.nextLine();
		if (word.contains("Excellent"))
			System.out.println("Nice!!");
		else
			while (word != "Excellent") { 
			System.out.println("Incorrect :( Try again.");
			word = s.nextLine();
			}//while
		s.close();
	}//main

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
	
		//Binary Search
		
	class Node {
		String value;
		int count;
		Node lChild;
		Node rChild;
	} //Node
		
	Node root = null;
	
	boolean find(String value) {
		boolean ret = find(root, value);
		System.out.println("Find" + value + "Return" + ret);
		return ret;
	} //find
	
	boolean find(Node curr, String value) {
		int compare;
		if (curr == null)
			return false;
		compare = curr.value.compareTo(value);
		if (compare == 0)
			return true;
		else {
			if (compare == 1)
				return find(curr.lChild, value);
			else
				return find(curr.rChild, value);
		}//else
	} //find
	
	//ternary search
	class TSTNode{
		char data;
		boolean isLastChar;
		TSTNode left, equal, right;
	
		private void TSTNode (char d) {
		data = d;
		isLastChar = false;
		left = equal = right  = null;
		}//constructor
	} //TSTNode
	
	private boolean TSTFind(TSTNode current, String word, int wordIndex) {
		if (current ==null)
			return false;
		if (word.charAt(wordIndex) < current.data)
			return TSTFind(current.left, word, wordIndex);
		else if (word.charAt(wordIndex) > current.data)
			return TSTFind(current.right, word, wordIndex);
		else {
			if (wordIndex == word.length() - 1)
				return current.isLastChar;
			return TSTFind(current.equal, word, wordIndex +1);
			}//else
	}//TSTFind
	
}//Module5
