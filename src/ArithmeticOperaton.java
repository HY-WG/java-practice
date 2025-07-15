import org.w3c.dom.ls.LSOutput;

public class ArithmeticOperaton {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // 기본 사칙연산
        int sum = a + b;
        System.out.println("sum=" + sum);

        int sub = a-b;
        System.out.println("sub=" + sub);

        int mul = a*b;
        System.out.println("mul=" + mul);

        int div = a/b;
        System.out.println("div=" + div);

        double div2 = a/b;
        System.out.println("div2=" + div2);

        //모듈러 (나머지 연산)

        int mod = 10%3;
        System.out.println("mod=" + mod);
        int mod2 = 15%4;
        System.out.println("mod=" + mod2);
        int mod3 = 20%7;
        System.out.println("mod=" + mod3);

        // 시간 연산 예제 : 현재 10시인데, 5시간 후면 몇 시 일까요?
        int cal = (10+5)%12;
        System.out.println("cal = " + cal);
        //짝수,홀수 판별
        int even = 6%2;
        System.out.println("even = " + even); // 짝수
        int sup = 7%2;
        System.out.println("sup = " + sup); // 홀수
        
        //복합 대입 연산자
        int num = 5; // 여기에 계속 연산
        num += 3;
        System.out.println("+= 결과: " + num);

        num -= 2;
        System.out.println("-= 결과: " + num);

        num *= 2;  // num = num * 2;
        System.out.println("*= 결과: " + num);

        num /= 3;  // num = num / 3;
        System.out.println("/= 결과: " + num);

        num %= 3;  // num = num % 3;
        System.out.println("%= 결과: " + num);

        // 증감 연산자 (전위 연산 / 후위 연산)
        // (1) 후위 연산자

        int num3 = 1;
        System.out.println("num3=" + num3);
        num++; // 값을 1 증가 시킴
        System.out.println("num++ 실행후 : " + num);

        num--; // 값을 1 감소시킴
        System.out.println("num-- : " + num);
        
        //(2) 전위 연산자
        int aa = 5;
        System.out.println("++aa:" + (++aa));
        System.out.println("현재 aa 값:" + aa);

        // 후위 연산자 비교 예시
        int bb = 5;
        System.out.println("bb++: " + (bb++));  // 5 (출력 후 증가)
        System.out.println("현재 bb 값: " + bb);  // 6

        // 같은 연산자
        System.out.println("10==10:  " + (10==10));
        // 다름 연산자
        System.out.println("10!=5:" +  (10!=5));
        // 크기 비교 연산자
        System.out.println("10 < 5: " + (10 < 5)); // false
        System.out.println("10 >= 10: " + (10 >= 10)); // true
        System.out.println("10 <= 5: " + (10 <= 5)); // false

// 논리 연산자
        //and 연산자 : 두 조건이 모두 참일때, true 반환
        System.out.println("true && true: " + (true && true));  // true
        System.out.println("true && false: " + (true && false)); // false
        System.out.println("false && false: " + (false && false)); // false

        int age = 20;
        boolean isStudent = true;
        System.out.println(age > 18 && isStudent); // true

        //or 연산자 : 둘 중 하나라도 참이면 true 변환
        System.out.println("true || false: " + (true || false)); // true
        System.out.println("false || false: " + (false || false)); // false
        System.out.println("true || true: " + (true || true)); // true


        int age2 = 20;
        boolean isStudent2 = true;
        System.out.println(age2 > 18 || isStudent2); // true

        //not 연산자: true 일때 false 로, false 일때 true  로 변경한다.
        System.out.println("!true: " + (!true));
        System.out.println("!false: " + (!false));

        int age3 = 20;
        boolean isStudent3 = true;
        System.out.println(!(age3 > 18 && isStudent3));




    }


}
