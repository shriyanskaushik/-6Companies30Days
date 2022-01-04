public class NoOfDecodingMessages {

    public static int numDecodings(String s) {
        int dp[] = new int[s.length() + 1];

        if(s.charAt(0) == '0') return 0;

        if(s.length() == 1) return 1;

        dp[0] = 1;

        if(s.charAt(1) == '0'){
            if(s.charAt(0) == '1' || s.charAt(0) == '2') dp[1] = 1;
            else return 0;
        }else{

            String temp = s.charAt(0) + "" + s.charAt(1);
            int tempno = Integer.parseInt(temp);
            if(tempno >= 1 && tempno <= 26)
                dp[1] = 2;
            else{
                dp[1] = 1;
            }
        }

        for(int i = 2; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '0'){
                if(s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2')
                    dp[i] = dp[i - 2];
                else
                    return 0;
            }else{
                if(s.charAt(i - 1) == '0'){
                    dp[i] = dp[i - 1];
                }else{
                    String temp = s.charAt(i - 1) + "" + s.charAt(i);
                    int tempno = Integer.parseInt(temp);
                    if(tempno >= 11 && tempno <= 26)
                        dp[i] = dp[i - 1] + dp[i - 2];
                    else
                        dp[i] = dp[i - 1];
                }
            }
        }

        return dp[s.length() - 1];
    }

    public static void main(String[] args) {
        System.out.println(numDecodings("06"));
    }

}