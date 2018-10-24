package lt.kaunascoding.model.animal;

import lt.kaunascoding.model.AnimalsCRUD;
import lt.kaunascoding.model.action.IAction;

public class Cat extends Animal {
    public Cat(IAction action) {
        changeAction(action);
    }

    @Override
    public String toString() {
        return AnimalsCRUD.ANIMAL_CAT+" "+super.toString();
    }
}
