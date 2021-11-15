package com.company.characters;

import com.company.abilities.BerserkersCallFirstAbility;
import com.company.Character;
import com.company.abilities.DoomSecondAbility;

public class Alchemist extends Character {
    public Alchemist() {
        super(new BerserkersCallFirstAbility(), new DoomSecondAbility());
    }

    @Override
    public void display() {
        System.out.println("I`m alchemist");
    }
}
