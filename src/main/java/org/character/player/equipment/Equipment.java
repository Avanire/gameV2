package org.character.player.equipment;

import org.character.player.equipment.armor.arms.ArmsOfBull;
import org.character.player.equipment.armor.arms.ArmsOfMonkey;
import org.character.player.equipment.armor.arms.ArmsOfOwl;
import org.character.player.equipment.armor.arms.HolyArms;
import org.character.player.equipment.armor.body.BodyOfBull;
import org.character.player.equipment.armor.body.BodyOfMonkey;
import org.character.player.equipment.armor.body.BodyOfOwl;
import org.character.player.equipment.armor.body.HolyBody;
import org.character.player.equipment.armor.head.HeadOfBull;
import org.character.player.equipment.armor.head.HeadOfMonkey;
import org.character.player.equipment.armor.head.HeadOfOwl;
import org.character.player.equipment.armor.head.HolyHead;
import org.character.player.equipment.armor.legs.HolyLegs;
import org.character.player.equipment.armor.legs.LegsOfBull;
import org.character.player.equipment.armor.legs.LegsOfMonkey;
import org.character.player.equipment.armor.legs.LegsOfOwl;
import org.character.player.equipment.armor.offhand.Knife;
import org.character.player.equipment.armor.offhand.Shield;
import org.character.player.equipment.armor.offhand.Wand;
import org.character.player.equipment.weapon.Dagger;
import org.character.player.equipment.weapon.Staff;
import org.character.player.equipment.weapon.Sword;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public abstract class Equipment {
    protected int strength;
    protected int agility;
    protected int intelligence;
    protected int armor;
    protected int atkPower;

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getAtkPower() {
        return atkPower;
    }

    public void setAtkPower(int atkPower) {
        this.atkPower = atkPower;
    }

    public static Equipment getRandomEquip() {
        List<Equipment> equipmentList = Arrays.asList(new HolyArms(), new HolyBody(), new HolyHead(),
                new HolyLegs(), new Sword(), new Shield(), new Wand(), new ArmsOfBull(), new ArmsOfMonkey(), new ArmsOfOwl(),
                new LegsOfBull(), new LegsOfMonkey(), new LegsOfOwl(), new HeadOfBull(), new HeadOfMonkey(), new HeadOfOwl(),
                new BodyOfBull(), new BodyOfMonkey(), new BodyOfOwl(), new Dagger(), new Staff(), new Knife());
        Random random = new Random();
        return equipmentList.get(random.nextInt(equipmentList.size() - 1));
    }
}
