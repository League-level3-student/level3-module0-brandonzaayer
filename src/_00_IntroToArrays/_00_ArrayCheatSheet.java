package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] five = {"1", "2", "3", "4", "5"};
		//2. print the third element in the array
		System.out.println(five[2]);
		//3. set the third element to a different value
		five[2] = "Three";
		//4. print the third element again
		System.out.println(five[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0; i < 5; i++) {
			System.out.println(five[i]);
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < five.length; i++) {
			System.out.println(five[i]);
		}
		//7. make an array of 50 integers
		int[] fifty = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		for(int i = 0; i < fifty.length; i++) {
			Random r = new Random();
			fifty[i] = r.nextInt(50);
		}
		//9. without printing the entire array, print only the smallest number on the array
		int lowest = 50;
		System.out.println("Small Value");
		for (int i = 0; i< fifty.length; i++) {
			if (fifty[i] < lowest) {
				lowest = fifty[i];
		   }
		}
		System.out.println(lowest);
		//10 print the entire array to see if step 8 was correct
		for(int i = 0; i < fifty.length; i++) {
			System.out.println(fifty[i]);
		}
		//11. print the largest number in the array.
		int highest = 0;
		System.out.println("Highest Value");
		for (int i = 0; i< fifty.length; i++) {
			if (fifty[i] > highest) {
				highest = fifty[i];
		   }
		}
		System.out.println(highest);
		//12. print only the last element in the array
		System.out.println(fifty[49]);
	}
}
