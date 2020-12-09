package org.character.player.playerClass;

import org.character.Character;
import org.character.player.Player;
import org.character.player.skill.*;
import org.character.player.skill.atkSkill.intScale.FireBall;
import org.character.player.skill.atkSkill.intScale.MagicArrow;
import org.character.player.skill.atkSkill.strScale.DeBuffStr;
import org.character.player.skill.buffSkill.aglScale.BuffArmor;
import org.character.player.skill.buffSkill.intScale.ManaRegen;

public class Mag extends Player {

    public Mag() {
        super();
        this.strPerLvl = 2;
        this.aglPerLvl = 3;
        this.intPerLvl = 5;
        this.strength = 21;
        this.agility = 23;
        this.intelligence = 25;
        this.hp += this.strength * 20;
        this.mp += this.intelligence * 12;
        this.atkPower += this.strength;
        this.armor += this.agility * 0.16;
        //Атакующие скиллы
        attackSkills.add(new MagicArrow());
        attackSkills.add(new FireBall());
        attackSkills.add(new DeBuffStr());
        //Бафающие скиллы
        buffSkills.add(new BuffArmor());
        buffSkills.add(new ManaRegen());
    }


}
