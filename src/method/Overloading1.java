package method;

public class Overloading1 {

    public static void main(String[] args) {
        System.out.println("1번 : " + add(1, 2));
        System.out.println();
        System.out.println("2번 : " + add(3, 4,5));
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }
}
