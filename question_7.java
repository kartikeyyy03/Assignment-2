import java.util.Scanner;



public class question_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the three numbers: ");

int A=sc.nextInt();
int B=sc.nextInt();
int C=sc.nextInt();
    
if(A<1||A>1000000||B<1||B>1000000||C<1||C>1000000){System.out.println("Invalid Input");} //According to the constraints given in the question.

else{
     



if(A<B&&A<C){System.out.println(A);}
else if(B<A&&B<C){System.out.println(B);}
else if (A==B&&B==C){System.out.println(A);} // In case the user enters the same number three times
else {System.out.println(C);} //when C<A&&C<B
}

    


    }
}
