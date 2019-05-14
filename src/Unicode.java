
/*
 * Unit 1 Lab - Deliverable 2
 * @Author: Baraa S. Ali
 */

import java.util.Scanner;

public class Unicode {

	public static void main(String[] args) {

		/* Definition */
		String firstWord;
		String secondWord;
		char letter;
		int firstWordSum = 0, secondWordSum = 0;
		Scanner sc = new Scanner(System.in);

		/* Get the input */
		System.out.println("Please enter the 1st word:");
		firstWord = sc.nextLine();
		System.out.println("Please enter the 2nd word:");
		secondWord = sc.nextLine();

		/*
		 * parse the string, get the Unicode and calculate the sum of the words
		 * individually.
		 */
		/* 1st word */
		for (int index = 0; index < firstWord.length(); index++) {
			letter = firstWord.charAt(index);
			firstWordSum = firstWordSum + (int) letter;
		}
		/* 2nd word */
		for (int index = 0; index < secondWord.length(); index++) {
			letter = secondWord.charAt(index);
			secondWordSum = secondWordSum + (int) letter;
		}
		if (secondWordSum > firstWordSum)
			System.out.println(secondWordSum - firstWordSum);
		else
			System.out.println(firstWordSum - secondWordSum);
	}

}
