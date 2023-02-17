package com.mycompany.app;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int a=2;
        if( a>0 || a<5)
            {
                App.setRoot("secondary");
            }
        
    }
}
