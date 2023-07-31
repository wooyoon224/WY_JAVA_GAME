package Stage;
import Character.*;

import java.util.Random;
import java.util.Scanner;

public class EventRun {
    public void RestTime(MyCharacter character) {
        Random random = new Random();

        // 10~30의 랜덤한 수
        int hpRest = random.nextInt(21) + 10;
        character.hp += hpRest;

        // HP가 100 이상인 경우 100으로 고정
        if (character.hp > 100) {
            character.hp = 100;
        }

        System.out.println("휴식을 취해 체력이 " + hpRest + " 회복되었습니다.");
    }

    public void Trap(MyCharacter character){
        Random random = new Random();

        // 0~15의 랜덤한 수
        int hpTrap = random.nextInt(16);
        character.hp-=hpTrap;

        System.out.println("함정으로 인해 HP " + hpTrap + "이 감소합니다.");

        if (character.hp <= 0) {
            System.out.println("GAME OVER!");
            System.exit(0); // 프로그램 종료
        }
    }

    public void Monster(MyCharacter character) {
        Random random = new Random();
        Stage stage = new Stage();

        Monster monster;
        if (random.nextDouble() < 0.25) {
            // 몬스터 A 생성
            monster = new MonsterA();
        }
        else {
            // 몬스터 B 생성
            monster = new MonsterB();
        }

        // 몬스터 정보 출력
        monster.Print_Monster();

        // 몬스터의 체력을 저장
        int monsterHP = monster.hp;
        Scanner sc = new Scanner(System.in);

        while (character.hp > 0 && monsterHP > 0) {
            System.out.println("======================");
            System.out.println("1. 싸운다");
            System.out.println("2. 도망친다");
            System.out.println("======================");
            System.out.print("선택지 : ");
            int sc_Attack= sc.nextInt();

            if(sc_Attack==1) {
                System.out.println("[싸운다 선택]");
                // 플레이어와 몬스터의 공격 턴
                monsterHP = battleTurn(character, monster, monsterHP);
            }
            else if (sc_Attack==2) {
                System.out.println("[도망친다 선택]");

                // 10%의 확률로 도망침
                if (random.nextDouble() < 0.1) {
                    System.out.println("무사히 도망쳤습니다.\n");
                    break;
                }
                else {
                    System.out.println("도망치지 못했습니다.\n");
                    // 플레이어와 몬스터의 공격 턴
                    monsterHP = battleTurn(character, monster, monsterHP);
                }
            }
            else
                System.out.println("잘못 선택 했습니다. 다시 선택하세요.");
        }

        if (character.hp <= 0) {
            System.out.println("게임 오버! 체력이 0 이하입니다.\n");
            System.out.println("*** [" + character.stage + "/" + character.numberOfMaps + "] ***");
            System.exit(0); // 프로그램 종료
        }

        if (monsterHP <= 0) {
            System.out.println("몬스터를 성공적으로 처치했습니다.\n");
        }
    }

    public int battleTurn(MyCharacter character, Monster monster, int monsterHP) {
        System.out.println("전투시작!!!");

        // 몬스터가 플레이어를 공격
        int monsterAttackDamage = monster.attackPlayer();
        System.out.println(monster.name + "(이)가 " + character.name + "을 공격합니다!");
        character.hp -= monsterAttackDamage;
        System.out.println(character.name + "의 체력이 " + monsterAttackDamage + "만큼 감소했습니다.");

        System.out.println("*** " + character.name + " 체력 : " + character.hp + "/ 100 ***\n");

        // 플레이어가 몬스터를 공격
        int playerAttackDamage = character.attackMonster();
        System.out.println(character.name + "(이)가 " + monster.name + "을 공격합니다!");
        monsterHP -= playerAttackDamage;
        System.out.println("몬스터의 체력이 " + playerAttackDamage + "만큼 감소했습니다.");

        // 몬스터의 체력 출력
        System.out.println("*** 몬스터 체력 : " + monsterHP + "/" + monster.hp + " ***\n");
        return monsterHP;
    }
}
