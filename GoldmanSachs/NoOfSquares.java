public class NoOfSquares {

    public static long squares(int n){
        return (long) ((n * (n + 1) * (2 * n + 1))/6);
    }

    public static void main(String[] args) {
        System.out.println(squares(1));
    }
}
