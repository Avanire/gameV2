package org.character.player.skill.atkSkill.strScale;

import org.character.Character;
import org.character.player.skill.atkSkill.AttackSkill;

public class DeBuffStr extends AttackSkill {

    public DeBuffStr() {
        this.manaCost = 100;
        this.damage = 5;
    }

    @Override
    public void action(Character character, int intelligence, int agility, int strength, int atkPower) {
        character.setStrength(-(strength / this.damage));
    }
}
