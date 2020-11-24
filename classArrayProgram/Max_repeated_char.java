//PROBLEM STATEMENT :- Maximum occuring character in a given string

package classArrayProgram;

import java.util.Scanner;

public class Max_repeated_char {

    static int max = -1;

    static char max_rep_char(String str) {

        int[] arr = new int[127];

        for (int i = 0; i < str.length(); i++) 
        {
            arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
        }

        char c = ' ';

        for (int i = 0; i < str.length(); i++) 
        {	
            if (max < arr[str.charAt(i)])
            {
                max = arr[str.charAt(i)];

                c = str.charAt(i);
            }
        }

        return c;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the string");
        
        String str = sc.nextLine();
        
        String str1 = str.replaceAll("\\s", ""); // remove space from string
        
        System.out.println(str1);
        
        System.out.println("Maximum repeated character  is :" + max_rep_char(str1) + " , and it is repeated for " + max + " times");
        
    }
}