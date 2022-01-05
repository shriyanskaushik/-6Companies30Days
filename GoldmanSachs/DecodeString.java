import java.util.Stack;

public class DecodeString {
    public static String decodeString(String s) {
        int n = s.length();
        Stack<Integer> intSt = new Stack<>();
        Stack<String> strSt = new Stack<>();
        int k = 0;
        String res = "";
        int i = 0;

        while(i < n){
            char c = s.charAt(i++);
            if(Character.isDigit(c)){
                k = k * 10 + c - '0';
            }else if(c == '['){
                intSt.push(k);
                strSt.push(res);
                k = 0;
                res = "";
            }else if(c == ']'){
                String temp = res;
                res = strSt.pop();
                k = intSt.pop();
                while(k > 0){
                    res += temp;
                    k--;
                }
                // res = temp;
            }else
                res += c;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(decodeString("3[a2[c]]"));
    }
}
