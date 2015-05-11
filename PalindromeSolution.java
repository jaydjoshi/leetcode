/*

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.
*/


public class PalindromeSolution {
    public boolean isPalindrome(String s) {
        if(s == null)
            return false;
        if((s.trim()).equals("") || s.length() == 1)
            return true;
        s = s.toLowerCase();
        char ch[] = s.toCharArray();
        char chr[] = null;
        int len=0;
        int j=0;

        for (int i = 0; i < ch.length; i++) {
			if((ch[i]>='a' && ch[i]<='z') || (ch[i]>='0' && ch[i]<='9'))
			{
				len++;
			}
		}
        chr=new char[len];
        for (int i = 0; i < ch.length; i++) {
        	if((ch[i]>='a' && ch[i]<='z') || (ch[i]>='0' && ch[i]<='9'))
			{
				chr[j] = ch[i];
				j++;
			}
		}
        
        s=new String(chr);
        StringBuffer s1 = new StringBuffer(s);
        s1.reverse();
        StringBuffer s2 = new StringBuffer(s);
        return (s1.toString().equals(s2.toString()));

        
    }
}
