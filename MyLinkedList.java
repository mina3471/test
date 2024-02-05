class MLL{ // 내가 만든 LinkedList
    Object data;
    MLL next;
    MLL(Object data, MLL next){
        this.data = data;
        this.next = next;
    }
}


public class MyLinkedList {
    public static void main(String[] args) {
        MLL mll1 = new MLL("A", null);

        MLL mll2 = new MLL("B", null);
        mll1.next = mll2;  // mll1에 다음요소인 mll2를 알려줌

        System.out.println(mll1.next.data); // B

    }
}
