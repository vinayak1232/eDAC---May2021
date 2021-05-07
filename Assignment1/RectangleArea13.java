import java.util.*;
import java.lang.*;
class RectangleArea13{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter length of rectangle");
float f1 = sc.nextFloat();
System.out.println("Enter breadth of rectangle");
float f2 = sc.nextFloat();
double d1 = f1*f2;
System.out.println("The area of rectangle is "+d1); 

double d2 = 2*(f1+f2);
System.out.println("The perimeter of rectangle is "+d2);

}

}