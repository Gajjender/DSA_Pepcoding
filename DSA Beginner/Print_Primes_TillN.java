import java.util.*;
class Print_Primes_TillN{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int low =s.nextInt();
		int high=s.nextInt();

		for(int num=low;num<=high;num++){
			int count=0;

			//try to divide n and increase count
			for(int div=2;div*div<=num;div++){
				if(num%div==0){
					count++;
					break;
				}
			}
			//try to divide n and increase count

			if(count==0){
				System.out.println(num);
			}
		}
	}
}