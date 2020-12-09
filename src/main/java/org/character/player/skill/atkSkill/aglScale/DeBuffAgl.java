package org.character.player.skill.atkSkill.aglScale;

import org.character.Character;
import org.character.player.skill.atkSkill.AttackSkill;

public class DeBuffAgl extends AttackSkill {

    public DeBuffAgl() {
        this.manaCost = 100;
        this.damage = 5;
    }

    @Override
    public void action(Character character, int intelligence, int agility, int strength, int atkPower) {
        character.setAgility(-(agility / this.damage));
    }
}
