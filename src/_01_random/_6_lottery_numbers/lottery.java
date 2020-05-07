package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottery {
public static void main(String[] args) {
	Random rand = new Random();
	for (int i = 0; i < 7; i++) {
		int randomNumber= rand.nextInt(71);
		JOptionPane.showMessageDialog(null, randomNumber + " " + random);

	}
	
}
}
