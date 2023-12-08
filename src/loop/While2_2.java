package loop;

// 좋은 코드는 변경사항이 발생했을 때 최대한 적게 수정하는 코드이다. 
public class While2_2 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        sum += i;
        System.out.println("i = " + i + " sum = " + sum);
        i++;

        sum += 2;
        System.out.println("i = " + i + " sum = " + sum);
        i++;

        sum += 3;
        System.out.println("i = " + i + " sum = " + sum);
        i++;
    }
}
