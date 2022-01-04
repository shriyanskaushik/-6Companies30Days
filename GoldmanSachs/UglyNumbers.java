public class UglyNumbers {

    public static int uglyNumber(int n){
        int ugly[] = new int[n + 1];
        ugly[0] = 1;
        int factorOf2 = 2, factorOf3 = 3, factorOf5 = 5;
        int ind2 = 1, ind3 = 1, ind5 = 1;
        for(int i = 0; i < n; i++){
            int min = Math.min(factorOf2, Math.min(factorOf3, factorOf5));
            ugly[i + 1] = min;
            if(min == factorOf2)
                factorOf2 = 2 * ugly[ind2++];
            if(min == factorOf3)
                factorOf3 = 3 * ugly[ind3++];
            if(min == factorOf5)
                factorOf5 = 5 * ugly[ind5++];
        }
        return ugly[n - 1];
    }
    public static void main(String[] args) {
        System.out.println(uglyNumber(4));
    }
}
