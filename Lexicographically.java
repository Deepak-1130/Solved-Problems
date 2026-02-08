class Lexicographically{
     public static  char nextGreatestLetter(char[] letters, char target) {
        int n=letters.length-1;
        char res = letters[0];
        for(int i=n-1;i>=0;i--){
            if(letters[i]>target){
                res=letters[i];

            }
        }
        return res;
    }

public static void main(String[] args){
    char[] arr={'c','f','j'};
    char target='a';
    System.out.print(nextGreatestLetter(arr,target));
}
    
}