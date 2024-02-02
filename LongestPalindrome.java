class Panlindrome{
    // 투 포인터를 이동시키며 팬린드롬을 판단한다
    int expand(String s, int left, int right){
        int len = s.length();
        while(left >= 0 && right <= len && s.charAt(left) == s.charAt(right - 1)){
            left -= 1; // 투 포인터를 왼쪽으로 한칸 이동
            right += 1; // 투 포인터를 오른쪽으로 한칸 이동
        }
        // 양쪽이 같지 않아졌을 떄 지금까지의 문자열의 길이를 return
        return (right -1 ) - (left + 1) +1; // s.substring((left+1), (right-1)).length()
    }

    void longestPanlindrome(String s){
        int result = 1;
        for(int i = 0; i < s.length() -1; i++){
            int ex1 = expand(s, i, i + 1);
            int ex2 = expand(s, i, i + 2);
            result = Math.max(Math.max(ex1, ex2), result);
        }
        System.out.println(result);
    }


}










public class LongestPalindrome {
    // 팬린드롬이면 true, 아니면 false
    static boolean is_palindrome(String s, int start, int end){
        char[] chars = s.toCharArray();
        int length =  s.length();
        for(int i= start; i < (end - start +1) / 2; i++){
            if(chars[i] != chars[end - i]){
                return false;
            }
        }
        return true;
    }

    static void find_palindrome(String s){
      int answer = 1;
      int length = s.length();
      for( int i = 0; i < length; i++){
          if(length - i > answer){
              for( int j = length -1; j > i; j--){
                  if(answer < j - i + 1){
                      if(is_palindrome(s, i, j)){
                          answer = j - i + 1; //최대 길이 구하려면 +1
                      }
                  }
              }
          }
          System.out.println(answer);
      }



//        String str = "abcdcba";
//        char[] arr = str.toCharArray();
//
//        for(int i=0;  i<str.length(); i++){
//            System.out.println(arr[i]);
//        }

    };

    private static void main(String[] args) {
        find_palindrome("abbaca");

    }}
