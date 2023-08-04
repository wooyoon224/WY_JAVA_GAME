package Character;

import java.util.Random;

public class MonsterA extends Monster {
    public MonsterA() {
        super("몬스터 A", new Random().nextInt(26) + 15, 8);
    }

    public int attackPlayer() {
        if (Math.random() < 0.5) {

            return 0;
        } else {
            return super.attackPlayer(); // 부모 클래스의 attackPlayer 메서드 호출
        }
    }
}