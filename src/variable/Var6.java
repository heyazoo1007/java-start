package variable;

// 변수는 꼭 초기화를 해야 한다!!!
public class Var6 {

    public static void main(String[] args) {
        int a; // 컴파일러 거치면 사라지는 변수. 자바에서 최적화한 것임
        //System.out.println(a); 초기화 안해서 컴파일 에러 발생
    }
}
