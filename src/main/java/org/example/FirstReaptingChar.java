package org.example;

public class FirstReaptingChar {

    public static void main(String[] args) {

        String str = "adfacd";
        char [] chars =str.toCharArray();

        for(int i=0; i<chars.length; i++){
            for (int j=1; j<=chars.length-1; j++){

                if (chars[j]==chars[i]){
                    System.out.println(chars[j]);
                    break;
                }
            }
        }
    }
}
