package org.character.player.skill.atkSkill.intScale;

import org.character.Character;
import org.character.player.skill.atkSkill.AttackSkill;

public class FireBall extends AttackSkill {

    public FireBall() {
        this.manaCost = 150;
        this.damage = 20;
    }

    public void action(Character character, int intelligence, int agility, int strength, int atkPower) {
        character.setHp(-(this.damage * intelligence / character.getArmor()));
    }
}
