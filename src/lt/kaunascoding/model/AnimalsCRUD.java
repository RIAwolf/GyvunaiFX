package lt.kaunascoding.model;

import lt.kaunascoding.model.action.Fly;
import lt.kaunascoding.model.action.IAction;
import lt.kaunascoding.model.action.Sneak;
import lt.kaunascoding.model.action.Walk;
import lt.kaunascoding.model.animal.Animal;
import lt.kaunascoding.model.animal.Cat;
import lt.kaunascoding.model.animal.Dog;
import lt.kaunascoding.model.animal.Pigeon;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalsCRUD {

    public static final String ACTION_WALK = "walk";
    public static final String ACTION_SNEAK = "sneak";
    public static final String ACTION_FLY = "fly";

    public static final String ANIMAL_CAT = "cat";
    public static final String ANIMAL_DOG = "dog";
    public static final String ANIMAL_PIGEON = "pigeon";

    private static AnimalsCRUD instance;
    private String fileName;
    private ArrayList<Animal> animals;

    private AnimalsCRUD() {
    }

    public static AnimalsCRUD getInstance() {
        if (instance == null) {
            instance = new AnimalsCRUD();
        }
        return instance;
    }

    public void setFileName(String parFileName) {
        fileName = parFileName;
    }

    public void addAnimal(Animal obj) {
        animals.add(obj);
    }

    public void loadAllAnimals() {
        // susikurti gyvunu array list
        animals = new ArrayList<>();

        // atsidaryti faila
        File file = new File(fileName);

        try {
            // susikurti scanneri
            Scanner sc = new Scanner(file);

            // eiti per failo eilutes
            while (sc.hasNext()) {
                Animal obj = null;
                // paversti teksto eilute i gyvuno objekta
                obj = makeAnimal(sc.nextLine());
                // gauta objekta pasideti i animals ArrayList
                addAnimal(obj);
            }

            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private IAction makeAction(String action) {
        IAction result = null;

        switch (action.toLowerCase()) {
            case ACTION_WALK:
                result = new Walk();
                break;
            case ACTION_SNEAK:
                result = new Sneak();
                break;
            case ACTION_FLY:
                result = new Fly();
                break;
            default:
                System.out.println("Tokio veiksmo nėra");
        }

        return result;
    }

    private Animal makeAnimal(String line) {
        Animal result = null;

        String[] zodziai = line.split(" ");
        /// "a b c" => {"a","b","c"}
        String animalClass = zodziai[0];
        String animalType = zodziai[1];
        String animalName = zodziai[2];
        float animalWeight = Float.parseFloat(zodziai[3]);
        float animalHeight = Float.parseFloat(zodziai[4]);
        String animalAction = zodziai[5];

        switch (animalClass.toLowerCase()) {
            case ANIMAL_CAT:
                result = new Cat(makeAction(animalAction));
                break;
            case ANIMAL_DOG:
                result = new Dog(makeAction(animalAction));
                break;
            case ANIMAL_PIGEON:
                result = new Pigeon(makeAction(animalAction));
                break;
            default:
                System.out.println("Šito žvėriaus nepažįstu");
        }

        result.setName(animalName);
        result.setType(animalType);
        result.setWeight(animalWeight);
        result.setHeight(animalHeight);

        return result;
    }

    public void saveAllAnimals() {
        try {
            FileWriter writer = new FileWriter(fileName);
            String prefix = "";
            for (Animal obj : animals) {

                writer.write(prefix + obj.toString());
                prefix = "\n";
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteAllAnimals(){
        animals.clear();
        saveAllAnimals();
    }

    public ArrayList<Animal> getAllAnimals(){
        return animals;
    }

    public void updateAnimalAt(Animal obj, int i){
        animals.add(i, obj);
    }
}
