package pl.sdacademy.java.basic.day3.task7;

public class Main {
    public static void main(String[] args) {
//        System.out.println(cat.toString());
//        System.out.println(cat);
//        cat.print();
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Mruczek");
        cats[1] = new Cat("Filemon");
        cats[2] = new Cat("Bonifacy");

        int i = 5;
        for(Cat cat : cats) {
            cat.print();
            cat.makeSound();
            cat.eatMice(i++ * i);
            System.out.println();
        }
    }
}