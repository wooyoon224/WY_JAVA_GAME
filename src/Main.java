import Stage.Stage;
import Stage.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Stage stage = new Stage();
        int numberOfMaps = stage.RandomMap(10, 15);
        System.out.println("맵의 수 : " + numberOfMaps);
        stage.ChoicePr();

    }
}