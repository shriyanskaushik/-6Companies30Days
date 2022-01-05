public class ArrayPairsDivisibleByK {
    public static boolean canArrange(int[] arr, int k) {
        // Set<Integer> set = new HashSet<>();
        int[] freq = new int[k];
        // int count = 0;
        for(int num : arr){
            num %= k;
            if(num < 0) num += k;
            freq[num]++;
        }

        if(freq[0] % 2 != 0) return false;

        for(int i = 1; i <= k/2; i++){
            if(freq[i] != freq[k - i]) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,10,6,7,8,9}, k = 5;
        System.out.println(canArrange(arr, k));
    }
}


