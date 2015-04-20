package test.leetcode;

import java.util.Scanner;


 class CountAndSay {

    public static String countAndSay(int n) {
        String input="1";
		String output = null;
		if(n==1) return input;
        for(int i=1; i< n ; i++)
		{
			output = count(input);
			input = output;
		}
		return output;
        
    }
    public static  String count(String input)
	 {
		String output = "";
		int len = input.length();
		for(int i =0; i< len ; )
		{
			char num = input.charAt(i);
			int next = i;
			int count = 0;
			while(next < len && num== input.charAt(next ) )
			{
				next++;
				count++;
			}
			output += ""+ count+""+num; 
			i=i+count;
		}
		return output;
		 
	 }
    
    public static void main(String args[])
    {
    	System.out.println(countAndSay(5));
    	System.out.println(countAndSay(1));
    	System.out.println(countAndSay(3));
    }
}
