/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Hasan
 */
public class ChooseUsertypeForSignupController implements Initializable {

    @FXML
    private ComboBox<String> usertypeComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        usertypeComboBox.getItems().addAll(
                // Moktar
                "Lawyer","Tax assessor","Buyer", "Seller",
                "Property Owner", "Government Official", "Surveyor",
                "Bank representative"
        );
    }
    /*private void handleSceneComboBoxAction(ActionEvent event) throws IOException {
        String selectedItem = usertypeComboBox.getSelectionModel().getSelectedItem().toString();
        switch(selectedItem){
            case "Lawyer":
                Parent lawyerMenuList = FXMLLoader.load(getClass().getResource("lawyerSignupScene.fxml"));
                Scene lawyerMenuListScene = new Scene(lawyerMenuList);
                Stage lawyerMenuListStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                lawyerMenuListStage.setTitle("Lawyer");
                lawyerMenuListStage.setScene(lawyerMenuListScene);
                lawyerMenuListStage.show();
    
    
    }    

    
}*/

    @FXML
    private void nextButttonOnClick(ActionEvent event) throws IOException {
        String selectedItem = usertypeComboBox.getSelectionModel().getSelectedItem().toString();
        switch(selectedItem){
            case "Lawyer":
                Parent lawyerMenuList1 = FXMLLoader.load(getClass().getResource("lawyerSignupScene.fxml"));
                Scene lawyerMenuListScene1 = new Scene(lawyerMenuList1);
                Stage lawyerMenuListStage1  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                lawyerMenuListStage1.setTitle("Lawyer");
                lawyerMenuListStage1.setScene(lawyerMenuListScene1);
                lawyerMenuListStage1.show();
            case "Surveyor":
                Parent lawyerMenuList2 = FXMLLoader.load(getClass().getResource("SurveyorSignUpScene.fxml"));
                Scene lawyerMenuListScene2 = new Scene(lawyerMenuList2);
                Stage lawyerMenuListStage2  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                lawyerMenuListStage2.setTitle("Lawyer");
                lawyerMenuListStage2.setScene(lawyerMenuListScene2);
                lawyerMenuListStage2.show();
        }
    }
}