import java.util.*;
class Take_Input{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n= Integer.parseInt(s.nextLine());
		String name =s.nextLine();

		System.out.println("Hello "+name+" Here is the counting.");
		for(int i=1;i<=n;i++){
			System.out.println(i);
		}
	}
}