package Character;
import java.util.Random;
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
        System.out.println("공격력 : " + attack);
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
}
