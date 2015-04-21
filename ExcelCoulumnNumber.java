package test.leetcode;

public class ExcelCoulumnNumber {
	
	 public static int titleToNumber(String s) {
		    if(s==null || s.length() == 0){
		        return -1;
		    }
		 
		    int result = 0;
		    int i = s.length()-1;
		    int t = 0;
		    while(i >= 0){
		        char curr = s.charAt(i);
		        result = result + (int) Math.pow(26, t) * (curr-'A'+1);
		        t++;
		        i--;
		    }
		 
		    return result;
		    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(titleToNumber("BA"));
	}

}
