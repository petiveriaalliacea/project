package com.company.characters;


import com.company.abilities.AlacrityFirstAbility;
import com.company.Character;
import com.company.abilities.TeleportSecondSkillAbility;

public class AntiMage extends Character {

    public AntiMage() {
        super(new AlacrityFirstAbility(), new TeleportSecondSkillAbility());
    }

    @Override
    public void display() {
        System.out.println("I`m Anti-Mage");
    }
}
