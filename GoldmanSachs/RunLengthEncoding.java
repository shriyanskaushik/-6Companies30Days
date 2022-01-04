public class RunLengthEncoding {
    public static String compress(String str) {
        char[] chars = str.toCharArray();
        String res = "";
        int n = chars.length;

        int left = 0;
        int right = 0;
        while(right < n){
            if(right == n-1){
                res += chars[left] + "" + (right - left + 1);
                left = right;
                right++;
            }
            else if(chars[right] == chars[left]) right++;
            else{
                res += chars[left] + "" + (right - left);
                left = right;
                right++;

            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(compress("aaaabbbccc"));
    }


}
