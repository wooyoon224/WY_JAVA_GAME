package Character;

import java.util.Random;

public class MonsterB extends Monster {
    public MonsterB() {
        super("몬스터 B", new Random().nextInt(26) + 25, 10);
    }
}
