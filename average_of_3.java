import java.util.Scanner;
class averageOf3
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int[] arr = new int[3];
int sum = 0;
System.out.println("enter three numbers you want to find average");
for(int i=0;i<3;i++){
arr[i] = scan.nextInt();
sum += arr[i];
}
 System .out.println("Average the three numbers : "+sum/3);
}
}
