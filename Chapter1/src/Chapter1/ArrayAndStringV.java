package Chapter1;
import java.util.HashMap;
import javax.swing.text.AbstractDocument.LeafElement;

public class ArrayAndStringV {

	public ArrayAndStringV(){
		//Default constructor
	}
	
	//Special Problem
	//Write a method that can reserve number. Note: cant use data structure or convert into string at all
	
	/**
	 * @param int number
	 * @return int
	 **/
	
	public int reverseNumber(int number)
	{
		if(number < 0)
			return number;
		int result = 0;
		int remainder = 0;
		while(number > 0)
		{
			remainder = number % 10;
			number = number / 10;
			result = result * 10 + remainder;
		}
		
		return result;
	}
	
	public int reverseNumberRecursive(int number, int result)
	{
		if(number == 0)
		{
			return result + number;
		}
		int remainder = number % 10;
		return (reverseNumberRecursive(number / 10, result * 10 + remainder));
	}
	
	
	// Problem 1
	//Implement an algorithm to determine if a sting has all unique character. 
	//What if you cannot use additional data structure ?
	
	//Assume the string is an ASCII string or a Unicode String.
	//ASCII (American Standard Code for Information Interchange boolean[] char_set = new boolean [256]; 2^8
	//UniCode boolean[] char_set = new boolean [65536]; 2^16
	//Let solve ASCII case. The Unicode case is the same just different boolean char_set size
	
	/**
	 * @param String str
	 * @return boolean
	 **/
	public boolean isUniqueChars(String str) 
	{
		if(str.length() > 256)
			return false;
		
		boolean[] char_set = new boolean [256];
		
		for(int i = 0; i < str.length(); i++)
		{
			int val = str.charAt(i);
			if(char_set[val] == true)
				return false;
			char_set[val] = true;
		}
		
		return true;
	}
	
	//Problem 2
	//Implement a function to reverse a string
	public String reverse(String str)
	{
		if(str.length() < 2)
			return str;
		int head = 0;
		int tail = str.length()-1;
		char[] result = str.toCharArray();
		while(head < tail)
		{
			char temp = result[head];
			result[head] = result[tail];
			result[tail] = temp;
			head++;
			tail--;
		}
		return new String(result);
	}
	
	public String recursiveReverse(String str)
	{
		if(str.length() < 2)
			return str;
		
		return str.charAt(str.length()-1) + recursiveReverse(str.substring(0, str.length()-1));
	}
	
	//Problem 3
	//Given 2 string, write a method to decide if one is permutation of other.
	public boolean isPermutation(String str1, String str2)
	{
		if(str1.length() != str2.length())
			return false;
		HashMap<Character, Integer> permutation = new HashMap<Character, Integer>();
		for (int i = 0; i < str1.length(); i++)
		{
			if(permutation.containsKey(str1.charAt(i)) == true)
			{
				int value = permutation.get(str1.charAt(i));
				permutation.put(str1.charAt(i),  ++value);
			}
			else	
			{
				permutation.put(str1.charAt(i), 1);
			}
		}
		
		
		for (int j = 0; j < str2.length(); j++)
		{
			if(permutation.containsKey(str2.charAt(j)) == true)
			{
				int value = permutation.get(str2.charAt(j));
				if(value == 0)
					return false;
				permutation.put(str2.charAt(j),  --value);
			}
			else	
			{
				return false;
			}
		}
		
		return true;
	}
	
	
	
	//Problem 4
	// Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient
	// space at the end of the string to hold the additional characters, that you are given the true length of the string.
	// Note that if implement in java, please use a character array so that you can perform this operation in place.
	// Example Input "Mr John Smith   ". Output: "Mr%20John%20Smith"
	
	public String replaceSingleSpace(char [] str, int length) //Replace single space with %20
	{
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < length; i++)
		{
			if(str[i] == ' ')
			{
				result.append("%20");
			}
			else
			{
				result.append(str[i]);
			}
		}
		
		return result.toString();
	}
	
	public String replaceAllSpace(char [] str, int length) //Replace all the space in between with %20
	{
		StringBuilder result = new StringBuilder();
		int i = 0;
		while(i < length)
		{
			if(str[i] == ' ')
			{
				i++;
				while(str[i] == ' ')
				{
					i++;
				}
				result.append("%20");
			}
			else
			{
				result.append(str[i]);
				i++;
			}
		}
		
		return result.toString();
	}
	
	//Problem 5 
	//Implement a method to perform basic string compression using the counts of repeated characters. 
	//For example, the string aabcccccaaa would become a2b1c5a3. If the compressed string would not become smaller
	//than the original string, your method should return the original string.
	
	//aabcccccaaa -> a2b1c5a3
	public String compressString(String str) //Assume first character in the string alway is a letter
	{
		StringBuilder result = new StringBuilder();
	    if(str.length() == 0)
	    {
	        return str;
	    }
	    else if(str.length() == 1)
	    {
	        return str + "1";
	    }
	    else
	    {
	        int i = 1; 
	        char currentChar = str.charAt(i);
	        result.append(currentChar);
	        int count = 1;
	        while(i < str.length())
	        {
	            if(currentChar == str.charAt(i))
	            {
	                count++;
	            }
	            else
	            {
	                result.append(count);
	                currentChar = str.charAt(i);
	                result.append(currentChar);
	                count = 1;
	            }
	            i++;
	            if(i >= str.length())
	            {
	                result.append(count);
	            }
	        }
	    
	    }
	    
	    return result.toString();
	}
	
	
	
}

