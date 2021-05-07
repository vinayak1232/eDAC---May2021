import java.util.*;
import java.lang.*;

class ArithmaticOpr6{
public static void main(String []args){

 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the first input");
 int a = sc.nextInt();
 System.out.println("Enter the second input");
 int b = sc.nextInt();
 int c = a+b;
 int d = a-b;
 int e = a*b;
 int f = a/b;
 int g = a%b;
 System.out.println("The addition is "+c); 
 System.out.println("The substraction is "+d);
 System.out.println("The multiplication is "+e);
 System.out.println("The division is "+f);
 System.out.println("The mode is "+g);
}

}