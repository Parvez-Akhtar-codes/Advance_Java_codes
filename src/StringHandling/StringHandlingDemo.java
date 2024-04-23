package StringHandling;

import java.util.Arrays;

public class StringHandlingDemo {
    public static void main(String[] args) {


        String S1 = "John Getting Admission ";
        String S2 = "In This College";
        //For getting length of a string
        System.out.println(S1.length());

        //For adding two string together
        System.out.println(S1.concat(S2));

        //For knowing that two strings are equal or not
        if(S1.equals(S2)){
            System.out.println("Both are equal");
        }else{
            System.out.println("Both are not equal");
        }

        //For knowing which character on which index
        System.out.println(S1.charAt(5));

        //For knowing which index on which character
        System.out.println(S2.indexOf('T'));

        //For replacing a character
        System.out.println(S1.replace('h','o'));

        //For Seperating words after space
        String[] arr = S1.split(" ");
        Arrays.asList(arr).forEach(s -> System.out.println(s));

        System.out.println(S1.substring(0,4));
    }
}
