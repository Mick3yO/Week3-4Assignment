package week4;

public class Week4Project {

	

		///1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		  public static void main(String[] args) {
		      int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

		
		
		////a.	Programmatically subtract the value of the first element in the array from the value in   
		////the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
		
		      int result = ages[ages.length - 1] - ages[0];
		         System.out.println(result);
		
		/////b.	Add a new age to your array and repeat the step above to ensure it is dynamic 
		///(works for arrays of different lengths).
		         int newAge = 18;
		         int[] newAges = new int[ages.length + 1];
		         System.arraycopy(ages, 0, newAges, 0, ages.length);
		         newAges[newAges.length - 1] = newAge;

		
		
		///c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		  
		         double sum = 0;
		            for (int age : newAges) {
		             sum += age;
		              }
		           double average = sum / newAges.length;
		            System.out.println(average);
		             }

}


		
		
	
	


