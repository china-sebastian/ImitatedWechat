package cn.edu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

/**
 * @Author 彬哥，邮箱：13450770408@163.com
 * @Description
 * @Date 2023/5/25 20:05
 * github:https://github.com/china-sebastian
 */
public class ApiApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        URL resource = getClass().getResource("/fxml/demo/demo.fxml");
        if (resource != null) {
            Parent root = FXMLLoader.load(resource);
            primaryStage.setScene(new Scene(root,300,275));
            primaryStage.setTitle("Hello World");
            primaryStage.show();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
