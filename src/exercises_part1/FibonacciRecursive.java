package exercises_part1;

public class FibonacciRecursive {
    public static void main(String[] args) {
        System.out.println(f(5));
    }

    public static int f(int n){
        if (n==1 || n==2){
            return 1;
        }
        return f(n-1)+f(n-2);
    }

}
