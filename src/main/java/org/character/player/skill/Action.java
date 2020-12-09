package org.character.player.skill;

import org.character.Character;

public interface Action {
    void action(Character character, int intelligence, int agility, int strength, int atkPower);
}
