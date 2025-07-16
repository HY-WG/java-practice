package Method;

public class Calculator {

    // 기능1: 더하기 메서드(기능)
    int sum(int a, int b) {
      int result = a + b;
        System.out.println("더하기 결과:" + result);
        return result; // return 은 기능을 끝내겠다는 의미로, 항상 맨 마지막에 써야함
    }
}
