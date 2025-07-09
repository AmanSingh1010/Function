public class test {
    public static void main(String[] args) {
        test obj = new test();
        obj.Arithmetic_operation(5,6);
        obj.Swap_num(3, 5);
        obj.reverse_num(124);
        obj.palindrome(121);
    }

        public void Arithmetic_operation(int a , int b)
        {
        System.out.println("Arithmetic_operation");
            System.out.println(a+"+"+b+"="+(a+b));
            System.out.println(a+"-"+b+"="+(a-b));
            System.out.println(a+"*"+b+"="+(a*b));
        }

        public void Swap_num(int x , int y){
            System.out.println("Before swaping the number");
            System.out.println("x="+x+"y="+y);
            int temp = x;
            x = y ;
            y = temp;
            System.out.println("After reverse the number");
            System.out.println("x="+x+"y="+y);
        }

        public int reverse_num(int num){
        int reverse = 0;
        int original = num;
        while (num!=0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
            System.out.println("The original number is"+original+"\nThe reverse number is"+reverse);
            return reverse;
        }

        public void palindrome(int num){
        int reverse = reverse_num(num);
        if(num == reverse){
            System.out.println("Is the palindrome number");
        } else {
            System.out.println("Is not the palindrome number");
        }

        }

    }


