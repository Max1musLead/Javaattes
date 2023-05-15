package org.example.module;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class WorkerWithToys implements ToysService {
    ToyStorage somestore = new ToyStorage();

    public int howMany() {
        return somestore.length();
    }

    public void Lotery() throws IOException {
        Random random = new Random();
        try (FileWriter writer = new FileWriter("toys.csv", true)) {
            for (Toy x : somestore.storage
            ) {
                int chance = random.nextInt(100);
                if (x.getChanceOfGet() >= chance) {
                    System.out.println("Поздравляем! Вы выиграли " + x.getName());
                    writer.write(x.toString2() + "\n");
                    x.setValue(x.getValue() - 1);
                    if (x.getValue() == 0) {
                        somestore.deleteToy(x.getName());
                    }
                }

            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void create(int id, int value, String name, int chance) {
        Toy sometoy = new Toy(id, value, name, chance);
        somestore.AddToy(sometoy);
    }

    @Override
    public void change(String name) {
        Toy find = somestore.findToy(name);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите новый вес ");
        find.setChanceOfGet(Integer.parseInt(in.nextLine()));
    }

    @Override
    public void delete(String name) {
        somestore.deleteToy(name);
    }

    @Override
    public void showAll() {
        System.out.println(somestore.toString());
    }
}
