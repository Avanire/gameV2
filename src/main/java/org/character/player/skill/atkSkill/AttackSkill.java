package org.character.player.skill.atkSkill;

import org.character.player.skill.Skill;

public abstract class AttackSkill extends Skill {
    protected int damage;

    public int getDamage() {
        return damage;
    }
}
