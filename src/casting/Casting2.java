package casting;

// 명시적 형변환
public class Casting2 {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; // 컴파일 오류 발생. double 을 int 에 넣을 수 없다.
        intValue = (int) doubleValue; // 명시적 형변환
        System.out.println("intValue = " + intValue);

        System.out.println("doubleValue = " + doubleValue);
    }
}
