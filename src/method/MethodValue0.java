package method;

public class MethodValue0 {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1; // 값을 복사해서 대입하는 부분, num1 자체가 num2에 들어간 것이 아님
        num2 = 10;

        System.out.println(num1);
        System.out.println(num2);
    }
}
