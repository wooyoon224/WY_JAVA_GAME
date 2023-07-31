package Character;
import java.util.Random;

public class Monster {
    public String name;
    public int hp;
    public int attack;

    public Monster(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public void Print_Monster() {
        System.out.println("======================");
        System.out.println("몬스터 이름: " + name);
        System.out.println("몬스터 HP : " + hp);
        System.out.println("몬스터 공격력 : " + attack);
        System.out.println("======================");
    }

    public int attackPlayer() {
        Random random = new Random();
        return attack + random.nextInt(11);
    }
}

