package loop;


// for 문을 사용하면 구조적으로 깔끔하게 사용할 수 있다.
// 횟수를 세는 카운터 변수, 코드 실행 조건등이 한 줄에 깔끔하게 기록되어 있기 때문이다.
public class For2 {

    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;

        // 1 + 2 + 3 = 6
        for (int i = 1; i <= endNum; i++) {
            sum += i;
            System.out.println("i = " + i + " sum = " + sum);
        }
    }
}
