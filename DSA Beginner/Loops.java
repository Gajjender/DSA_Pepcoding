import java.util.Scanner;
class Loops{
	public static void main(String[] args) {
		int i=1;

		while(i<=9){
			System.out.println(i);
			i=i+1;
		}
		System.out.println("While Loop Done");

		for(i=1;i<=6;i++){
			System.out.println(i);
		}
		System.out.println("For Loop Done");
		int j=10;
		do{
			System.out.println(j);
			j--;
		}while(j>=1);
		System.out.println("Do While Loop Done");
	}
}