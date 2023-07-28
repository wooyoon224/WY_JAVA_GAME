package Character;

import java.util.Random;

public class MonsterA extends Monster {
    public MonsterA() {
        super("몬스터 A", new Random().nextInt(26) + 25, 8);
    }

    public int attackPlayer() {
        if (Math.random() < 0.3) {
            System.out.println(name + "가 회피합니다. 아무 피해도 입지 않았습니다.");
            return 0;
        } else {
            return super.attackPlayer(); // 부모 클래스의 attackPlayer 메서드 호출
        }
    }
}