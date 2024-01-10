package week1;

public class testDrive {

    public static void main(String[] args) {
        //test cases
        int testsPassed = 0;


        int[] nums = {2,7,11};
        int target = 9;
        int[] expected = {0,1};

        boolean firstTest = true;

        System.out.println(problems.problemOne(nums, target)[0]);
        System.out.println(problems.problemOne(nums, target)[1]);
        for(int i=0; i<2; ++i){
            if(problems.problemOne(nums, target)[0] != expected[0]){
                firstTest = false;
            }
            if(problems.problemOne(nums, target)[1] != expected[1]){
                firstTest = false;
            }
        }
        System.out.println("First test should output True and outputs " + firstTest);
        if(firstTest){ ++testsPassed;}

        ////////////////////////////////////////////////////////////////////


        int[] nums2 = {1,5,11};
        int target2 = 27;
        int[] expected2 = {0,0};

        boolean firstTest2 = true ;

        for(int i=0; i<2; ++i){
            if(problems.problemOne(nums2, target2)[0] != expected2[0]){
                firstTest2 = false;
            }
            if(problems.problemOne(nums2, target2)[1] != expected2[1]){
                firstTest2 = false;
            }
        }
        System.out.println("Second test should output True and outputs " + firstTest2);

        if(firstTest2){ ++testsPassed;}

        ////////////////////////////////////////////////////////////////////////////////////


        int[] nums3 = {3,8,12,123};
        int target3 = 126;
        int[] expected3 = {0,3};

        boolean firstTest3 = true ;

        for(int i=0; i<2; ++i){
            if(problems.problemOne(nums3, target3)[0] != expected3[0]){
                firstTest3 = false;
            }
            if(problems.problemOne(nums3, target3)[1] != expected3[1]){
                firstTest3 = false;
            }
        }
        System.out.println("Third test should output True and outputs " + firstTest3);

        if(firstTest3){ ++testsPassed;}






    }
}
