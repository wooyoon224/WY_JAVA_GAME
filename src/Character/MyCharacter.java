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

        while (true) {
            System.out.println("======================");
            System.out.println("*** {던전 탈출 시뮬레이션!} 설명 ***");
            System.out.println("1. 설정");
            System.out.println("2. 플레이어");
            System.out.println("3. 몬스터");
            System.out.println("4. 공격력");
            System.out.println("5. 맵");
            System.out.println("6. Quit");
            System.out.println("======================");
            System.out.print("선택 : ");
            int Exp_choice = sc.nextInt();
            System.out.print("\n");

            if(Exp_choice==6){
                break;
            }

            switch (Exp_choice) {
                case 1:
                    System.out.println("설정 : 어느날 눈을 떠보니" + name +"은 어두운 던전 안쪽이었다.\n" +
                            "이곳이 던전 입구의 근처인지 아닌지도 모르는 상황. 몬스터들이 알아차리기 전에 바깥으로 탈출하는게 우선이다.\n" +
                            "죽지 않고 던전 밖으로 탈출하자!");
                    break;
                case 2:
                    System.out.println("플레이어 : 플레이어는 10~15개의 랜덤한 수의 스테이지를 지나야하는 것이 게임 클리어 목표이다.\n" +
                            "설정한 이름, HP는 최대 100으로 고정, 공격력은 최소 20으로 고정된다.\n");
                    break;
                case 3:
                    System.out.println("몬스터 : 몬스터의 종류는 몬스터 A와 몬스터 B가 있으며,\n" +
                            "몬스터 A는 25% 확률로 등장하며 30%의 확률로 회피를 할 수 있는 몬스터이며, HP는 15~40사이로 등장한다.\n" +
                            "몬스터 B의 경우는 일반 몬스터로 일반 공격만 가능하다. HP는 25~50 사이로 등장한다.\n");
                    break;
                case 4:
                    System.out.println("공격력 : 공격력은 줄 수 있는 데이지의 최소값으로,\n" +
                            "플레이어의 경우 일반공격 +0~15, 10%의 확률로 크리티컬로 공격*2의 데미지가 들어간다.\n" +
                            "몬스터의 경우 +0~10의 랜덤값이 더해져서 공격된다.\n");
                    break;
                case 5:
                    System.out.println("맵 : 맵은 쉼터(25%), 몬스터 습격(40%), 함정(25%), 공터(10%)로 나타난다.\n" +
                            "-쉼터- 10~30의 HP를 랜덤으로 회복한다.\n" +
                            "-몬스터 습격- 싸움과 도망 중 하나를 선택할 수 있고, 10%의 확률로 도망에 성공한다.\n" +
                            "-함정- 0~15의 HP가 랜덤으로 감소한다.\n" +
                            "-공터- 아무 일도 일어나지 않고 다음 스테이지로 넘어간다.\n");
                    break;

            }
        }
    }
}
