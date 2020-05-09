package week1.day2;

public class ChangeOddtoUpper {

	public static void main(String[] args) {
		String test = "changeme";
		
		char[] charArray = test.toCharArray();
		
		for(int i=0 ; i< charArray.length; i++)
		{
			char chai = test.charAt(i);
			if(i%2 != 0)
			{
			System.out.print(Character.toUpperCase(chai));
			}
			else
				System.out.print(Character.toLowerCase(chai));

		}
		
		

	}

	
		
	}


