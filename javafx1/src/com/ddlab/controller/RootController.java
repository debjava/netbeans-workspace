/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ddlab.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author PIKU
 */
public class RootController {
    
    @FXML
    private Button btnId1;
    
    
    
    @FXML
	private void initialize() {
            btnId1.setOnAction((event) -> {
            System.out.println("You clicked .....");
            
            FXMLLoader loader = new FXMLLoader(RootController.class.getResource("aa.fxml"));
            AnchorPane overviewPage;
                try {
                    overviewPage = (AnchorPane) loader.load();
                    
                    Scene newScene = new Scene(overviewPage);
                    
                    Stage st1 = (Stage) btnId1.getScene().getWindow();
                    
//                    Stage stage = new Stage(StageStyle.DECORATED);
//                    stage.setScene(newScene);
//                    stage.show();

                        st1.setScene(newScene);
                        st1.show();
//                    overviewPage.
//    stage.setScene(newScene);
                    
                    
                } catch (IOException ex) {
                    Logger.getLogger(RootController.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
//            rootLayout.setCenter(overviewPage);


            
            
            
            
        });
        }
    
    	@FXML
	private void handleExit() {
		System.exit(0);
	}
    
}
