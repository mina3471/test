public class Max {
    public static int gcd(int x, int y){
       int mod =  x % y;
       if(mod == 0){
           System.out.println("정답: " + y);
           return y;
       }else {
           return gcd(y, mod); // y를 x에, mod를 y에 다시 넣어서 호출
       }
    }



    public static void main(String[] args) {
        gcd(1112, 695);
    }

}
