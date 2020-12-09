package org.character.player.skill.buffSkill;

import org.character.player.skill.Skill;

public abstract class BuffSkill extends Skill {
    protected int scale;

    public int getNumber() {
        return scale;
    }
}
