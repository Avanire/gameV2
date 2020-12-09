package org.character.player.skill.buffSkill.aglScale;

import org.character.Character;
import org.character.player.skill.buffSkill.BuffSkill;

public class BuffArmor extends BuffSkill {

    public BuffArmor() {
        this.manaCost = 100;
        this.scale = 2;
    }

    @Override
    public void action(Character character, int intelligence, int agility, int strength, int atkPower) {
        character.setArmor(scale * agility);
    }
}
