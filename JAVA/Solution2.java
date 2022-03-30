/*
Consider first n even numbers starting from zero(0). Complete the code segment to calculate sum of all these numbers divisible by 3. Print the sum

Input Format

Example: Input: n=5

0 2 4 6 8 Even number divisible by 3:0 6 sum:6

Constraints

n>=0;
*/
import java.util.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int sn=0;
    if(n>=0){
        for(int i=0;i<=n; i++)
        {

            if(sn%2==0){if(sn%3==0){sum=sum+sn;}}
                        sn=sn+2;
        }
        System.out.println(sum);
        }
    }
}