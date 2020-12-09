package org.character.player.playerClass;


import org.character.Character;
import org.character.player.Player;
import org.character.player.skill.atkSkill.aglScale.BackStab;
import org.character.player.skill.atkSkill.aglScale.DaggerBlow;
import org.character.player.skill.atkSkill.aglScale.DeBuffAgl;
import org.character.player.skill.buffSkill.aglScale.BuffArmor;
import org.character.player.skill.buffSkill.strScale.BuffAtk;


public class Dagger extends Player {

    public Dagger() {
        super();
        this.strPerLvl = 2;
        this.aglPerLvl = 6;
        this.intPerLvl = 2;
        this.strength = 21;
        this.agility = 28;
        this.intelligence = 20;
        this.hp += this.strength * 20;
        this.mp += this.intelligence * 12;
        this.atkPower += this.strength;
        this.armor += this.agility * 0.16;
        attackSkills.add(new DaggerBlow());
        attackSkills.add(new BackStab());
        attackSkills.add(new DeBuffAgl());
        buffSkills.add(new BuffArmor());
        buffSkills.add(new BuffAtk());
    }



}
