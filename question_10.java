import java.util.Scanner;

public class question_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the integer: ");

        int A=sc.nextInt();

      if(A<1||A>1000000000){System.out.println("Invalid Input");} //According to the constraint given in the question.
        else{

            if(A%55==0){System.out.println(1);} //A number is divisible by 55 if it is divisible by both 5 and 11
            
            //This line of code can also be written as-->   if(A%5==0&&A%11==0){System.out.println("1");}

            else{System.out.println(0);}


        }
    }
}
