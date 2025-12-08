  import java.util.*;
  class Solution{
    public static List<ArrayList<String>> groupAnagram(String[] words){
        HashMap<String , String> map = new HashMap<>();
        for(String word: words){
            char[] wordArray = word.toCharArray();
             Arrays.sort(wordArray);
             String sortedString = new String(Arrays.sort(wordArray));
             if(!map.contains(sortedString)){
                map.put(sortedString,new ArrayList<String>());
             }
             map.get(sortedString).add(word);
                     }
                     return new ArrayList<>(map.values);
    }

    public static void main(String[] args){
        groupAnagram({"hjhkjh"});
    }
}
