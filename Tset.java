package week4;

public class Tset {

	
		  public static void main(String[] args) {
		    // create names array
		    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		    
		    //.5 create nameLengths array
		    int[] nameLengths = new int[names.length];
		    
		    // iterate over names array and add lengths to nameLengths array
		    for (int i = 0; i < names.length; i++) {
		      nameLengths[i] = names[i].length();
		    }
		    
		    // 6. iterate over nameLengths array and calculate sum
		    int sum = 0;
		    for (int i = 0; i < nameLengths.length; i++) {
		      sum += nameLengths[i];
		    }
		    
		    // print result
		    System.out.println("sum of all elements: " + sum);
		  }
		

//7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).

     public static String concatenateWord(String word, int n) {
       StringBuilder result = new StringBuilder();
         for (int i = 0; i < n; i++) {
           result.append(word);
         }
          return result.toString();
          }

		
		
///8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
                    public static String getFullName(String firstName, String lastName) {
                    return firstName + " " + lastName;
                     }

//9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
                 public static boolean isSumGreaterThan100(int[] arr) {
                    int sum = 0;
                      for (int i : arr) {
                       sum += i;
                           }
                           return sum > 100;
                                }
//10.	Write a method that takes an array of double and returns the average of all the elements in the array.
                          public static double calculateAverage(double[] arr) {
                          double sum = 0;
                          for (double num : arr) {
                          sum += num;
                             }
                            double avg = sum / arr.length;
                      return avg;
                              }

//11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
                          public static boolean compareAverages(double[] array1, double[] array2) {
                        	    double average1 = 0;
                        	    double average2 = 0;

                        	    // Calculate average of first array
                        	    for (double num : array1) {
                        	        average1 += num;
                        	    }
                        	    average1 /= array1.length;

                        	    // Calculate average of second array
                        	    for (double num : array2) {
                        	        average2 += num;
                        	    }
                        	    average2 /= array2.length;

                        	    return average1 > average2;
                        	}

//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
                                  public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
                             return isHotOutside && moneyInPocket > 10.50;
                                  }

//13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
                         public static boolean isPalindrome(String str) {
               String reversed = new StringBuilder(str).reverse().toString();
                    return str.equals(reversed);
                          }
//The method takes a string as an argument and checks if it is a palindrome. Palindromes are fun 😊

                         }

