import java.util.Scanner;

class parent {
    int a, b;

    public void acceptnumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number A :");
        a = sc.nextInt();
        System.out.println("Enter the 2nd number B:");
        b = sc.nextInt();
    }

    public void swaping() {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("The value of a with temp is :" + a);
        System.out.println("The value of b with temp is :" + b);
    }
}

    public class inheritence extends parent {
        public void withoutthirdvariable() {
            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("Swap without temp a :"+a+",b :"+ b);
        }

        public static void main(String[] args) {
            inheritence obj = new inheritence();
            obj.acceptnumbers();
            obj.swaping();
            obj.withoutthirdvariable();
        }

    }

