package com.mycompany.app;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
<<<<<<< HEAD
        int a=0;
        if(a>0)
=======
        int a=2;
        if( a>0 || a<5)
>>>>>>> main
            {
                App.setRoot("secondary");
            }
        
    }
}
