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

    public void Monster(MyCharacter character){
        Random random = new Random();
        double monsterType = random.nextDouble(); // 0.0 이상 1.0 미만의 랜덤 실수

        if (monsterType < 0.25) {
            // 몬스터 A
            System.out.println("몬스터 A와 전투 시작!");

            double attackOrDodge = random.nextDouble(); // 0.0 이상 1.0 미만의 랜덤 실수

            if (attackOrDodge < 0.85) {
                // 몬스터 A가 공격
                System.out.println("몬스터 A가 공격합니다.");

                // 공격력을 랜덤하게 설정 (10 이상 25 이하)
                int attackDamage = random.nextInt(16);
                character.hp -= attackDamage;

                System.out.println("몬스터 A의 공격! 체력이 " + attackDamage + "만큼 감소했습니다.");
            }
            else {
                // 몬스터 A가 회피
                System.out.println("몬스터 A가 회피합니다. 아무 피해도 입지 않았습니다.");
            }
        }
        else {
            // 몬스터 B
            System.out.println("몬스터 B와 전투 시작!");

            // 몬스터 B가 공격
            System.out.println("몬스터 B가 공격합니다.");

            // 공격력을 랜덤하게 설정 (15 이상 30 이하)
            int attackDamage = random.nextInt(19);
            character.hp -= attackDamage;

            System.out.println("몬스터 B의 공격! 체력이 " + attackDamage + "만큼 감소했습니다.");
        }

        if (character.hp <= 0) {
            System.out.println("게임 오버! 체력이 0 이하입니다.");
            System.exit(0); // 프로그램 종료
        }
    }
}
