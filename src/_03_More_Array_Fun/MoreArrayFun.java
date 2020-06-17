package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] five = {"1", "2", "3", "4", "5"};
		printArray(five);
		printBackwards(five);
		printEveryOther(five);
		printRandom(five);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void printArray(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			}
		}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void printBackwards(String[] arr) {
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
			}
		}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void printEveryOther(String[] arr) {
		for(int i = arr.length; i > 0; i--) {
			if(i % 2 == 0) {
				System.out.println(arr[i]);
			}
			}
		}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void printRandom(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			Random r = new Random();
			int rand = r.nextInt(arr.length);
			System.out.println(arr[rand]);
			}
		}
	
}
