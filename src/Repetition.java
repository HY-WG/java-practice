public class Repetition {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            System.out.println("안녕하세요!");
    }


        // for 문 활용
        int customers = 5;
        for (int e = 1; e<=customers; e++) {
            System.out.println(e + "번째 손님, 안녕하세요!");


            //for문 활용 + break

            int customers2=5;
            for (int j = 1; j < customers2; j++) {
                if (j == 4) {
                    break; // 반복문에서 탈출
                }
                System.out.println(j+"번째 친구, 안녕!");
            }
        }
        System.out.println( "반복문이 종료되었습니다.");
    }
}
