package com.company.abilities;

import com.company.SecondAbilityBehavior;

public class NoSecondAbility implements SecondAbilityBehavior {
    @Override
    public void secondAbility() {
        System.out.println("Don`t have second ability");
    }
}
