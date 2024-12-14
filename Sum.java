public class Main {
    public static void main(String[] args) {
        int result = sum(1, 10); 
        System.out.println("The sum is: " + result);
    }

    public static int sum(int i1, int i2) {
        int sum = 0;
        for (int i = i1; i <= i2; i++) {
            sum += i;
        }
        return sum;
    }
}