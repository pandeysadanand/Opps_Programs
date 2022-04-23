package com.bl.deckOfCards;

import java.util.Random;

/*
 * this program is for distributing 36 cards among 4 players
 * @author : Sadanand Pandey
 */
public class DeckOfCards {

	public static void main(String[] args) {
		String[] suits = { "Clubs", "diamonds", "hearts", "spades" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace" };
		String[] cardArray = new String[52];
		int start = 0, end = 12, j1 = 0;
		Random random = new Random();
		/*
		 * combining suits and ranks
		 */
		for (int i = 0; i < 4; i++) {
			for (int j = start; j <= end; j++) {
				cardArray[j] = suits[i] + " " + ranks[j1];
				j1++;
			}
			j1 = 0;
			start = end + 1;
			end += 13;
		}
		/*
		 * printing all cards
		 */
		for (int i = 0; i < cardArray.length; i++) {
			System.out.println(cardArray[i] + " ");
		}
		/*
		 * Shuffling all cards
		 */

		for (int i = 0; i < 52; i++) {
			int num1 = random.nextInt(51);
			int num2 = random.nextInt(51);
			if (num1 != num2) {
				String temp = cardArray[num1];
				cardArray[num1] = cardArray[num2];
				cardArray[num2] = temp;
			}
		}
		System.out.println("=============================");

		/*
		 * printing cards of all 4 players
		 */
		int j2 = 0;
		for (int i = 1; i <= 4; i++) {
			System.out.print("For player " + i + " :\n");
			System.out.println("----------");
			for (int j = 0; j < 9; j++) {
				System.out.println("   " + cardArray[j2] + " ");
				j2++;
			}
			System.out.println();
		}
	}
}
