package casting;

// 기본적으로 자바는 같은 타입끼리만 값을 넣을 수 있다.
// 자동 형변환(묵시적 형번환)
public class Casting1 {

    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // long 타입에 int 타입 넣는 거 가능
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // double 타입에 int 타입 넣는 거 가능
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; // double 타입에 long 타입 넣는 거 가능
        System.out.println("doubleValue = " + doubleValue);
    }
}
