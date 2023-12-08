package loop.ex;

public class ForEx2 {

    // for 조건식에 여러 변수를 동시에 쓸 수 있다.
    public static void main(String[] args) {
        for (int num = 2, count = 1; count <=10; num += 2, count++) { // 카운터 변수에 num까지 있어서 그리 좋은 코드는 아님
            System.out.println(num);
        }

        System.out.println();

        int num = 2;
        for (int count = 1; count <= 10; count++) {
            System.out.println(num);
            num += 2;
        }
    }
}
