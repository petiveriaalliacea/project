package com.company.characters;


import com.company.Character;
import com.company.abilities.DoomSecondAbility;
import com.company.abilities.SunStrikeFirstAbility;

public class Invoker extends Character {
    public Invoker() {
        super(new SunStrikeFirstAbility(), new DoomSecondAbility());
    }

    @Override
    public void display() {
        System.out.println("I`m invoker");
    }
}
