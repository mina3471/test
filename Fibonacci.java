public class Fibonacci {
// 피보나치 수열 f(n) n=30을 구하시오 재귀로
    // 현재 진행중인 항 번호: count
    // 언제까지 진행할건지의 목표: n
    public static void fibonacciS(int a, int b, int count, int n){
        if(n == count){ // 목표에 도달했다
            System.out.println(a + b);
        }else {
            fibonacciS(b, a + b, count + 1, n); //count + 1 한번 했으니
        }
    }

    public static void main(String[] args) {
//        fibonacciS(1, 1, 3, 30); //재귀

        int n = 100000;
        int[] pibonacci = new int[100000]; // 다이나믹 프로그램 사용
        System.out.println(pibonacci);
        pibonacci[0] = 1;
        pibonacci[1] = 1;
        // 목표인 30항까지 진행한다
        for(int i =2; i < n; i++){
            pibonacci[i] = pibonacci[i-1] + pibonacci[i-2];
        }
        System.out.println(pibonacci[n-1]);
    }
}
