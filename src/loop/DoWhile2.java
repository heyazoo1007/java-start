package loop;

// do-while 문은 조건없이 최초에 한번 꼭 코드 블럭을 실행해야하는 경우에 사용하면 된다.
public class DoWhile2 {

    public static void main(String[] args) {
        int i = 10;

        do {
            System.out.println("현재 숫자는 = " + i);
            i++;
        } while(i < 3);
    }
}
