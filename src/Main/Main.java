package Main;

import Entities.RpgChar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("RPG SYSTEM ALPHA VER.");
        System.out.println();

        System.out.println("Insert the initial quantity of characters");
        int initCharQuantity = sc.nextInt();

        List<RpgChar> charList = new ArrayList<>();

        System.out.println();
        for (int i = 0; i < initCharQuantity; i++) {
            int charPos = i+1;

            System.out.println("Creating Char n°" + charPos);

            System.out.println("Insert his ID");
            System.out.println("OBS: This ID its for easily search for characters later");
            int id = sc.nextInt();

            sc.nextLine();
            System.out.println("Insert the character name");
            String name = sc.nextLine();

            System.out.println("Insert the race");
            String race = sc.nextLine();

            sc.nextLine();
            System.out.println("Insert the life amount");
            double life = sc.nextDouble();

            System.out.println("Insert the initial money");
            double money = sc.nextDouble();

            RpgChar rpgChar = new RpgChar(id, name, race, life, money);
            charList.add(rpgChar);
        }

        boolean loopTrue = true;

            System.out.println();
            for (int i = 0; i < initCharQuantity; i++) {
                System.out.println(charList.get(i).toString());
                System.out.println();
                System.out.println("");
            }









    }
}