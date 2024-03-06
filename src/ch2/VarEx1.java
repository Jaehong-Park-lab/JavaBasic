package ch2;

public class VarEx1 {
    public static void main(String[] args) {
        int year = 2024; // 변수 year를 2024로 초기화 하였다.
        int age = 33; // 변수 age를 33으로 초기화 하였다.
        System.out.println(year); //변수 year의 값을 화면에 출력
        System.out.println(age); //변수 age의 값을 화면에 출력

        year = age + 2000; //변수 age에 저장된 값(33)을 읽어와서 식에 사용
        age = year + 1; // 변수 year에 2024를 저장한다
        System.out.println(year);
        System.out.println(age);
    }
}
