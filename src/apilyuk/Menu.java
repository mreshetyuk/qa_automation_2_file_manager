package apilyuk;


import java.util.Scanner;

public class Menu {

    /**
     * метод, коорый выводит список меню в консоль
     */
    public void showMenu() {
        System.out.println("1. Create file");
        System.out.println("2. Create file");
        //TODO добавляем пункты меню по мере их появления
    }

    /**
     * этот метод считывает ответ от пользователя.
     * По хорошему, этот метод должен быть в другом классе, но пока что
     * мы его оставим тут что бы не усложнять код для первого раза.
     */
    public void readAnswer() {
        Scanner in = new Scanner(System.in);
        // Считывает линию из консоли
        //и сохраняет ее в переменную
        String answer = in.nextLine();

        // заканчиваем процесс чтения, в противном случае
        // программа будет вечно висеть в данном участке кода
        in.close();

        System.out.println("Answer is :" + answer);
    }

}
