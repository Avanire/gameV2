package org.character.player.skill.atkSkill.intScale;

import org.character.Character;
import org.character.player.skill.atkSkill.AttackSkill;

public class MagicArrow extends AttackSkill {

    public MagicArrow() {
        this.manaCost = 50;
        this.damage = 10;
    }

    @Override
    public void action(Character character, int intelligence, int agility, int strength, int atkPower) {
        character.setHp(-(this.damage * intelligence / character.getArmor()));
    }
}
