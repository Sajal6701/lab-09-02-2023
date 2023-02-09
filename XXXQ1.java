package sajal.one;

import java.util.Scanner;

public class XXXQ1 {
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String");

		String str = sc.nextLine();


		String str2 = "";

		for (int i = 0; i < str.length() - 4; i++) 
		{

		str2 += "X";

		}

		str2 += str.substring(str.length() - 4);

		System.out.println(str2);

		}

}
