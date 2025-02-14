package Entities;

public class RpgChar {
    public int id;
    public String name, race;
    public double life, money;

    public RpgChar(){}

    public RpgChar(int id, String name, String race, double life, double money){
        this.id = id;
        this.name = name;
        this.race = race;
        this.life = life;
        this.money = money;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public double getLife() {
        return life;
    }

    public void setLife(double life) {
        this.life = life;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
