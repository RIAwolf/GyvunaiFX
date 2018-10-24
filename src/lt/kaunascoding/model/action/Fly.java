package lt.kaunascoding.model.action;

import lt.kaunascoding.model.AnimalsCRUD;

public class Fly implements IAction{
    @Override
    public void doAction() {
        System.out.println("I fly");
    }

    @Override
    public String toString() {
        return AnimalsCRUD.ACTION_FLY;
    }
}
