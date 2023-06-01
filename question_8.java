import java.util.Scanner;

public class question_8{
 public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

System.out.println("Enter the angles in degrees: ");

int A=sc.nextInt();
int B=sc.nextInt();
int C=sc.nextInt();

if(A<1||A>180||B<1||B>180||C<1||C>180){System.out.println("Invalid input");} //according to the constraints given in the question.
  else{

    if(A+B+C==180){System.out.println(1);} //Printing 1 when triangle is valid.
    else{System.out.println(0);} //Printing 0 when triangle is invalid.

  





  }

    
    

 }



}