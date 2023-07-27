package Stage;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Stage {
    public static void main(String[] args) {
        Stage stage = new Stage();
        int numberOfMaps = stage.RandomMap(10, 15);
        System.out.println("맵의 수 : " + numberOfMaps);
        stage.ChoicePr();

    }

    void ChoicePr(){
        System.out.println("===============");
        System.out.println("1. 왼쪽");
        System.out.println("2. 중간");
        System.out.println("3. 오른쪽");
        System.out.println("===============");

        int choice = getChoiceFromUser();
        String events;

        switch (choice) {
            case 1:
                System.out.println("1. 왼쪽 선택");
                events = Randomevent();
                System.out.println("이벤트 : " + events);
                break;
            case 2:
                System.out.println("2. 중간 선택");
                events = Randomevent();
                System.out.println("이벤트 : " + events);
                break;
            case 3:
                System.out.println("3. 오른쪽 선택");
                events = Randomevent();
                System.out.println("이벤트 : " + events);
                break;
            default:
                System.out.println("선택지에 없습니다. 다시 선택하세요.");
                ChoicePr();
        }
    }

    int getChoiceFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1, 2, 3 중 하나를 선택하세요: ");
        int choice = sc.nextInt();

        return choice;
    }

    int RandomMap(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    String Randomevent(){
        double randomTp;

        randomTp=(int)(Math.random()*(100-1+1)+1);
        if(1<=randomTp && randomTp <=10)
            return "공터";
        else if (11<=randomTp && randomTp <= 35)
            return "쉼터";
        else if (36<=randomTp && randomTp <= 60)
            return "함정!";
        else
            return "몬스터 습격!!!";

    }
}
