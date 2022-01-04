import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupAnagrams{
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Integer>, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            String word = strs[i];
            Map<Character, Integer> temp = new HashMap<>();
            for(int j = 0; j < word.length(); j++){
                char c = word.charAt(j);
                if(temp.containsKey(c)){
                    int count = temp.get(c);
                    temp.put(c, count + 1);
                }else{
                    temp.put(c, 1);
                }
            }
            if(map.containsKey(temp)){
                map.get(temp).add(word);
            }else{
                List<String> newlist = new ArrayList<>();
                newlist.add(word);
                map.put(temp, newlist);
            }
        }

        List<List<String>> res = new ArrayList<>();
        for(List<String> temp : map.values()){
            res.add(temp);
        }
        
        return res;
    }
}