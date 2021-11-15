package com.company.characters;


import com.company.ICharacter;
import com.company.abilities.AlacrityFirstAbility;
import com.company.abilities.BoundlessStrikeSecondAbility;
import com.company.Character;

public class MonkeyKing extends Character implements ICharacter {
    public MonkeyKing() {
        super(new AlacrityFirstAbility(), new BoundlessStrikeSecondAbility());
    }

    @Override
    public void display() {
        System.out.println("I`m Monkey King");
    }

    @Override
    public void talk() {
        System.out.println("Looks like I've got some new stories to tell");
    }
}
