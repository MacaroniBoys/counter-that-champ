package main;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import main.models.Champ;

public class Controller {

    @FXML
    private ComboBox<String> championSelect;

    // Necessary No Arg Constructor
    public Controller(){}

    @FXML
    private void initialize() {
        championSelect
                .getItems()
                .addAll(Champ.getChampionNames());
    }

}
