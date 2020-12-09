package org.character.player.skill.atkSkill.aglScale;

import org.character.Character;
import org.character.player.skill.atkSkill.AttackSkill;

public class BackStab extends AttackSkill {

    public BackStab() {
        this.manaCost = 150;
        this.damage = 20;
    }

    @Override
    public void action(Character character, int intelligence, int agility, int strength, int atkPower) {
        character.setHp(-(this.damage * agility / character.getArmor()));
    }
}
