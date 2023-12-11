package casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값, 리터럴은 int
        long maxIntOver = 2147483648L; // int 최고값 + 1

        int intValue = 0;
        intValue = (int) maxIntValue;
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver; // int 가 담을 수 있는 값보다 큰 값으로 형변환을 하면 -2147483648처럼 오버플로우가 발생함
        System.out.println("maxIntOver casting = " + intValue);
    }
}
