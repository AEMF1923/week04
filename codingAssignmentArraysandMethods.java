package week04;

public class codingAssignmentArraysandMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		       int [] ages = {3, 9, 23, 64, 2, 8, 28, 93}; 
		
//		a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		
		       System.out.println("Question 1a: ");
		       System.out.println(ages[0] - ages[ages.length-1]);
		       
//		b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		       System.out.println("Question 1b: ");
		       System.out.println("I thought you couldn't add another integer an array because it is fixed");
		       
		       
//		c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		       System.out.println("Question 1c: ");
		       int sumOfAges = 0; 
		       for (int numbers : ages) {
		    	   sumOfAges += numbers; 
		       } System.out.println("Total sum of Ages: " + sumOfAges);
		       System.out.println("Average of ages per the Array called Ages is : " + (sumOfAges/ages.length));
		
//		2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		       System.out.println("Question 2: ");
		       String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		       for(String n : names) {
		    	   System.out.println(n);
		       }
//		a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		       System.out.println("Question 2a: ");
		   //remember that in the enhanced for loop that variable that you make called name below goes throught each name and takes the 
		       //number of letters in each name. Name is a variable and you can use the .length() to count each individual letter
		       //the sum is += 
		       
			   int sumOfNames = 0;
			   for (String name : names) {
				   sumOfNames += name.length();
			}
			   System.out.println(sumOfNames);
		       System.out.println("Average of numbers of letters per name in the Array called Names is: " + (sumOfNames/names.length));
		       
//		b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		      
		       System.out.println("Question 2b: ");
		       
		       String concatNames = "";
		       for(int j = 0; j < names.length; j++) {
		    	   concatNames += names[j];
		    	   System.out.println(concatNames);
		       }
		       
//		3.	How do you access the last element of any array?
		       
		       System.out.println("Question 3: ");
		       System.out.println("Last element of the names array is: " + (names[names.length - 1]));
		
//		4.	How do you access the first element of any array?
		       
		       System.out.println("Question 4: ");
		       System.out.println("First element of the names array is " + names[0]);
		       
		       
//		5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		       System.out.println("Question 5: ");
		       
		      int[] nameLengths = new int[5];
		      for(int k = 0; k < nameLengths.length; k++) {
		    	  nameLengths[k] = k;
		    	  System.out.println(nameLengths[k]);
		      } 
		      
		       
//		6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		       
		       System.out.println("Question 6: ");
		       int sumOfNameLength = 0;
			   for (int n2 : nameLengths) {
				   sumOfNames += n2;
			}
			   System.out.println(sumOfNameLength);
		       
		       
//		7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
 //     (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		       
		       System.out.println("Question 7: ");
		       System.out.println(StringRepeat("Scout",10));
		       
//		8.	Write a method that takes two Strings, firstName and lastName, and returns a full name 
//          (the full name should be the first and the last name as a String separated by a space).
		       
		       System.out.println("Question 8: ");
		       
		       String nameMethod = FullName("Andi", "Moran Flores");
				System.out.println(nameMethod);
				
//		9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
//				System.out.println("Question 9: ");
//				int[] testArray = new int [5]; 
//				testArray[0] = 7; 
//				testArray[1] = 34; 
//				testArray[2] = 6; 
//				testArray[3] = 31; 
//				testArray[4] = 5; 
//				
//				boolean greater = isSumGreaterThan100(testArray);
//				System.out.println(greater);
				
//		10.	Write a method that takes an array of double and returns the average of all the elements in the array.
				System.out.println("Question 10: ");
				double[]AverageOfDoubles = {12.23, 11.59,9.36, 0.05, .50}; 
				
		        double average = averageOfArray(AverageOfDoubles);
				System.out.println(average);
				
//		11.	Write a method that takes two arrays of double and returns true if the average of the elements 
//          in the first array is greater than the average of the elements in the second array.
				
//				System.out.println("Question 11: ");
//				double[] doublearr1 = {12.23, 11.59,9.36, 0.05, .50}; 
//				double[] doublearr2 = {10.11, 11.50,142.36, 1.05, 2.50}; 
//				boolean avg = isFirstArrayLarger(doublearr1,doublearr2);
//				System.out.println(avg);
				
//		12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
//          and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
				System.out.println("Question 12: ");
				
//		13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
				System.out.println("Question 13: ");
				
				int Money = 10; 
				double taxes = 0.77;
				
				double whatistax = NMTaxRate(Money,taxes);
				System.out.println(whatistax);
				
	}

	
	// Method 07:
		public static String StringRepeat(String name, int num) {
			String repeating = ""; 
			for(int i =0; i < num; i++) {
				repeating += name;
			}
			return repeating; 
		}
		
		// Method 08:
		
				public static String FullName(String str1, String str2) {
					return str1 + " " + str2;
					
				}
				
		// Method 09:
				
//				public static boolean isSumGreaterThan100(int[] numArray) {
//					int sum = 0; 
//					for(int number : numArray) {
//						sum += number;
//					} if (sum > 100) {
//						return true;
//					} else (sum < 100) {
//						return false;
//					}
//					
//				}
		// Method 10:
				
				public static double averageOfArray(double[] avg) {
					double sum2 = 0;
					for(double number=0; number < avg.length; number++) {
						sum2 += number; 
					} return sum2/avg.length; 
					
				}
		// Method 11:
				
				public static boolean isFirstArrayLarger(double [] arr1, double[] arr2) {
					double sum1 = 0;
					double sum2 = 0; 
					for(double number=0; number < arr1.length; number++) {
						sum1 += number;
						double avg1 = sum1/arr1.length; 
					
				} 
					for (double num =0; num < arr2.length; num++) {
						sum2 += num;
						double avg2 = sum2/arr2.length;
					}
					return arr1 > arr2; 
				}  
					
						
		// Method 12:
				
				public static String willBuyDrink(boolean isHotOutside, double moneyInPocket) {
					if (isHotOutside == true && moneyInPocket > 10.50) {
						return true; 
					}
					else return false; 
				}
				
		// Method 13:
				
				public static double NMTaxRate(int dollarAmount, double NMtax) {
					double total = dollarAmount * NMtax; 
					 return total; 
				}
				
}
