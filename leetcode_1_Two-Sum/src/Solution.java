
public class Solution {
	public static int[] twoSum(int[] nums, int target) {
    	int[] result = new int[2];
    	for (int i = 0; i < nums.length; i++) {
    		result[0] = i+1;
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == target - nums[i]&&i != j)
				{ 
					result[1] = j+1;
					return  result;}
			}
		}
		return result;
        
    }
/*This is test code*/    
    public static void main(String[] args) {
		int[] test = {2, 7, 11, 15};
		int target = 9;
		int[] result = twoSum(test, target);
		
		for (int i : result) {
			System.out.println(i);
		}
	
    } 
		
	
}