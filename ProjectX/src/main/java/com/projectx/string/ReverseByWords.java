package com.projectx.string;

public class ReverseByWords {
	
	public static void main(String[] args) {
		
		System.out.println("reverse is >>" + reverse("This is an example"));
		
	}

	private static String reverse(String string) {

		StringBuilder currentWord = new StringBuilder();
		StringBuilder reverse = new StringBuilder();
		for(int i = 0; i < string.length(); i++)
		{
			
			if(string.charAt(i)==' ' || i ==string.length() -1)
			{
				if(i ==string.length() -1)
					currentWord.append(string.charAt(i));
				
				reverse.append(currentWord.reverse() + " ");
				currentWord = new StringBuilder();
			}
			else
				currentWord.append(string.charAt(i));
				
				
		}
		
		return reverse.toString();
		
	}



}
