package Character;

import java.util.Random;
import java.util.Scanner;

public class MyCharacter {
    public String name;
    public int hp;
    public int stage;
    public int attack;

    // 랜덤 맵 수 생성
    public int numberOfMaps = RandomMap(10, 15);

    public MyCharacter(String name, int hp, int stage, int attack) {
        this.name = name;
        this.hp = hp;
        this.stage = stage;
        this.attack=attack;
    }

    // 이름 출력 메서드
    public void Print_CH() {
        System.out.println("======================");
        System.out.println("진행한 스테이지 수: " + stage + " / " + numberOfMaps);
        System.out.println("이름: " + name);
        System.out.println("HP : " + hp);
        System.out.println("공격력(최소값) : " + attack);
        System.out.println("======================");
    }

    // 크리티컬 기능 추가
    public int attackMonster() {
        Random random = new Random();
        double criticalChance = random.nextDouble();

        if (criticalChance < 0.1) {
            // 크리티컬 발동
            System.out.println("크리티컬 공격!");
            return (attack + random.nextInt(16)) * 2;
        } else {
            return attack + random.nextInt(16);
        }
    }

    public int RandomMap(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public void Print_Explan(){
        Scanner sc = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("*** {던전 탈출 시뮬레이션!} 설명 ***");
        System.out.println("1. 공격력");
        System.out.println("2. 몬스터");
        System.out.println("======================");
        System.out.print("선택 : ");
        int Exp_choice = sc.nextInt();
        System.out.print("\n");

        switch (Exp_choice) {
            case 1:
                System.out.println("공격력 : 공격력은 줄 수 있는 데이지의 최소값으로,\n" +
                                    "플레이어의 경우 +0~15, 몬스터의 경우 +0~10의 랜덤값이 더해져서 공격된다.");
                break;
            case 2:
                System.out.println("몬스터 : ");
                break;
        }
    }
}
