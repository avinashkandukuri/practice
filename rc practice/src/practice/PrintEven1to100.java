package practice;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PrintEven1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers = new int[100];
		for (int i = 1; i <= 100; i++) {
		//	numbers.add(i);

			if (i % 2 == 0) {
				System.out.println("even number" + i);
			}
		}

	}

}
