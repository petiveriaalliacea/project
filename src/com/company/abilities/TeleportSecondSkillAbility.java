package com.company.abilities;

import com.company.SecondAbilityBehavior;

public class TeleportSecondSkillAbility implements SecondAbilityBehavior {
    @Override
    public void secondAbility() {
        System.out.println("I`m using my second ability - Teleport");
    }
}
