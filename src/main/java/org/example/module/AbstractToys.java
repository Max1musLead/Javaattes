package org.example.module;

abstract class AbstractToys {
    int id, value;
    String name;
    int chanceOfGet;

    public AbstractToys(int id, int value, String name, int chanceOfGet) {
        this.id = id;
        this.value = value;
        this.name = name;
        this.chanceOfGet = chanceOfGet;
    }

    public AbstractToys() {
        this.id = 0;
        this.value = 0;
        this.name = "Empty";
        this.chanceOfGet = 50;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChanceOfGet() {
        return chanceOfGet;
    }

    public void setChanceOfGet(int chanceOfGet) {
        this.chanceOfGet = chanceOfGet;
    }
}
