package com.company.abilities;

import com.company.SecondAbilityBehavior;

public class StunSecondAbility implements SecondAbilityBehavior {
    @Override
    public void secondAbility() {
        System.out.println("I`m using my second ability - Stun");
    }
}
