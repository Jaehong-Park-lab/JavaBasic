package ch4;
import java.util.*;
public class FlowEx3 {
    public static void main(String[] args) {
        System.out.printf("숫자를 하나 입력하세요>");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input == 0){
            System.out.println("입력하신 숫자는 0입니다");
        }else {
            System.out.println("입력하신ㄴ 숫자는 0이 아닙니다");
        }
    }
}
