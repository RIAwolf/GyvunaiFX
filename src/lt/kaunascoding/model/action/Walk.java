package lt.kaunascoding.model.action;

import lt.kaunascoding.model.AnimalsCRUD;

public class Walk implements IAction {
    @Override
    public String toString() {
        return AnimalsCRUD.ACTION_WALK;
    }

    @Override
    public void doAction() {
        System.out.println("I walk");
    }
}
