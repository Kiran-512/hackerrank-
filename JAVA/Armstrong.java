/*
Complete the code segement to check whether the number is an Armstrong number or not
*/

import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int temp;
        int n = sc.nextInt();
        int d=0;
        int sum=0;
        
        temp=n;

        while(n>0){
        d=n%10;
        sum = sum + (d*d*d);
        n=n/10;  
        }
        
        if(sum==temp){
            System.out.println("Armtrong");
        }
        else
            System.out.println("Not an Armstrong");
        }
}