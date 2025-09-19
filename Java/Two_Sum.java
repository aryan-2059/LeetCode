// create a java program to solve two sum problem
//package Java;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
        System.out.print("Enter the list of numbers (comma separated): ");
        String[] numStrings = scanner.nextLine().split(",");
        int[] my_nums = new int[numStrings.length];
        for (int i = 0; i < numStrings.length; i++) {
            my_nums[i] = Integer.parseInt(numStrings[i].trim());
        }
        System.out.print("Enter the target sum: ");
        int my_target = scanner.nextInt();
        scanner.close();
        
        Solution solver = new Solution();
        int[] result = solver.twoSum(my_nums, my_target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
    }
}