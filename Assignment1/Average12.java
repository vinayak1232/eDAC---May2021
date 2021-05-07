import java.util.*;
import java.lang.*;
class Average12{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter three numbers");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int d = (a+b+c)/3;
System.out.println("The average is "+d);
}
}