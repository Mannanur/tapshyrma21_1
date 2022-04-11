package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         JumaKundory kun = JumaKundory.valueOf(sc.nextLine());

        switch (kun) {
            case MONDAY:
                System.out.println(kun.getName()+ "- Jawa sabagy bolot");
                break;
            case TUESDAY:
                System.out.println(kun.getName()+" - anglis tili sabagy bolot");
                break;
            case WEDNESDAY:
                System.out.println(kun.getName()+" - praktikalyk sabak bolot");
                break;
            case THURSDAY:
                System.out.println(kun.getName()+" - Soft skils sabagy bolot");
                break;
            case FRIDAY:
                System.out.println(kun.getName()+" - Tehnikalyk sabak bolot");
                break;
            case SATURDAY:
                System.out.println(kun.getName()+" - Kaitaloo bolot");
                break;
            case SUNDAY:
                System.out.println(kun.getName()+" - Sabak bolboit");
                break;
            default:
                System.out.println("Juma kundorundo andai kun jok");


        }

    }
}
