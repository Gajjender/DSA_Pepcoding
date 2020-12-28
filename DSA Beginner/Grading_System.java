import java.util.*;
class Grading_System{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the marks : ");
		int marks = s.nextInt();

		if(marks>90){
			System.out.println("Excellent");
		}
		else if(marks>80){
			System.out.println("Good");
		}
		else if(marks>70){
			System.out.println("Fair");
		}
		else if(marks>60){
			System.out.println("Meets Expectations");
		}
		else{
			System.out.println("Below Par");
		}
	}
}