package array;

// 배열 선언 및 출력 리팩토링
public class ArrayDi4 {

    public static void main(String[] args) {
        // 2 x 3 2차원 배열 만들기
        int[][] arr = new int[2][3];

        // 배열값 추가
        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        }

        // 배열값 출력
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); // 한 행이 끝나면 라인을 변경
        }
    }
}
