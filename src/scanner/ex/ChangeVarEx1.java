package scanner.ex;

public class ChangeVarEx1 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        a = b;
        temp = a;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
