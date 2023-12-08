package loop.ex;

public class WhileEx2 {

    public static void main(String[] args) {
        int count = 0;
        int num = 1;
        while (count < 10) {
            if (num % 2 == 0) {
                System.out.println("짝수 = " + num);
                count++;
            }
            num++;
        }
    }
}
