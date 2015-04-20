package test.leetcode;

public class RotateArray {
	
	public static int[] rotate(int[] nums, int k) {
        for(int i = 0; i<k ; i++){
        	nums = rotateBy1(nums);
        }
        return nums;
    }
	
	public static int[] rotateBy1(int[] nums){
		int len = nums.length;
		int temp= nums[0];
		for(int i = 0 ; i<len-1 ; i++)
		{
			nums[i]=nums[i+1];
		}
		nums[len-1]=temp;
		
		return nums;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in= {1,2,3,4,5,6};
		int[] result = null;
		for (int i = 0; i < in.length; i++) {
			System.out.print(" "+in[i]);
		}
		System.out.println();
		
		result = rotate(in,4);
		for (int i = 0; i < in.length; i++) {
			System.out.print(" "+result[i]);
		}
		System.out.println();
		
	}

}
