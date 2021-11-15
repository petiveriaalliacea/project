package com.company.characters;


import com.company.abilities.AlacrityFirstAbility;
import com.company.Character;
import com.company.abilities.ChronosphereSecondAbility;

public class Void extends Character {

    public Void() {
        super(new AlacrityFirstAbility(), new ChronosphereSecondAbility());
    }

    @Override
    public void display() {
        System.out.println("I`m Void");
    }
}
