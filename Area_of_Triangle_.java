import java.util.*;
public class Solution{
    public static void main(String[] praveen){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=sc.nextInt();
        double s=(a+b+c)/2;
        double e= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",e);
    }
}