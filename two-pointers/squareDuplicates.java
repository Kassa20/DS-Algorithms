
public class squareDuplicates{

    // Given an integer array nums sorted in non-decreasing order, 
    // return an array of the squares of each number sorted in non-decreasing order.

    // Example 1:
    // Input: nums = [-4,-1,0,3,10]
    // Output: [0,1,9,16,100]

    //the extreme ends are for sure the larger values, so start storing the larger
    //values first in the new array stating from the back;


    public static int[] solution(int[] nums) {

        int[] res = new int[nums.length];

        
        int left = 0;
        int right = nums.length-1;
        int index = nums.length-1;


        while(left <= right){

            int num1 = nums[left] * nums[left];
            int num2 = nums[right] * nums[right];

            if(num2 > num1){
                res[index] = num2;
                right--;
            }
            else{
                res[index] = num1;
                left++;
            }

            index--;

        }    

        return res;
        
    }


    public static void main(String[] args){

    }

}