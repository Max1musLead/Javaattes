package org.example.module;

import java.util.ArrayList;

public class ToyStorage {
    ArrayList<Toy> storage;

    public ToyStorage() {
        storage = new ArrayList<>();
    }

    public void AddToy(Toy someone) {
        storage.add(someone);
    }

    public Toy findToy(String name) {
        for (Toy x : storage
        ) {
            if (x.getName().equals(name)) {
                return x;
            }
        }
        return new Toy();
    }

    public ArrayList<Toy> getStorage() {
        return storage;
    }

    public void deleteToy(String name) {
        storage.removeIf(x -> x.getName().equals(name));
    }

    public int length() {
        return storage.size();
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();
        for (Toy x : storage
        ) {
            ret.append(x.toString());
        }
        return ret.toString();
    }
}
