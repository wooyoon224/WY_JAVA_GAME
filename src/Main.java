import Stage.*;
import Character.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // 스테이지 객체 생성
        Stage stage = new Stage();
        Scanner sc = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("{Start Menu}");
        System.out.println("시작 : q를 제외한 아무키");
        System.out.println("종료 : q");
        System.out.println("======================");
        System.out.print("시작하시겠습니까? : ");
        String start_Key = sc.nextLine();
        System.out.print("\n");

        if(start_Key.equals("q") || start_Key.equals("Q")){
            System.out.println("[게임을 종료합니다.]");
            System.exit(0);
        }

        System.out.println("게임을 시작하기에 앞서 플레이어 이름을 정해주세요.");
        // 캐릭터 이름 입력 받기
        System.out.print("플레이어 이름: ");
        String name = sc.nextLine();

        // 캐릭터 객체 생성
        MyCharacter character = new MyCharacter(name, 100, 0, 20);

        while (character.stage <= character.numberOfMaps){
            System.out.println("======================");
            System.out.println("{Main Menu}}");
            System.out.println("1. 플레이어 정보");
            System.out.println("2. 게임 진행 [갈림길 선택]");
            System.out.println("3. 게임 설명");
            System.out.println("4. 게임 종료");
            System.out.println("======================");
            System.out.print("1, 2, 3 중 하나를 선택해주세요. : ");
            int MainMenu = sc.nextInt();
            System.out.print("\n");

            switch (MainMenu){
                case 1 :
                    // 정보 출력
                    character.Print_CH();
                    break;
                case 2:
                    // 갈림길 고르기
                    stage.ChoicePr(character);
                    break;
                case 3:
                    // 설명
                    break;
                case 4:
                    System.out.println("[게임을 종료합니다.]");
                    System.exit(0);
            }

        }

    }
}