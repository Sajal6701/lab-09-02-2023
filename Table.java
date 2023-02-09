package sajal.one;

public class Table {
	public static void main(String[] args)
	{
		
		String[] names = {"Peter", "Amy", "John", "Boyd", "Cathy"};
		int[] values = {15, 9, 14, 10, 12};
		
		System.out.println("Name\tValue");
		
		for(int i = 0; i < names.length; i++) 
		
			System.out.println(names[i] + "\t" + values[i]);
		
	}

}
