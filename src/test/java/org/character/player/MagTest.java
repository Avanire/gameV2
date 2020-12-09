package org.character.player;

import org.character.player.equipment.Equipment;
import org.character.player.playerClass.Dagger;
import org.character.player.playerClass.Mag;
import org.junit.Assert;
import org.junit.Test;

public class MagTest {

    @Test
    public void createMag() {
        Mag mag = new Mag();
        Assert.assertEquals(620, mag.getHp());
        Assert.assertEquals(375, mag.getMp());
        Assert.assertEquals(21, mag.getStrength());
        Assert.assertEquals(23, mag.getAgility());
        Assert.assertEquals(25, mag.getIntelligence());
        Assert.assertEquals(31, mag.getAtkPower());
        Assert.assertEquals(5, mag.getArmor());
        Assert.assertEquals(0, mag.getCurrentLvl());
        Assert.assertEquals(0, mag.getExp());
        Assert.assertEquals(2, mag.getStrPerLvl());
        Assert.assertEquals(3, mag.getAglPerLvl());
        Assert.assertEquals(5, mag.getIntPerLvl());
    }

    @Test
    public void createDagger() {
        Dagger dagger = new Dagger();
        Assert.assertEquals(620, dagger.getHp());
        Assert.assertEquals(315, dagger.getMp());
        Assert.assertEquals(21, dagger.getStrength());
        Assert.assertEquals(28, dagger.getAgility());
        Assert.assertEquals(20, dagger.getIntelligence());
        Assert.assertEquals(31, dagger.getAtkPower());
        Assert.assertEquals(6, dagger.getArmor());
        Assert.assertEquals(0, dagger.getCurrentLvl());
        Assert.assertEquals(0, dagger.getExp());
        Assert.assertEquals(2, dagger.getStrPerLvl());
        Assert.assertEquals(6, dagger.getAglPerLvl());
        Assert.assertEquals(2, dagger.getIntPerLvl());
    }

    @Test
    public void testExpMag() {
        Mag mag = new Mag();
        mag.addExp(900);
        Assert.assertEquals(900, mag.getExp());
        mag.addExp(200);
        Assert.assertEquals(100, mag.getExp());
        Assert.assertEquals(1, mag.getCurrentLvl());
        Assert.assertEquals(23, mag.getStrength());
        Assert.assertEquals(26, mag.getAgility());
        Assert.assertEquals(30, mag.getIntelligence());
        Assert.assertEquals(1080, mag.getHp());
        Assert.assertEquals(735, mag.getMp());
        Assert.assertEquals(54, mag.getAtkPower());
        Assert.assertEquals(9, mag.getArmor());
        mag.addExp(3000);
        Assert.assertEquals(2, mag.getCurrentLvl());
        Assert.assertEquals(25, mag.getStrength());
        Assert.assertEquals(29, mag.getAgility());
        Assert.assertEquals(35, mag.getIntelligence());
        Assert.assertEquals(1580, mag.getHp());
        Assert.assertEquals(1155, mag.getMp());
        Assert.assertEquals(79, mag.getAtkPower());
        Assert.assertEquals(13, mag.getArmor());
    }

    @Test
    public void testSkill() {
        Mag mag = new Mag();
        Dagger dagger = new Dagger();
        Assert.assertEquals(620, dagger.getHp());
        mag.attack(dagger, 0);
        Assert.assertEquals(537, dagger.getHp());
        Assert.assertEquals(225, mag.getMp());
        mag.buff(0);
        Assert.assertEquals(725, mag.getHp());
        Assert.assertEquals(125, mag.getMp());
    }

    @Test
    public void getEquip() {
        Mag mag = new Mag();
        Equipment equipment = Equipment.getRandomEquip();
        mag.addEquipments(equipment);
        Assert.assertNotEquals(0, mag.getEquipments().length);
        Assert.assertNotEquals(620, mag.getHp());
        Assert.assertNotEquals(375, mag.getMp());
        Assert.assertNotEquals(21, mag.getStrength());
        Assert.assertNotEquals(23, mag.getAgility());
        Assert.assertNotEquals(25, mag.getIntelligence());
        Assert.assertNotEquals(31, mag.getAtkPower());
        Assert.assertNotEquals(5, mag.getArmor());
    }

}
