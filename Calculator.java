import java.util.Scanner ;
public class Calculator {
    public static void Calculation() {

        double  val_1 , val_2 , choice, add, sub, mult, div, pow , ch ; //declaring variables
        double chm = 1;
        System.out.println("\n        *** Alert ***  ");
        System.out.println(" ---> For entering more than two numbers press 1 whenever required.  \n");
        System.out.println("Enter 1 for Addition.    Enter 2 for Substracton.  Enter 3 for Multiplication.");
        System.out.println("Enter 4 for Division.    Enter 5 for exponent.     Enter 6 to exit. \n");
        System.out.print("Choice :  ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextDouble();
        System.out.println();


        if (choice == 1) {
            System.out.print("Enter first value : ");
            val_1 = sc.nextDouble();
            System.out.print("Enter second value : ");
            val_2 = sc.nextDouble();
            add = 0 ;
            add = val_1 + val_2;
            System.out.print("To enter more  numbers press 1 else 0 : ");
            chm = sc.nextDouble();
            if (chm==1){
                while (chm == 1 ){
                    System.out.print("Enter more numbers : ");
                    val_1 = sc.nextDouble();
                    add = add + val_1;
                    System.out.print("To enter more  numbers press 1 else 0 : ");
                    chm = sc.nextDouble();
                }
            }
            System.out.println("Result = " + add);
        } else if (choice == 2) {
            System.out.print("Enter first value : ");
            val_1 = sc.nextDouble();
            System.out.print("Enter second value : ");
            val_2 = sc.nextDouble();
            sub = 0 ;
            sub = val_1 - val_2;
            System.out.print("To enter more  numbers press 1 else 0 : ");
            chm = sc.nextDouble();
            if(chm ==1){
                while (chm == 1 ){
                    System.out.print("Enter more numbers : ");
                    val_1 = sc.nextDouble();
                    sub = sub - val_1;
                    System.out.print("To enter more  numbers press 1 else 0 : ");
                    chm = sc.nextDouble();
                }
            }
            System.out.println("Result = " + sub);
        } else if (choice == 3) {
            System.out.print("Enter first value : ");
            val_1 = sc.nextDouble();
            System.out.print("Enter second value : ");
            val_2 = sc.nextDouble();
            mult = 1 ;
            mult = val_1 * val_2;
            System.out.print("To enter more  numbers press 1 else 0 : ");
            chm = sc.nextDouble();
            if(chm ==1){
                while (chm == 1 ){
                    System.out.print("Enter more numbers : ");
                    val_1 = sc.nextDouble();
                    mult = mult * val_1;
                    System.out.print("To enter more  numbers press 1 else 0 : ");
                    chm = sc.nextDouble();
                }
            }
            System.out.println("Result = " + mult);
        } else if (choice == 4) {
            System.out.print("Enter first value : ");
            val_1 = sc.nextDouble();
            System.out.print("Enter second value : ");
            val_2 = sc.nextDouble();
            div = 1;
            div = val_1 / val_2;
            System.out.print("To enter more  numbers press 1 else 0 : ");
            chm = sc.nextDouble();
            if(chm ==1){
                while (chm == 1 ){
                    System.out.print("Enter more numbers : ");
                    val_1 = sc.nextDouble();
                    div = div / val_1;
                    System.out.print("To enter more  numbers press 1 else 0 : ");
                    chm = sc.nextDouble();
                }
            }
            System.out.println("Result = " + div);
        } else if (choice == 5) {
            System.out.print("Enter base value : ");
            val_1 = sc.nextDouble();
            System.out.print("Enter exponent : ");
            val_2 = sc.nextDouble();
            pow = (int) Math.pow(val_1, val_2);
            System.out.println("Result = " + pow);
        } else if (choice == 6 ){
            return ;
        }else {
            System.out.println("\nWrong choice entered!! \n");
        }
        System.out.print("\nFor next Calculation press 1 else 0 :  ");
        ch = sc.nextDouble();
        System.out.println();
        if (ch == 1 ){
            Calculation();
        }
        else {
            return ;
        }
    }
    public static void main(String[] args){
        //This calculator is basically for arithmetic operations on two numbers.
         Calculation();
    }
}




