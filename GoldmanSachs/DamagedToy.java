public class DamagedToy {
    public static int damagedToy(int n, int m, int k){
        int pos = m % n;
        pos = k + pos - 1;
        return pos % n == 0 ? n : pos % n;
    }

    public static void main(String[] args) {
        System.out.println(damagedToy(5, 8, 2));
    }
}


