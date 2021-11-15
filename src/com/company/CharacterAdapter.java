package com.company;

public class CharacterAdapter implements ICharacter{
    private IBotWildNPC iBotWildNPC;

    public CharacterAdapter(IBotWildNPC iBotWildNPC) {
        this.iBotWildNPC = iBotWildNPC;
    }

    @Override
    public void talk() {
        System.out.print("Using Adapter --> ");
        iBotWildNPC.howling();
    }
}
