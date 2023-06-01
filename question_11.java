import java.util.Scanner;

public class question_11 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int N=sc.nextInt(); //N denotes the bank balance
        
    int B=sc.nextInt(); int X=sc.nextInt(); //B denotes addition or subtraction and X denotes amount to be operated on

    if(N<1||X>100000||X<0){System.out.println("Invalid Input");} //Amount Cannot be in negative
      else{
        if(B==2&&X>N){System.out.println("Insufficient Funds");}
        else if(B==1){System.out.println(X+N);}
        else if(B==2){System.out.println(N-X);}
        
      }

      

    }
}