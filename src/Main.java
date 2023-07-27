import Stage.*;
import Character.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // 스테이지 객체 생성
        Stage stage = new Stage();
        Scanner sc = new Scanner(System.in);

        // 캐릭터 이름 입력 받기
        System.out.print("캐릭터 이름: ");
        String name = sc.nextLine();

        // 캐릭터 객체 생성
        MyCharacter character = new MyCharacter(name, 100, 0);


        // 정보 출력
        character.Print_CH();
        // 갈림길 고르기
        stage.ChoicePr(character);

    }
}