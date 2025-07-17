package MethodP;

public class Car {

    //1. 속성
    String name;
    String carModel;

    //2.생성자
    Car (String name, String carModel) {
        this.name = name;
        this.carModel = carModel;

        }
    // 3. 기능
    void drive() {
        System.out.println("지금부터 " + name + "의 주행을 시작합니다.");
        System.out.println("처음 선보이는"+carModel+"입니다.");
    }
}
