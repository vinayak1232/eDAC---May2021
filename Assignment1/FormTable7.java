import java.util.*;
import java.lang.*;

class FormTable7{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int a  = sc.nextInt();
int[] Array = new int[]{1,2,3,4,5,6,7,8,9,10};
System.out.println("The Table for "+a+" is : ");
for(int i=0;i<10;i++){
System.out.println(a*Array[i]);
}
}
}