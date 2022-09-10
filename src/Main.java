public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 2
        System.out.println("");
        System.out.println("Задача 2");
        dog = dog + 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 3
        System.out.println("");
        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задание 4
        System.out.println("");
        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend * 3;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задание 5
        System.out.println("");
        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        //Задание 6
        System.out.println("");
        System.out.println("Задание 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var weightBoxers = boxer1Weight + boxer2Weight;
        var difWeightBoxers = boxer2Weight - boxer1Weight;
        System.out.println("Общий вес " + weightBoxers);
        System.out.println("Разница " + difWeightBoxers);

        //Задание 7
        System.out.println("");
        System.out.println("Задание 7");
        difWeightBoxers = boxer2Weight % boxer1Weight;
        System.out.println("Разница " + difWeightBoxers);

        //Задание 8
        System.out.println("");
        System.out.println("Задание 8");
        var totalHours = 640;
        var workers = totalHours / 8;
        System.out.println("Всего работников в компании – " + workers + " человек");
        workers += 94;
        var totalHoursNew = workers * 8;
        System.out.println("Если в компании работает " + workers + " человека, то всего " + totalHoursNew + " часов работы может быть поделено между сотрудниками");


    }
}