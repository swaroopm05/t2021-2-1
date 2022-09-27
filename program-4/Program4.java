import java.util.Scanner;

public class Problem3 {

public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the input");

int a=scan.nextInt();
if (a==1){
    System.out.print(1+" ");
}else{
    int b=1;
for(int i=1;i<a;i++){
System.out.print(b+" ");
b=b+2;
 }
 }
}
}