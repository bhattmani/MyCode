package MyPractise;

public class TwoSum {
	public static void main(String[] args){
		int a[] = {2,5,5,11};
		TwoSum sum = new TwoSum();
		int[] arr = sum.twoSum(a,10);
		for (int i = 0; i < arr.length; i++) {
			System.out.print( arr[i]+ " ");     
			}
	}

    public int[] twoSum(int[] nums, int target) {
    	boolean flag=false;
        int arr[] = new int[2];
        int len = nums.length;
        for(int i=0;i<len;i++){
            for(int j=1;j<len;j++){
    			System.out.println(" i value "+ i);     
    			System.out.println("j value "+ j);
    			if(i!=j){
	                if(nums[i]+nums[j]==target){
	                    arr[0] = i;
	                    arr[1] = j;
	                    flag = true;
	                    break;
	                }
    			}
            }
            if(flag){
            	break;
            }
        }
        return arr;
    }
}
