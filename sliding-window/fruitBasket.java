import java.util.HashMap;

public class fruitBasket {

    public static int solution(int[] fruits){

        HashMap<Integer, Integer> map = new HashMap<>(); // to store frequency of fruits 
        int max = Integer.MIN_VALUE;

        int windowStart = 0;
        for(int windowEnd = 0; windowEnd < fruits.length; windowEnd++){

            int fruit = fruits[windowEnd];
            map.put(fruit, map.getOrDefault(fruit, 0) + 1);

            while(map.size() > 2){      // while there are more than 2 types of fruits, reduce the window
                map.put(fruits[windowStart], map.get(fruits[windowStart]) - 1);
                if(map.get(fruits[windowStart]) == 0)  // edge-case, remove fruit when reducing window to avoid
                                                        // null pointer exception
                    map.remove(fruits[windowStart]);
                windowStart++;
            }

            max = Math.max(max, windowEnd - windowStart + 1);

        }

        return max;
    }

    public static void main(String[] args ){

        int[] nums = {1, 2, 3, 2, 2};
        System.out.println(solution(nums));

    }

}
