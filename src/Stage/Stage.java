package Stage;

import Stage.*;
import Character.*;
import java.util.Scanner;

public class Stage {
    public void ChoicePr(MyCharacter character){
        System.out.println("======================");
        System.out.println("1. 왼쪽");
        System.out.println("2. 중간");
        System.out.println("3. 오른쪽");
        System.out.println("======================");

        int choice = getChoiceFromUser();
        String events;

        switch (choice) {
            case 1:
                System.out.println("1. 왼쪽 선택");
                character.stage++;
                events = Randomevent();
                System.out.println("이벤트 : " + events);
                EventFilter(events, character);
                break;
            case 2:
                System.out.println("2. 중간 선택");
                character.stage++;
                events = Randomevent();
                System.out.println("이벤트 : " + events);
                EventFilter(events, character);
                break;
            case 3:
                System.out.println("3. 오른쪽 선택");
                character.stage++;
                events = Randomevent();
                System.out.println("이벤트 : " + events);
                EventFilter(events, character);
                break;
            default:
                System.out.println("선택지에 없습니다. 다시 선택하세요.");
                ChoicePr(character);
        }
    }

    public int getChoiceFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1, 2, 3 중 하나를 선택하세요: ");
        int choice = sc.nextInt();

        return choice;
    }

    public String Randomevent(){
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

    public void EventFilter(String event, MyCharacter character){
        event = event.trim(); // 공백 제거
        EventRun eventRun = new EventRun();

        switch (event) {
            case "공터":
                System.out.println("아무일도 일어나지 않았다.");
                break;
            case "쉼터" :
                System.out.println("쉼터 이벤트 발생.");
                eventRun.RestTime(character); // 휴식 이벤트 실행
                break;
            case "함정!" :
                System.out.println("함정 이벤트 발생.");
                eventRun.Trap(character);   // 함정 이벤트 실행
                break;
            case "몬스터 습격!!!" :
                System.out.println("몬스터 습격 이벤트 발생.");
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }

}
