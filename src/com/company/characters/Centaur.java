package com.company.characters;

import com.company.Character;
import com.company.FirstAbilityBehavior;
import com.company.IBotWildNPC;
import com.company.SecondAbilityBehavior;

public class Centaur extends Character implements IBotWildNPC {
    public Centaur(FirstAbilityBehavior firstAbilityBehavior, SecondAbilityBehavior secondAbilityBehavior) {
        super(firstAbilityBehavior, secondAbilityBehavior);
    }

    @Override
    public void howling() {
        System.out.println("Mmmm.");
    }

    @Override
    public void display() {
        System.out.println("I am Centaur!");
    }
}
