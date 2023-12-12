package method;

public class Method2 {

    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }

    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다. =");

        return; // 모든 함수는 return 을 반드시 넣어야 한다.
    }
    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다. =");

        return;
    }
}
