package loop.ex;

// 중첩 반복문으로 구구단 출력 하기
public class NestedEx1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}
