package scope;

// 메모리 효율적으로 사용 가능
// if 바깥에서는 temp 를 신경쓰지 않아도 됨
// 코드가 명확해짐 -> 필요한 것을 필요한 곳에 쓰게
public class Scope3_2 {

    public static void main(String[] args) {
        int m = 10;
        if (m > 0) {
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
