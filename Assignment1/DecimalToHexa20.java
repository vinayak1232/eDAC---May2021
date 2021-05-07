
public class DecimalToHexa20{    
public static String toHex(int n){    
     int rem;  
     String hexa="";   
     char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
    while(n>0)  
     {  
       rem=n%16;   
       hexa=hexchars[rem]+hex;   
       n=n/16;  
     }  
    return hex;  
}    
public static void main(String args[]){      
     System.out.println("Hexadecimal of 22 is: "+toHex(22));  
     System.out.println("Hexadecimal of 15 is: "+toHex(15));  
     System.out.println("Hexadecimal of 675 is: "+toHex(675));  
}}      