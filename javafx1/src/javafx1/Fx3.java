/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx1;

import com.ddlab.controller.RootController;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author PIKU
 */
public class Fx3 extends Application {
    
    
    
//    private BorderPane rootLayout;
    
    @Override
    public void start(Stage stage) throws Exception {
        
//        rootLayout = FXMLLoader.load(getClass().getResource("a3.fxml"));    
        
        VBox vBox = FXMLLoader.load(getClass().getResource("a3.fxml")); 
        
//        FXMLLoader loader = FXMLLoader.load(getClass().getResource("a3.fxml"));
//        RootController root = loader.getController();
        
               
        Scene scene = new Scene(vBox);
        
        
        
        stage.setScene(scene);
//        stage.show();
        
        
        
    }

    public static void main(String[] args) {
        launch(args);
    }
}
