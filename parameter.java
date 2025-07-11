import java.util.Scanner;

public class parameter {
    public static void main(String[] args) {
        parameter obj = new parameter();
        obj.get_value();
    }

    public void get_value() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        Arithmetic_operation(number1, number2);
        Swap_num(number1 , number2);
        Greater_than(number1 , number2);

    }

    public void Arithmetic_operation (int a , int b)
    {
        System.out.println("Arithmetic_operation");
        System.out.println(a+"+"+b+"="+(a+b));
    }

    public void Swap_num(int a , int b){
        System.out.println("Before swaping the number");
        System.out.println("x="+a+"y="+b);
        int temp = a;
        a = b ;
        b = temp;
        System.out.println("After reverse the number");
        System.out.println("x="+a+"y="+b);
    }

    public void Greater_than (int a , int b) {
            if (a > b) {
                System.out.println(a + " is greater than " + b);
            } else {
                System.out.println(a + " is not greater than " + b);
            }
        }
    }





