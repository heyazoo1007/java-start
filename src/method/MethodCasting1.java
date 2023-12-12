package method;

public class MethodCasting1 {

    public static void main(String[] args) {
        double number = 1.5;
        // printNumber(number) // double 을 int 에 넣으므로 컴파일 에러 발생
        printNumber((int) number); // 명시적 형변환으로 double -> int
    }

    public static void printNumber(int n) {
        System.out.println("숫자 : " + n);
    }
}
