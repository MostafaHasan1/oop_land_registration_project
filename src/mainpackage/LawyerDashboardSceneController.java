/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author Hasan
 */
public class LawyerDashboardSceneController implements Initializable {

    @FXML
    private ListView<String> lawyerEventList;
    
    String[] LawyerEventList = {"Dashboard", "Cases", "Clint messeages",
                                "Government notices", "Transaction", "Query", "Profile", "Sing out"};
    String selectedListEvent;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lawyerEventList.getItems().addAll(LawyerEventList);
    }    
    
}
