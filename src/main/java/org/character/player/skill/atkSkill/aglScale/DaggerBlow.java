package org.character.player.skill.atkSkill.aglScale;

import org.character.Character;
import org.character.player.skill.atkSkill.AttackSkill;

public class DaggerBlow extends AttackSkill {

    public DaggerBlow() {
        this.manaCost = 50;
        this.damage = 10;
    }

    @Override
    public void action(Character character, int intelligence, int agility, int strength, int atkPower) {
        character.setHp(-(this.damage * agility / character.getArmor()));
    }
}
