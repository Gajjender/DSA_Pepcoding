import java.util.*;
class Conditionals{
	public static void main(String[] args) {
		int x=11;
		if(x%2==0){
			System.out.println("x is even.");
		}
		else{
			System.out.println("x is odd.");
		}
		System.out.println("Hardwork is better than Smartwork.");
		int n1=11,n2=10;
		if(n1<n2){
			System.out.println("n1 is smaller than n2.");
		}
		else if(n1>n2){
			System.out.println("n1 is greater than n2.");
		}
		else{
			System.out.println("n1 and n2 are equal.");
		}
	}
}