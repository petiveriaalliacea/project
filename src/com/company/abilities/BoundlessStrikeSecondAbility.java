package com.company.abilities;


import com.company.SecondAbilityBehavior;

public class BoundlessStrikeSecondAbility implements SecondAbilityBehavior {
    @Override
    public void secondAbility() {
        System.out.println("I`m using my second ability - Boundless Strike");
    }
}
