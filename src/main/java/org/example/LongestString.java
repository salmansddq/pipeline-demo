package org.example;

public class LongestString {
    public static void main(String[] args) {

        String [] arr = {"Apple", "mango", "ab","Facebook", "twiter"};

        int index =0;
        int longestString = arr[0].length();

        for (int i=0; i< arr.length; i++){
            if (arr[i].length() > longestString){
                index =i;
                longestString = arr[i].length();

            }
        }
//        System.out.println(longestString);
        System.out.println(arr[index]);
    }
}
