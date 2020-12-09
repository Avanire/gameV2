package org.character;

public abstract class Character {
    protected int hp;
    protected int mp;
    protected int strength;
    protected int agility;
    protected int intelligence;
    protected int atkPower;
    protected int armor;

    public Character() {
        this.hp = 200;
        this.mp = 75;
        this.atkPower = 10;
        this.armor = 2;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp += hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp += mp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength += strength;
        setHp(this.strength * 20);
        setAtkPower(this.strength);
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility += agility;
        setArmor((int) (this.agility * 0.16));
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence += intelligence;
        setMp(this.intelligence * 12);
    }

    public int getAtkPower() {
        return atkPower;
    }

    public void setAtkPower(int atkPower) {
        this.atkPower += atkPower;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor += armor;
    }

}
