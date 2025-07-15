//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        System.out.println("좋아하는 문장을 입력하세요: ");
        String sentence = scanner.nextLine();


        System.out.println("정수를 입력하세요: ");
        int num1= scanner.nextInt();

        System.out.println("실수를 입력하세요: ");
        double num2= scanner.nextInt();

        System.out.println("큰 정수를 입력하세요: ");
        long num3= scanner.nextInt();

        System.out.println("좋아하는 문장: " + sentence);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);

        }
    }
