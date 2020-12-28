import java.util.*;
class VariableInJava{
	public static void main(String args[]){
		int x = 10;
		int y = 15;
		int sum = x+y;
		int product = x*y;
		System.out.println("Sum of "+x+" and "+y+" is : "+sum);
		System.out.println("Product of "+x+" and "+y+" is : "+product);
		int v1 = x/y;
		int v2 = y/x;
		int v3 = x%y;
		System.out.println("x by y is : "+v1);
		System.out.println("y by x is : "+v2);
		System.out.println("x modulus y is : "+v3);
        //int exp = (x*y)/(x+y);
        //System.out.println(exp);
        System.out.println(Math.pow(2,3));
        int exp = (int)Math.pow(2, 3);
        System.out.println(exp);
        int a=10;
        int b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
	}
}


//      */% > +-