import java.util.Scanner;

public class question_9{
 public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

System.out.println("Enter the sides: ");

int A=sc.nextInt();
int B=sc.nextInt();
int C=sc.nextInt();

if(A<1||A>100000||B<1||B>100000||C<1||C>100000){System.out.println("Invalid input");} //according to the constraints given in the question.
  else{

      if(A==B&&B==C){System.out.println("Equilateral");}
      else if(A==B&&B!=C||A==C&&C!=B||B==C&&B!=A){System.out.println("Isosceles");}
      else if(A!=B&&B!=C&&A!=C){System.out.println("Scalene");}

  





  }

    
    

 }



}