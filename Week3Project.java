package week4;

public class Week3Project {

	public static void main(String[] args) {
		//////2.	Create an array of String called names that contains the following values: 
		//“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		 
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		 ////////////a.	Use a loop to iterate through the array and calculate 
		//the average number of letters per name. Print the result to the console.
		
		   int totalLetters = 0;
	         for (String name : names) {
	          totalLetters += name.length();
	           }
	          double average = (double) totalLetters / names.length;
	         System.out.println(average);
	         
	         /////////////b.	Use a loop to iterate through the array again and concatenate all the names together, 
	 		/////////////separated by spaces, and print the result to the console.
		 
	         String allNames = String.join(" ", names);
             System.out.println(allNames);
	}

}
