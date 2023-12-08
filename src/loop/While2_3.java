package loop;

// 좋은 코드는 변경사항이 발생했을 때 최대한 적게 수정하는 코드이다. 
public class While2_3 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1; // 시작점
        int endNum = 3; // 종료지점

        while (i <= endNum) {
            sum += i;
            System.out.println("i = " + i + " sum = " + sum);
            i++;
        }
    }
}
