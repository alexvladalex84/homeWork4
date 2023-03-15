public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int age = 17;
        if (age >= 18) {
            System.out.println("Человек совершенно летний.");
        } else {
            System.out.println("Человек не достиг совершеннолетия,нужно немного подождать.");
        }

        System.out.println("Задача 2");

        int airTemperature = 6;

        if (airTemperature <= 5) {
            System.out.println("На улице " + airTemperature + ",нужно надеть шапку.");
        } else {
            System.out.println("На улице " + airTemperature + ",можно идти без шапки.");
        }

        System.out.println("Задача 3");

        int speed = 60;

        if (speed > 60) {

            System.out.println("Если скорость " + speed + ",придется заплатить штраф.");

        } else {
            System.out.println("Если скорость " + speed + ",можнот ездить спокойно");
        }

        System.out.println("Задача 4");

        int agePerson = 25;
        if (agePerson >= 2 && agePerson <= 6) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему надо ходить в садик.");
        } else if (agePerson >= 7 && agePerson <= 18) {

            System.out.println("Если возраст человека равен " + agePerson + ", то ему надо ходить в школу.");
        } else if (agePerson >= 19 && agePerson <= 24) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему надо ходить в университет.");
        } else {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему надо ходить на работу.");
        }

        System.out.println("Задача 5");

        int childEag = 25;

        if (childEag < 5) {
            System.out.println("Если возраст ребенка равен " + childEag + ",то ему нельзя кататься на атракционе.");
        } else if (childEag >= 5 && childEag <= 14) {
            System.out.println("Если возраст ребенка равен " + childEag + ",то ему можно кататься на атракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + childEag + ",то ему можно кататься на атракционе без сопровождения взрослого.");
        }

        System.out.println("Задача 6");

        int singleWagonCapacity = 102;
        int seatingPlaces = 60;
        int standingPlaces = singleWagonCapacity - seatingPlaces;

        int seatingPlaces1 = 67;
        int standingPlaces2 = 40;

        if (seatingPlaces1 < seatingPlaces) {
            System.out.println("Сидячих мест осталось " + (seatingPlaces - seatingPlaces1));

        } else {
            System.out.println("Сидячих мест нет");

        }
        if (standingPlaces2 < standingPlaces) {

            System.out.println("Стоячих мест сталось " + (standingPlaces - standingPlaces2));
        } else {
            System.out.println("Стоячих мест нет");
        }
        if (seatingPlaces1 >= seatingPlaces && standingPlaces2 >= standingPlaces) {
            System.out.println("Вагон полнотсью забит");
        }

        System.out.println("Задача 7");

        int one = 11;
        int two = 648;
        int three = 56668;

        if (one > two && one > three){
            System.out.println("Самое большое число "+one);
        } else if (two > one && two > three){
            System.out.println("Самое большое число "+ two);

        }else {
            System.out.println("Самое большое число "+three);
        }


    }

}













