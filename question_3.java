import java.util.Scanner;

class question_3{
/**
 * @param args
 */
public static void main(String[] args) {
    System.out.println("Enter the two numbers: ");

    Scanner sc=new Scanner(System.in);

    int A=sc.nextInt();
    int B=sc.nextInt();

//if(A<1||A>1000000){System.out.println("Invalid Input");} //According to the question 1 <= A <= 1000000
//if(B<1||B>1000000){System.out.println("Invalid Input");} //According to the question 1 <= B <= 1000000



 if(A>B){System.out.println(A);}
 else if(B>A){System.out.println(B);}
 else{System.out.println("Both are equal");}; //If the user enters the same number twice

}





}

