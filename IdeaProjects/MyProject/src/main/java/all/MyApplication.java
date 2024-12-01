package all;

import all.stages.MenuStage;
import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;

public class MyApplication extends Application{
    @Override
    public void start(Stage stage) throws IOException{
        MenuStage.display(stage);
    }

    public static void main(String[] args){
        launch();
    }
}