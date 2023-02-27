import java.util.Scanner;

public class LargestNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
         if(firstNumber > secondNumber){
            System.out.println("largest Number is :" + firstNumber);
         }else{
            System.out.println("LargestNumber is :"+ secondNumber);
         }

    }
}