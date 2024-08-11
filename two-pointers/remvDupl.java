// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
//The relative order of the elements should be kept the same.
// Then return the number of unique elements in nums.
// Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

// Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. 
//The remaining elements of nums are not important as well as the size of nums.
// Return k.




public class remvDupl{

    //[1, 1, 2, 2, 3]
    //since the numbers are sorted, all dublicate items will be next to each other
    //The first number is for sure not a duplicate 
    //so if we find a duplicate by comparing nums[i] & nums[i-1], 
    //store it on the left pointer, which increments only if we find a non-duplicate
    //this allows to store the numbers in order. 


    public static int solution(int[] nums){
        
        int left = 1;
        for(int i = 1; i < nums.length; i++){

            if(nums[i] != nums[i-1]){
                nums[left] = nums[i];
                left++;
            }
        }

        return left;

    }


    public static void main(String[] args){


    }
}




