package model;

import exceptions.*;

import java.util.List;

public class Manager {

    private final List<Animal> animalsToManage;
    private final Keeper keeper;

    public Manager(List<Animal> animals, Keeper keeper) {
        this.animalsToManage = animals;
        this.keeper = keeper;
    }

    public void manage() throws BrokeException {
        System.out.println("Manager is managing the keeper");
        try {
            keeper.feed();
        } catch (DidntEat e) {
            System.out.println("Get the doctor!");
            throw new BrokeException();
        } catch (MessyError messyError){
            System.out.println("Keeper, you're fired!");
        }
        finally {
            System.out.println("Finally Manager says: Regardless of what happens");
        }
    }


}