package week1;

import java.util.LinkedList;

public class testDrive {

    public static void main(String[] args) {
        //test cases
        int testsPassed = 0;


        int[] nums = {2,7,11};
        int target = 9;
        int[] expected = {0,1};

        boolean firstTest = true;

        for(int i=0; i<2; ++i){
            if(problems.problemOne(nums, target)[0] != expected[0]){
                firstTest = false;
            }
            if(problems.problemOne(nums, target)[1] != expected[1]){
                firstTest = false;
            }
        }
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

        if(firstTest3){ ++testsPassed;}

        System.out.println(testsPassed + " out of 3 Passed");



        ///////////////////////////////////////////////////
        //Problem 2
        int problem2Passed = 0;

        int x1 = 121;
        int x2 = 2112;
        int x3 = 321;

       if(problems.problem2(x1)){++problem2Passed;}
        if(problems.problem2(x2)){++problem2Passed;}
        if(!problems.problem2(x3)){++problem2Passed;}

        System.out.println(problem2Passed + " out of 3 Passed");


        /////////////////////////////////////////////////////////
        //Problem 3

        //Longest Prefix

        int problem3Passed = 0;

        String[] st1 = {"Flower", "Flow", "Flood"};
        String[] st2 = {"Po", "Ti", "Ur"};
        String[] st3 = {"dog", "racecar", "car"};

        if(problems.problem3(st1).equals("Flo")){++problem3Passed;}
        if(problems.problem3(st2).equals("")){++problem3Passed;}
        if(problems.problem3(st3).equals("")){++problem3Passed;}

        System.out.println(problem3Passed + " out of 3 Passed");



        ////////////////////////////////////////////////////
        //Problem 4

        //Roman Numerals

        int problem4Passed = 0;
        String r1 = "IV";
        String r2 =  "LXI";
        String r3 = "MVI";


        if(problems.problem4(r1) == 4){++problem4Passed;}
        if(problems.problem4(r2) == 61){++problem4Passed;}
        if(problems.problem4(r3) == 1006){++problem4Passed;}



        /////////////////////////////////////////////////////////
        //Problem 5

        //Bracket Closing

        int problem5Passed = 0;
        String b1 = "{{}}";
        String b2 = "({})";
        String b3 = "(({{})";

        if(problems.problem5(b1)){++problem5Passed;}
        if(problems.problem5(b2)){++problem5Passed;}
        if(!problems.problem5(b3)){++problem5Passed;}



        //////////////////////////////////////////////////////////
        //Problem 6

        // Merge Linked Lists


        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        LinkedList<Integer> l3 = new LinkedList<>();
        LinkedList<Integer> l4 = new LinkedList<>();

        l1.add(1);
        l1.add(2);
        l1.add(4);

        l2.add(2);
        l2.add(5);

        l3.add(5);
        l3.add(2);
        l3.add(2);

        l4.add(6);
        l4.add(4);
        l4.add(9);





        ////////////////////////////////////////////////////////
        //Problem 7


        //Increment by 1



        int[] s1 = {1,2,3,4};
        int[] s2 = {3,4,5};
        int[] s3 = {9};


        int[] hold1 = problems.problem7(s1);





    }
}
