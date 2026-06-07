import java.util.*;
class  LongestSub{
public static int lengthOfLongestSubstring(String s){
 Set <Character> uniqueSet = new HashSet<>();
 int left = 0;
 int maxLength = 0;
 for (int right=0; right<s.length() ; right++){
    if (!uniqueSet.contains(s.charAt(right))){
        uniqueSet.add(s.charAt(right));
        maxLength = Math.max(maxLength, right - left + 1);
    }
    else {
      while (uniqueSet.contains(s.charAt(right))){
        uniqueSet.remove(s.charAt(left));
        left++;
      }
        uniqueSet.add(s.charAt(right));

}

}
return maxLength;
}
public static void main(String[] args){
    System.out.print(lengthOfLongestSubstring("pwwkewj"));
}
}