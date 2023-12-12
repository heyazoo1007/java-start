package method.ex;

public class MethodExRef2 {

    public static void main(String[] args) {
        String message = "hello world!";
        printMessage(3, message);
        System.out.println();
        printMessage(5, message);
    }

    public static void printMessage(int times, String message) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
