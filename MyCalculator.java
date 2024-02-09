
import java.util.*;
import Calculator.*;
public class MyCalculator {
    public static void main(String[] args) {
        int menu=0;
        Scanner sc=new Scanner(System.in);
        while(menu!=5){
            System.out.println("Menu");
            System.out.print("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
            System.out.println("Enter action : ");
            menu=sc.nextInt();
            int a,b;
            System.out.println("Enter first number : ");
            a=sc.nextInt();
            System.out.println("Enter second number : ");
            b=sc.nextInt();
            switch(menu){
                case 1:
                    Operations.addition(a,b);
                    break;
                case 2:
                    Operations.subtraction(a,b);
                    break;
                case 3:
                    Operations.multiplication(a,b);
                    break;
                case 4:
                    Operations.division(a,b);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            System.out.println("Do you wish to continue (1.Yes/2.No) ");
            int c=sc.nextInt();
            if(c==2){
                menu=5;
            }
        }
        sc.close();
    }
}
