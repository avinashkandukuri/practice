package practice;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Elesespecial {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);

		String family_name;
		String Given_name;
		int x = input.nextInt();
		JOptionPane.showInputDialog("enter the markes");

		if (x >= 90) {

			family_name = JOptionPane.showInputDialog("Family Name");

			Given_name = JOptionPane.showInputDialog("Given Name");
			JOptionPane.showMessageDialog(null,  family_name + " \n" + Given_name + " \n Your grade is A " + " \n Good, keep it up" + "  \n "  
					+ JOptionPane.PLAIN_MESSAGE);
		} else if (x >= 80) {
			family_name = JOptionPane.showInputDialog("Family Name");

			Given_name = JOptionPane.showInputDialog("Given Name");
			JOptionPane.showMessageDialog(null,
					"Your grade is B " + "Good, " + family_name + " " + Given_name + JOptionPane.PLAIN_MESSAGE);

		} else if (x >= 70) {
			family_name = JOptionPane.showInputDialog("Family Name");

			Given_name = JOptionPane.showInputDialog("Given Name");
			JOptionPane.showMessageDialog(null,
					"Your grade is A " + " Not bad, " + family_name + " " + Given_name + JOptionPane.PLAIN_MESSAGE);
		} else if (x >= 60) {
			family_name = JOptionPane.showInputDialog("Family Name");

			Given_name = JOptionPane.showInputDialog("Given Name");
			JOptionPane.showMessageDialog(null, "Your grade is D " + " You can do it better "+ family_name + " "
					+ Given_name + JOptionPane.PLAIN_MESSAGE);
		} else {
			family_name = JOptionPane.showInputDialog("Family Name");

			Given_name = JOptionPane.showInputDialog("Given Name");
			JOptionPane.showMessageDialog(null, "Your grade is F " + " Never get down " + family_name + " " + Given_name
					+ JOptionPane.PLAIN_MESSAGE);
		}

	}

}

// TODO Auto-generated method stub
