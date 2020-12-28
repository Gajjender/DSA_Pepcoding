import java.util.Scanner;
class Number_Prime{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
        
        for(int i=1;i<=t;i++){
        	int n=s.nextInt();

        	int count = 0;
        	for(int div=2;div*div<=n;div++){
        		if(n%div == 0){
        			count++;
        			break;
        		}
        	}
        	if(count==0){
        		System.out.println("Number is Prime.");
        	}
        	else{
        		System.out.println("Number is not Prime.");
        	}
        }

	}
}

//The Time Limit is 10^4 * 10^rootn
//The Code is optimized two times