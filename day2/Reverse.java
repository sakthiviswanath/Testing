package week1.day2;

public class Reverse {

	public static void main(String[] args) {

		String test = "feeling good";

		char[] charArray = test.toCharArray();
		
		for(int i = charArray.length -1 ; i>=0 ; i--)
			
		{
				System.out.print(charArray[i]);
		}
	}

}
