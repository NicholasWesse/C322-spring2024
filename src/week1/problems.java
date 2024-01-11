package week1;

import java.util.LinkedList;

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

    public static boolean problem2(int x){
        //Palindrome
        int hold = x;
        int reversed = 0;
        int holder = 0;

        while(x > 0){
            holder = x % 10;
            reversed = (reversed * 10) + holder;
            x = x/10;
        }

        if(reversed == hold){return true;}
        else return false;


    }


    public static String problem3(String[] strings){
            //prefix checker
        String output = "";
        int shortest =255;

        //find shortest word length
        for(int i=0; i< strings.length; ++i){
            if(strings[i].length() <  shortest){
                shortest = strings[i].length();
            }
        }
        boolean works = true;
        for(int j=0; j < shortest; ++j){
            char prefix = strings[0].charAt(j);
            for(int k=1; k < strings.length; ++k){
                if(strings[k].charAt(j) != prefix) {
                    works = false;
                }
            }
            if(!works){break;}
            else{
                output = output + prefix;
            }
        }
        return output;
    }


    public static int problem4(String roman){
        int i= 0;
        int total = 0;
        while(!roman.isEmpty()){
            if(roman.charAt(i) == 'I'){
                if(roman.charAt(i+1) == 'V'){
                    total += 4;
                }
                total += 1;
            }





            roman.substring(1, roman.length());
        }
    }
    public static boolean problem5(String x){
        return true;
    }
    public static LinkedList<Integer> problem6(LinkedList<Integer> x, LinkedList<Integer> x2){}
    public static int[] problem7(int[] x){}

}
