package org.character.player.skill;

public abstract class Skill implements Action {
    protected int manaCost;

    public int getManaCost() {
        return manaCost;
    }
}
