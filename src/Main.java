public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        paper = paper +4;
        System.out.println(cat);
        System.out.println(paper);

    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat -1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

    }
    public static void task5 () {
        System.out.println("Задание 5");
        var frog = 3.5;
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задание 6");
        var firstBoxerWeight = 78.2;
        System.out.println(firstBoxerWeight);
        var secondBoxerWeight = 82.7;
        System.out.println(secondBoxerWeight);
        var totalBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес двух бойцов составляет "+ totalBoxersWeight+" кг! ");
        var differenceBoxersWeight = firstBoxerWeight - secondBoxerWeight;
        System.out.println("Разница между весами бойцов составляет "+ differenceBoxersWeight+" кг!");
    }
    public static void task7 () {
        System.out.println("Задание 7");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        System.out.println(firstBoxerWeight);
        System.out.println(secondBoxerWeight);
        var differenceBoxersWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println(differenceBoxersWeight);
        System.out.println("Разница между весами бойцов составляет "+ differenceBoxersWeight+" кг!");
        var secondDifferenceBoxersWeight = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница между весами бойцов составляет"+secondDifferenceBoxersWeight+"кг!");
    }
    public static void task8() {
        System.out.println("Задание 8");
        var allWorkHours = 640;
        var numberHours = 8;
        System.out.println(allWorkHours);
        System.out.println(numberHours);
        var numberWorkers = allWorkHours / numberHours;
        System.out.println("Всего работников в компании - "+numberWorkers+" человек");
        var newWorkersNumber = 94;
        System.out.println(newWorkersNumber);
        var newAllWorkersNumber = numberWorkers + newWorkersNumber;
        System.out.println(newAllWorkersNumber);
        var newNumberHours = allWorkHours / newAllWorkersNumber;
        System.out.println(newNumberHours);
        System.out.println("Если в компании работает "+ newAllWorkersNumber+" человека, то всего по "+ newNumberHours +" часа работы может быть поделено между сотрудниками");

    }
}