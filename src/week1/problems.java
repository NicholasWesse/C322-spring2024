package week1;

public class problems {

    public static void main(String[] args) {
    }



    public static int[] problemOne(int[] nums, int target){
        int[] result = {0,0};
        for(int i=0; i<nums.length; ++i){
            for(int j=0; i<nums.length; ++i){
                if(i==j){
                    break;
                }
                else if(nums[i] +nums[j] == target){
                    result[1] = i;
                    result[0] = j;
                }
            }
        }
        return result;
    }

}
