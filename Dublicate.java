package sajal.one;

import java.util.Scanner;

public class Dublicate {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter a String");

			String str = sc.nextLine();

			char[] inp = str.toCharArray();

			System.out.println("Dublicate Characters :");

			for (int i = 0; i < str.length(); i++)
			{

				for (int j = i + 1; j < str.length(); j++)
				{

					if (inp[i] == inp[j]) 
					{

						System.out.println(inp[j]);

					}

				}

			}

	}

}
