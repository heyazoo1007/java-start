package cond.ex;

// 평점에 따라서 각각 다르게 출력해야 하기 때문에 독립된 if 문을 사용해야 함!
public class MovieRateEx {

    public static void main(String[] args) {
        double rating = 7;

        if (rating <= 9) {
            System.out.println("'어바웃 타임'을 추천합니다.");
        }

        if (rating <= 8) {
            System.out.println("'토이스토리'를 추천합니다.");
        }

        if (rating <= 7) {
            System.out.println("'고질라'를 추천합니다.");
        }
    }
}
