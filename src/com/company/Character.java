package com.company;

public abstract class Character{
    private String name;
    private FirstAbilityBehavior firstAbilityBehavior;
    private SecondAbilityBehavior secondAbilityBehavior;

    public Character(FirstAbilityBehavior firstAbilityBehavior, SecondAbilityBehavior secondAbilityBehavior) {
        this.firstAbilityBehavior = firstAbilityBehavior;
        this.secondAbilityBehavior = secondAbilityBehavior;
    }

    public void setFirstSkillBehavior(FirstAbilityBehavior firstAbilityBehavior) {
        this.firstAbilityBehavior = firstAbilityBehavior;
    }

    public void setSecondSkillBehavior(SecondAbilityBehavior secondAbilityBehavior) {
        this.secondAbilityBehavior = secondAbilityBehavior;
    }

    public void performFirstSkill() {
        firstAbilityBehavior.firstAbility();
    }

    public void performSecondSkill() {
        secondAbilityBehavior.secondAbility();
    }

    public abstract void display();


}
