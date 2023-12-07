package cond;

// 삼항 연산자 : 단순히 참/거짓에 따라 값을 정하는 경우 사용함
public class CondOp1 {

    public static void main(String[] args) {
        int age = 18;
        String status;
        if (age >= 18) {
            status = "성인";
        } else {
            status = "미성년자";
        }
        System.out.println("age = " + age);
        System.out.println("status = " + status);
    }
}
