package org.example;

public class Main {
    public static void main(String[] args) {
        Boss boss1;
        boss1 = new Boss(500,40, new Weapon(WeaponType.MAGIC,"Stick"));
        System.out.println(boss1.printInfo());
       Skeleton skeleton1 = new Skeleton(200,20, new Weapon(WeaponType.COLD,"bow"),100);
        System.out.println(skeleton1.printInfo());
        Skeleton skeleton2 = new Skeleton(300,15, new Weapon(WeaponType.COLD,"bow"),100);
        System.out.println(skeleton2.printInfo());
    }
}