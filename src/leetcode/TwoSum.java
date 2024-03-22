package leetcode;

public class TwoSum {
    public static void main(String[] args) {
       int[] nums ={1,2,3,4,5};
       int target = 4;

        for(int i=0; i< nums.length; i++){
            for(int j= i+1; j < nums.length; j++){

                if(nums[i] + nums[j] == target){
                    System.out.print(nums[i] +"\t");
                    System.out.println(nums[j]);
                }
            }
        }
    }
}
