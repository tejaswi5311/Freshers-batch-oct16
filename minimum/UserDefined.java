package minimum;

import java.util.Scanner;

public class UserDefined {
	static double current_balance=2000;

	public static void main(String[] args) throws MinimumAccountBalance {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter amount to withdrawal");
		int n = s.nextInt();
		try {
			if(current_balance < n) {
				throw new MinimumAccountBalance("Insufficient Balance"+current_balance);
			} else {
				System.out.println("Please take the money"+n);
			}
	}catch (MinimumAccountBalance mab) {
			mab.printStackTrace();
			}
	}
		

}


