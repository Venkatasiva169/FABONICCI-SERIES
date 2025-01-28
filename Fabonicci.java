
public class Fabonicci {
    public static void main(String[] args) {
        int n = 10;
        int first = 0, second = 1;
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else if (n == 1) {
            System.out.println("Fibonacci Series: " + first);
        } else {
            System.out.print("Fibonacci Series: ");
            System.out.print(first + " " + second + " ");
            for (int i = 3; i <= n; i++) {
                int next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
        }
    }
}
