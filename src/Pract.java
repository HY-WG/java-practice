import java.util.Scanner;

public class Pract {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 이름 받기
        System.out.println("이름을 입력해주세요 = ");
        String name = in.nextLine();

        //나이 받기
        System.out.println("나이를 입력해주세요:");
        int age = in.nextInt();

        // 입력 받은 값 출력
        System.out.println("이름 = " + name);
        System.out.println("나이 = " + age);
    }
}
