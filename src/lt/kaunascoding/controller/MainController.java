package lt.kaunascoding.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.VBox;
import lt.kaunascoding.model.AnimalsCRUD;
import lt.kaunascoding.model.animal.Animal;

import java.io.IOException;
import java.util.ArrayList;

public class MainController {

//    public MainController(){
//        AnimalsCRUD.getInstance().setFileName("data.txt");
//        AnimalsCRUD.getInstance().loadAllAnimals();
//
//        ArrayList<Animal> gyvunai = AnimalsCRUD.getInstance().getAllAnimals();
//
//        for(Animal obj : gyvunai){
//            System.out.println(obj);
//        }
//    }

    public VBox animalList;

    public MainController() {
        AnimalsCRUD.getInstance().setFileName("data.txt");
    }

    public void handleOpen() {

        AnimalsCRUD.getInstance().loadAllAnimals();

        ArrayList<Animal> gyvunai = AnimalsCRUD.getInstance().getAllAnimals();

        for (Animal obj : gyvunai) {
            try {
                Node element = FXMLLoader.load(getClass().getResource("../view/Animal.fxml"));
                animalList.getChildren().add(element);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void handleSave() {
        // susirinkti atualia info is VBox

        AnimalsCRUD.getInstance().saveAllAnimals();
    }

    public void handleAdd() {
        // atidaryti pop-up langa kuriame supildys gyvuno info

    }
}
