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

        // 몬스터의 체력을 랜덤하게 설정 (25 이상 50 이하)
        int monsterHP = random.nextInt(26) + 25;
        int monsterMaxHP = monsterHP;
        double monsterType = random.nextDouble();

        if (monsterType < 0.25) {
            // 몬스터 A
            System.out.println("몬스터 A와 전투 시작!");
            int attackDamage = 0;

            while (character.hp > 0 && monsterHP > 0) {

                boolean isAttack = true;

                if (random.nextDouble() < 0.15) {
                    // 몬스터 A가 회피
                    System.out.println("몬스터 A가 회피합니다. 아무 피해도 입지 않았습니다.\n");
                    isAttack = false;
                }

                if (isAttack) {
                    // 공격력을 랜덤하게 설정 (10 이상 25 이하)
                    attackDamage = random.nextInt(16) + 10;
                    character.hp -= attackDamage;

                    System.out.println("몬스터 A의 공격! 체력이 " + attackDamage + "만큼 감소했습니다.");
                    monsterHP = PlayerAttack(character, monsterHP, monsterMaxHP);
                }
            }
        } else {
            // 몬스터 B
            System.out.println("몬스터 B와 전투 시작!");

            while (character.hp > 0 && monsterHP > 0) {
                // 몬스터 B 공격
                int attackDamage = random.nextInt(16) + 15;
                character.hp -= attackDamage;

                System.out.println("몬스터 B의 공격! 체력이 " + attackDamage + "만큼 감소했습니다.");
                monsterHP = PlayerAttack(character, monsterHP, monsterMaxHP);
            }
        }

        if (character.hp <= 0) {
            System.out.println("게임 오버! 체력이 0 이하입니다.\n");
            System.exit(0); // 프로그램 종료
        }

        if (monsterHP <= 0) {
            System.out.println("몬스터를 성공적으로 처치했습니다.\n");
        }
    }

    public int PlayerAttack(MyCharacter character, int monsterHP, int MaxHP) {
        // 플레이어가 몬스터를 공격
        int playerAttackDamage = character.attackMonster();
        System.out.println(character.name + "의 공격! 몬스터에게 " + playerAttackDamage + "의 데미지를 주었습니다.");

        monsterHP -= playerAttackDamage;

        System.out.println("*** 몬스터 체력 : " + monsterHP + "/" + MaxHP + " *** \n");

        return monsterHP;
    }

}
