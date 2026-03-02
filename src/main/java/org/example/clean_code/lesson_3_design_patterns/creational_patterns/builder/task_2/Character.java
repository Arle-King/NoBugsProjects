package org.example.clean_code.lesson_3_design_patterns.creational_patterns.builder.task_2;

public class Character {
    private double health = 100.0;
    private double damage = 0.0;
    private double armor = 0.0;
    private double magic = 0.0;

    public Character(Builder builder) {
        this.health = builder.health;
        this.damage = builder.health;
        this.armor = builder.armor;
        this.magic = builder.magic;
    }

    public double getHealth() {
        return health;
    }

    public double getDamage() {
        return damage;
    }

    public double getArmor() {
        return armor;
    }

    public double getMagic() {
        return magic;
    }

    static class Builder {
        private double health;
        private double damage;
        private double armor;
        private double magic;

        public Builder setHealth(double health) {
            this.health = health;
            return this;
        }

        public Builder setDamage(double dmg){
            this.damage = dmg;
            return this;
        }

        public Builder setArmor(double armor) {
            this.armor = armor;
            return this;
        }

        public Builder setMagic(double magic) {
            this.magic = magic;
            return this;
        }

        public Character build() {
            return new Character(this);
        }
    }
}
