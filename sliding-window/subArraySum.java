
// Subarray Sum Equals K
// Solved
// Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
// A subarray is a contiguous non-empty sequence of elements within an array.

// Example 1:
// Input: nums = [1,1,1], k = 2
// Output: 2

// Example 2:
// Input: nums = [1,2,3], k = 3
// Output: 2


public class subArraySum {

    public static int solution(int k, int[] nums) {

        int total = 0;
        int current = 0;   // store the current sum

        int windowStart = 0; 
        for(int windowEnd = 0; windowEnd < nums.length; windowEnd++){
            
            current += nums[windowEnd];

            while(current > k){               // while the current sum is greater than k, reduce window from the left 
                current -= nums[windowStart];
                windowStart++;
            }
            if(current == k){
                total++;
            }
        }

        return total;

    }

    public static void main(String[] args ){

        int[] nums = {1, 1, 1};
        int k = 2;

        System.out.println(solution(k, nums));

    }
}



    
