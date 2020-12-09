package org.character.player;

import org.character.Character;
import org.character.player.equipment.Equipment;
import org.character.player.skill.atkSkill.AttackSkill;
import org.character.player.skill.atkSkill.AutoAttack;
import org.character.player.skill.buffSkill.BuffSkill;
import org.character.player.skill.Skill;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Player extends Character implements Exp {
    protected int currentLvl;
    protected int exp;
    protected int strPerLvl;
    protected int aglPerLvl;
    protected int intPerLvl;
    protected List<AttackSkill> attackSkills;
    protected List<BuffSkill> buffSkills;
    protected Equipment[] equipments;

    private static final int NUMBER_OF_EQUIP = 6;

    public Player() {
        this.attackSkills = new ArrayList<>();
        this.buffSkills = new ArrayList<>();
        this.equipments = new Equipment[NUMBER_OF_EQUIP];
        attackSkills.add(new AutoAttack());
    }

    public int getCurrentLvl() {
        return currentLvl;
    }

    public int getExp() {
        return exp;
    }

    public int getStrPerLvl() {
        return strPerLvl;
    }

    public int getAglPerLvl() {
        return aglPerLvl;
    }

    public int getIntPerLvl() {
        return intPerLvl;
    }

    public void addExp(int exp) {
        int sumLvlUp = 1000 + (1000 * currentLvl);
        if (exp >= sumLvlUp || (this.exp + exp) >= sumLvlUp) {
            this.exp += exp;
            lvlUp();
        } else {
            this.exp += exp;
        }
    }

    @Override
    public void lvlUp() {
        this.currentLvl++;
        setStrength(strPerLvl);
        setAgility(aglPerLvl);
        setIntelligence(intPerLvl);
        exp -= 1000 * currentLvl;
    }

    public void attack(Character character, int skillNumber) {
        Skill skill = attackSkills.get(skillNumber);
        doAction(character, skill);
    }

    public void buff(int skillNumber) {
        Skill skill = buffSkills.get(skillNumber);
        doAction(this, skill);
    }

    protected void doAction(Character character, Skill skill) {
        int manaCost = skill.getManaCost();
        if (this.mp < manaCost) {
            System.out.println("No mana");
            return;
        }
        this.mp -= manaCost;
        skill.action(character, intelligence, agility, strength, atkPower);
    }

    public void addEquipments(Equipment equipment) {
        for (int i = 0; i < 6; i++) {
            if (equipments[i] == null) {
                equipments[i] = equipment;
                setStrength(equipment.getStrength());
                setAgility(equipment.getAgility());
                setIntelligence(equipment.getIntelligence());
                setArmor(equipment.getArmor());
                setAtkPower(equipment.getAtkPower());
                break;
            } else if (equipments[i].getClass().getSuperclass() == equipment.getClass().getSuperclass()) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Заменить вещь " + equipments[i].toString() + " на " + equipment.toString() + "?");
                System.out.println("1 - Да");
                System.out.println("2 - Нет");
                int answer = scanner.nextInt();
                switch (answer) {
                    case 1: {
                        setStrength(-equipments[i].getStrength());
                        setAgility(-equipments[i].getAgility());
                        setIntelligence(-equipments[i].getIntelligence());
                        setArmor(-equipments[i].getArmor());
                        setAtkPower(-equipments[i].getAtkPower());
                        equipments[i] = equipment;
                        setStrength(equipment.getStrength());
                        setAgility(equipment.getAgility());
                        setIntelligence(equipment.getIntelligence());
                        setArmor(equipment.getArmor());
                        setAtkPower(equipment.getAtkPower());
                    }
                    break;
                    case 2:
                        break;
                }
            } else {
                System.out.println("Все ячейки заполнены");
            }
        }
    }

    public Equipment[] getEquipments() {
        return equipments;
    }
}
