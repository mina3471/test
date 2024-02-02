public class HanoiTower {
    // n개의 원판을 from에서 by를 거쳐서 to로 옮기는 작업
    public static void move_tower(int n, char from, char by, char to){
        // 내가 옮겨야 할 원판이 하나다
        if(n == 1){
            System.out.printf("원판 %d을 %c에서 %c로 이동시킴\n", n, from, to); // %d 10진수, %c char, %o 8진수, %x 16진수, %f 실수
        }else {
            // 1. 맨 아래 원판을 제외한 n-1개의 원판을 from에서 by로 이동시킴 A -> B
            move_tower(n-1, from, to, by);
            // 2. 남은 하나의 원판을 from에서 to로 이동시켰다 A -> C
            System.out.printf("원판 %d을 %c에서 %c로 이동시킴\n", n, from, to);
            // 3. 1번에서 잠깐 다른곳에 옮겨놨던 n-1개의 원판을 큰원판 위로 이동 B -> C
            move_tower(n-1, by, from, to);
        }
    }

    public static void main(String[] args) {
        move_tower(3, 'A', 'B', 'C');
    }
}
