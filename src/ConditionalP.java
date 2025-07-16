public class ConditionalP {
    public static void main(String[] args) {
        String light = "초록불";

        if(light.equals("초록불")){
            System.out.println("지금 건너세요");
        }
        else if (light.equals("노란불")){
            System.out.println("주의하세요");
        }
        else if (light.equals("빨간불")){
            System.out.println("멈추세요");
        }
        else {
            System.out.println("잘못된 입력입니다.");
        }
    }
}
