package org.character.player.skill.buffSkill.strScale;

import org.character.Character;
import org.character.player.skill.buffSkill.BuffSkill;

public class BuffAtk extends BuffSkill {

    public BuffAtk() {
        this.manaCost = 100;
        this.scale = 10;
    }

    @Override
    public void action(Character character, int intelligence, int agility, int strength, int atkPower) {
        character.setAtkPower(this.scale * strength);
    }
}
