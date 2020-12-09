package org.character.player.skill.atkSkill;

import org.character.Character;

public class AutoAttack extends AttackSkill{

    @Override
    public void action(Character character, int intelligence, int agility, int strength, int atkPower) {
        character.setHp(-(atkPower));
    }
}
