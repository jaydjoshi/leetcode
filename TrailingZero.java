package test.leetcode;

public class TrailingZero {
	
	public static int trailingZeroes(int n) {
		long fact = fact(n);
		int count=0;
		while(fact%10==0)
		{
			count++;
			fact= fact/10;
		}
		return count;
	        
	 }
	
	public static long fact(int n)
	{
		if(n==0 || n<0) return 1;
		if(n==1) return 1;
		else 
			return(n*fact(n-1));
	}
	
	public static int trailingZeroes1(int n) {
        int ret=0;
        while(true){
            n=n/5;
            ret+=n;
            if(n==0){
                break;
            }
        }
        return ret;
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 50; i++) {
			System.out.println("fact of "+i+" : "+fact(i)+" and zeros :"+trailingZeroes1(i));
		}
		
	}

}
