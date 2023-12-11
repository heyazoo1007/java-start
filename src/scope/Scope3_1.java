package scope;


// temp 변수는 if 조건이 만족될 때 잠깐 사용하는 변수인데 main 블록에 선언되어있음
// 이는 메모리를 비효율적으로 사용하고, 코드 복잡성을 증가 시키는 코드이므로 아래와 같은 방식의 선언은 지양하자
// 좋은 코드는 군더더기 없이 단순한 코드
public class Scope3_1 {

    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            if (m > 2) {
                System.out.println("temp = " + temp);
            }
            System.out.println("m = " + m);
        }
    }
}
