package practice;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Practice2 {

	public static void main(String[] args) {




//Create scanner to obtain user input
		         @SuppressWarnings("resource")
				Scanner scanner1 = new Scanner( System.in );

		        //obtain user input
		         System.out.print("Enter your first name: ");
		         String firstName = scanner1.nextLine();

		         System.out.print("Enter your last name: ");
		         String lastName = scanner1.nextLine();
		         System.out.println(firstName);
		         System.out.println(lastName);
		        //output information
		        JOptionPane.showMessageDialog(null, "firstname: "+ firstName + ", lastname: "+ lastName);
		    }
}
