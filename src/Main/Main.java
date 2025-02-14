package Main;

import Entities.RpgChar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("RPG SYSTEM v0.1");
        System.out.println();

        int initCharQuantity = sc.nextInt();

        List<RpgChar> charList = new ArrayList<>();

        for (int i = 0; i < initCharQuantity; i++) {
            int id = sc.nextInt();

            String name = sc.nextLine();

            String race = sc.nextLine();

            double life = sc.nextDouble();

            double money = sc.nextDouble();

            RpgChar rpgChar = new RpgChar(id, name, race, life, money);
            charList.add(rpgChar);
        }

        boolean loopTrue = true;

        while(loopTrue == true){
            
        }





    }
}