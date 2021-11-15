package com.company.characters;


import com.company.Character;
import com.company.abilities.NoSecondAbility;
import com.company.abilities.OverWhelmingOddsFirstAbility;

public class Meepo extends Character {

    public Meepo() {
        super(new OverWhelmingOddsFirstAbility(), new NoSecondAbility());
    }

    @Override
    public void display() {
        System.out.println("I`m Meepo");
    }
}
