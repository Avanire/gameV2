package org.character.player.playerClass;


import org.character.player.Player;


public class Dagger extends Player {

    public Dagger() {
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

    }


}
