// iven an integer array nums of length n and an integer target,
//  find three integers in nums such that the sum is closest to target.
// Return the sum of the three integers.

// You may assume that each input would have exactly one solution.

public class threeSumClosest{
    
    //basically threeSum but with slight change
    //after we find the sum of three numbers, we calculate the differentce with target
    //we then continually update the minSum according to the minDiff 
    //O(N^2)

    public static int solution(int[] nums, int target){

        // Arrays.sort(nums);

        int minDiff = Integer.MAX_VALUE;
        int minSum = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){

            int left = i + 1;
            int right = nums.length-1;

            while(left < right){

                int sum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(target - sum);
                
                if(diff < minDiff){  
                    minSum = sum;
                    minDiff = diff;
                }

                if(sum < target)
                    left++;
                else if(sum == target){
                    return minSum;
                }
                else
                    right--;

            }

        }

        return minSum;

    }


    public static void main(String[] args){

    }
    
}