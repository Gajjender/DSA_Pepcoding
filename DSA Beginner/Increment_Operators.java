import java.util.*;
class Increment_Operators{
	public static void main(String args[]){
		int i=10;
		if(i++ == i){
			System.out.println(i+" is good.");
		}
		else{
			System.out.println(i+" is bad.");
		}
		int j=20;
		if(++j == j){
			System.out.println(j+" is good.");
		}
		else{
			System.out.println(j+" is bad.");
		}
	}
}