package SecondWeek;

import Method.Main;

public class Person {
    //1)속성
    String name;
    int age;
    String address;


    //2)생성자 - new로 호출함
    //this 는 객체 자신을 가리키는 키워드입니다. 현재 실행 중인 객체를 의미합니다.
    Person (String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

        // 3) 기능 (메서드 부분)
        void introduce() {
            System.out.println("안녕하세요.");
            System.out.println("나의 이름은 " + this.name + "입니다.");
            System.out.println("나이는 " + this.age + "입니다.");
            System.out.println("사는 곳은" + this.address + "입니다.");


        }

    }

