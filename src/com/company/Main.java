package com.company;

import com.company.abilities.BoundlessStrikeSecondAbility;
import com.company.abilities.TornadoFirstAbility;
import com.company.characters.Alchemist;
import com.company.characters.Centaur;
import com.company.characters.MonkeyKing;

public class Main {

    public static void main(String[] args) {
        Character character = new Alchemist();
        character.display();
        character.performFirstSkill();
        character.performSecondSkill();
        System.out.println("....");
        character.setFirstSkillBehavior(new TornadoFirstAbility());
        character.setSecondSkillBehavior(new BoundlessStrikeSecondAbility());
        character.performFirstSkill();
        character.performSecondSkill();

        System.out.println("....");

        ICharacter character1 = new MonkeyKing();
        ((MonkeyKing) character1).display();
        character1.talk();
        IBotWildNPC botWildNPC = new Centaur(null, null);
        ((Centaur) botWildNPC).display();
        botWildNPC.howling();
        character1 = new CharacterAdapter(botWildNPC);
        character1.talk();
    }
}
