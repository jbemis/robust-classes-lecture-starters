package model;

import exceptions.AllergyException;
import exceptions.NotHungry;

public class Animal {

    private boolean isHungry;
    private boolean isAllergic;
    private int eaten = 0;
    private int initialEaten;

    public Animal(boolean hungry, boolean allergic) {
        this.isHungry = hungry;
        this.isAllergic = allergic;
    }

    // getters
    public boolean isHungry() { return isHungry; }

    // REQUIRES: animal must be hungry
    public int eat() throws NotHungry, AllergyException {
        initialEaten = eaten;
        if(!isHungry){
            System.out.println("Animal not hungry!");
            throw new NotHungry();
        }
        if (isAllergic) {
            System.out.println("Animal allergic!");
            throw new AllergyException();
        }
        System.out.println("Animal is eating!");
        isHungry = false;
        //eaten++;
        assert(!isHungry && (eaten > initialEaten));
        return eaten;
    }


}