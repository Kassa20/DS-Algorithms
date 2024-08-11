// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
// such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

//Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]

// select a number, then find two other numbers that sum to it. 
// since the array is sorted, we can use the two-pointer method to find the other 
//two numbers with a while loop.

public class threeSum {
    
    public static List<List<Integer>> solution(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>(); // to remove duplicate triplets

        for(int i = 0; i < nums.length; i++){
            
            int left = i + 1;
            int right = nums.length-1;
            
            while(left < right){

                int threeSum = nums[i] + nums[left] + nums[right];
                if(threeSum == 0){
                    
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }

                else if(threeSum > 0)
                    right--;
                else
                    left++;
            }    

        }

        res.addAll(set);

        return res;

    }


    public static void main(String[] args){

    }



}
