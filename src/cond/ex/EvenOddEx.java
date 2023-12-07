package cond.ex;

// 삼항 연산으로 짝수, 홀수 구분하기
public class EvenOddEx {
    public static void main(String[] args) {
        int x = 3;

        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + result);
    }
}
