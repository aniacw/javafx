package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main extends Application {

    private static <T> void display(Collection<T> collection){
        for (T t : collection){
            System.out.println(t.toString());
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
//        sample.ArrayList<String> a = new sample.ArrayList<>(3);
//
//        List<String> l = new ArrayList<>();
//        l.add("aaa");
//        l.add("bbb");
//        display(l);
    }
}
