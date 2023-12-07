package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {
        // 전위 증감 연산자 사용 예
        int a = 1;
        int b = 0;

        b = ++a; // a의 값 1만큼 증가시킨 후 b에 대입
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 후위 증감 연산자 사용 예
        a = 1;
        b = 0;

        b = a++; // a의 현재값을 b에 대입하고, a의 값 1 증가 시킨다
        System.out.println("a = " + a + ", b = " + b);

    }
}
