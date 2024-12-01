package all.stages;

import all.MyApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuStage{
    private final static int WIDTH = 420;
    private final static int HEIGHT = 480;

    public static void display(Stage stage) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(MyApplication.class.getResource("menu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), WIDTH, HEIGHT);
        stage.setTitle("GAME");

        Image image = new Image("file: /Users/aleksandralitvak/IdeaProjects/MyProject/src/main/resources/all/myCursor.png");
        scene.setCursor(new ImageCursor(image));
        stage.setScene(scene);
        stage.show();
    }


}
