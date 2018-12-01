/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx1;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author PIKU
 */
public class Javafx1 extends Application {
    
    private BorderPane rootLayout;
    
    @Override
    public void start(Stage stage) throws Exception {
        
//        getClass().getResource("a1.fxml");
        
//        getClass().getResource("a1.fxml")
        rootLayout = FXMLLoader.load(getClass().getResource("a3.fxml"));

//rootLayout = FXMLLoader.load(Javafx1.class.getResource("a1.fxml"));

//    rootLayout = FXMLLoader.load(getClass().getClassLoader().getResource("a1.fxml"));
//    URL url  = getClass().getResource( "a2.fxml" );
//    rootLayout = FXMLLoader.load(url);
        
        Scene scene = new Scene(rootLayout);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
