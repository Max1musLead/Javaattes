package org.example.view;
import java.io.IOException;
import java.util.Scanner;
import org.example.module.WorkerWithToys;
public class ViewerOfToys {
    WorkerWithToys WWT = new WorkerWithToys();
    public void start() throws IOException {
        while (true) {
            System.out.println("Добрый день. В нашем распоряжении игрушек " + WWT.howMany());
            while (true) {
                String cmd = prompt("Команды\n" +
                        "ПВ - показать все\n" +
                        "СИ - создать игрушку\n" +
                        "УИ - удалить игрушки\n" +
                        "ИИ - изменить игрушку\n" +
                        "РИ - розыгрыш игрушек\n" +
                        "Выход - остановка программы\n" +
                        "Введите команду: ");
                if (cmd.equals("ПВ")) {
                    WWT.showAll();
                    continue;
                }
                if (cmd.equals("СИ")) {
                    int id = Integer.parseInt(prompt("Введите id: "));
                    int value = Integer.parseInt(prompt("Введите количество: "));
                    String name = prompt("Введите имя: ");
                    int chance = Integer.parseInt(prompt("Введите вес: "));
                    WWT.create(id, value, name, chance);
                    continue;
                }
                if (cmd.equals("УИ")) {
                    WWT.delete(prompt("Введите имя "));
                    continue;
                }
                if (cmd.equals("ИИ")) {
                    WWT.change(prompt("Введите имя "));
                    continue;
                }
                if (cmd.equals("РИ")) {
                    WWT.Lotery();
                    continue;
                }
                if (cmd.equals("Выход")) {
                    break;
                }
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
