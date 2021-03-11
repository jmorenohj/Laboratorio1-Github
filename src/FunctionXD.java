public class FunctionXD {
    public static long fib(long n) {
        if ((n == 0) || (n == 1))
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }
    public static int operation(int num1, int num2, int num3){
        return num1*num2 + num3;
    }
    public static void main(String[] args) {
        System.out.println("The result of the operation is: " + operation(7,4,9));
        System.out.println("The result of the operation is: " + operation(5,5,6));
        System.out.println("The 0th fibonacci number is: " + fib(0));
        System.out.println("The 7th fibonacci number is: " + fib(7));
        System.out.println("The 12th fibonacci number is: " + fib(12));
    }
}