package org.character.player.skill.buffSkill.strScale;

import org.character.Character;
import org.character.player.skill.buffSkill.BuffSkill;

public class BuffHp extends BuffSkill {

    public BuffHp() {
        this.manaCost = 100;
        this.scale = 5;
    }


    @Override
    public void action(Character character, int intelligence, int agility, int strength, int atkPower) {
        character.setHp(scale * strength);
    }
}
