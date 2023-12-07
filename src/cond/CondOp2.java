package cond;

// 삼항 연산자 : 단순히 참/거짓에 따라 값을 정하는 경우 사용함
public class CondOp2 {

    public static void main(String[] args) {
        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age = " + age);
        System.out.println("status = " + status);
    }
}
