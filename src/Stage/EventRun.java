package Stage;
import Character.*;
import java.util.Random;

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

        while (character.hp > 0 && monsterHP > 0) {
            // 몬스터가 플레이어를 공격
            int attackDamage = monster.attackPlayer();
            System.out.println(monster.name + "(이)가 " + character.name + "을 공격합니다!");
            character.hp -= attackDamage;
            System.out.println(character.name + "의 체력이 " + attackDamage + "만큼 감소했습니다.");

            System.out.println("*** " + character.name + " 체력 : " + character.hp + "/ 100 ***\n");

            // 플레이어가 몬스터를 공격
            int playerAttackDamage = character.attackMonster();
            System.out.println(character.name + "(이)가 " + monster.name + "을 공격합니다!");
            monsterHP -= playerAttackDamage;
            System.out.println("몬스터의 체력이 " + playerAttackDamage + "만큼 감소했습니다.");

            // 몬스터의 체력 출력
            System.out.println("*** 몬스터 체력 : " + monsterHP + "/" + monster.hp + " ***\n");
        }

        if (character.hp <= 0) {
            System.out.println("게임 오버! 체력이 0 이하입니다.\n");
            System.exit(0); // 프로그램 종료
        }

        if (monsterHP <= 0) {
            System.out.println("몬스터를 성공적으로 처치했습니다.\n");
        }
    }
}
