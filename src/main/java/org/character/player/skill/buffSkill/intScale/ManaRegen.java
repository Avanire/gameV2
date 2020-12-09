package org.character.player.skill.buffSkill.intScale;

import org.character.Character;
import org.character.player.skill.buffSkill.BuffSkill;

public class ManaRegen extends BuffSkill {

    public ManaRegen() {
        this.manaCost = 50;
        this.scale = 2;
    }

    @Override
    public void action(Character character, int intelligence, int agility, int strength, int atkPower) {
        character.setMp(intelligence * 2);
    }
}
