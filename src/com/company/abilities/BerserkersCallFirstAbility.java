package com.company.abilities;

import com.company.FirstAbilityBehavior;

public class BerserkersCallFirstAbility implements FirstAbilityBehavior {
    @Override
    public void firstAbility() {
        System.out.println("I`m using my first ability - Berserker's call");
    }
}
