import java.util.*;
import java.lang.*;
class Swap15{
public static void main(String []args){
int temp;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number");
 int a = sc.nextInt();
System.out.println("Enter the second number");
 int b = sc.nextInt();
System.out.println("The values before swap are.. "+a+" "+b);
 temp = a;
    a = b;
    b = temp;
System.out.println("The values after swap are.. "+a+" "+b);
}
}