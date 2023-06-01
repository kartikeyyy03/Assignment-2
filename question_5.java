import java.util.Scanner;

public class question_5{

public static void main(String[] args) {
    
Scanner sc=new Scanner(System.in);

System.out.println("Enter an Integer: ");

int N=sc.nextInt();

if(N<1||N>1000000){System.out.println("Invalid input");} //According to the constraint given in the question.

else{
    
    if(N%2==0){System.out.println(0);} //When number is even
    else{System.out.println(1);} // when N%2=1 i.e., number is odd.





}
    
}





}