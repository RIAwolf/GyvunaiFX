package lt.kaunascoding.model.action;

import lt.kaunascoding.model.AnimalsCRUD;

public class Sneak implements IAction{
    @Override
    public void doAction() {
        System.out.println("I snek");
    }

    @Override
    public String toString() {
        return AnimalsCRUD.ACTION_SNEAK;
    }
}
