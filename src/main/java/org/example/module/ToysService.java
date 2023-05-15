package org.example.module;

public interface ToysService {
    void create(int id, int value, String name, int getPercent);

    void change(String name);

    void delete(String name);

    void showAll();
}
