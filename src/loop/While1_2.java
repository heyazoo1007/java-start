package loop;

// 반복문을 사용하지 않으면 동일한 코드를 중복해서 계속 작성해야 한다. -> 번거로움, 버그의 위험 존재
public class While1_2 {

    public static void main(String[] args) {
        int count = 0;

        while (count < 3) {
            count = count + 1;
            System.out.println("현재 숫자는 = " + count);
        }
    }
}
