package org.example.module;

public class Toy extends AbstractToys {
    public Toy(int id, int value, String name, int getPercent) {
        super(id, value, name, getPercent);
    }

    public Toy() {
        super();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public int getValue() {
        return super.getValue();
    }

    @Override
    public void setValue(int value) {
        super.setValue(value);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getChanceOfGet() {
        return super.getChanceOfGet();
    }

    @Override
    public void setChanceOfGet(int chanceOfGet) {
        super.setChanceOfGet(chanceOfGet);
    }

    @Override
    public String toString() {
        return "|Toy {" + "id= " + id +
                ", value= " + value +
                ", name=' " + name + '\'' +
                ", getPercent= " + chanceOfGet +
                "}|";
    }

    public String toString2() {
        return "|Toy {" + "id= " + id +
                ", name=' " + name + '\'' +
                ", getPercent= " + chanceOfGet +
                "}|";
    }

}
