import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the input");
		int a=scan.nextInt();

		System.out.println("hai");
		int b;
		if(a%2!=0){
for(int i=1;i<=a+a;i++){
	if(i%2!=0){	
		b=i;
		System.out.print(b+" ");
	} 
}
}
		else{
			int d=a/2;
			a=a;
			for(int j=1;j<=a;j++){
				if(a%2==0){
				if(j%2!=0){
				
					System.out.print(j+" ");
			}
				}
		}
		
		}
	}
}
	

