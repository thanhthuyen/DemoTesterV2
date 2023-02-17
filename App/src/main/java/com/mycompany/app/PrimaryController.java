package com.mycompany.app;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int a=9;
        if(a>0)
            {
                App.setRoot("secondary");
            }
        
    }
}
