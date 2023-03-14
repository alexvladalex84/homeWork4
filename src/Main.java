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

       int agePerson = 15;
        if (agePerson >= 2 && agePerson <=6) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему надо ходить в садик.");
        }else if (agePerson >= 7 && agePerson <=18){

            System.out.println("Если возраст человека равен "+agePerson + ", то ему надо ходить в школу.");
        }else if (agePerson >= 19 && agePerson <=24){
            System.out.println("Если возраст человека равен "+agePerson + ", то ему надо ходить в университет.");
        }else if (agePerson > 24 ){
            System.out.println("Если возраст человека равен "+agePerson + ", то ему надо ходить на работу.");
        }

        System.out.println("Задача 5");

        int childEag = 15;

        if (childEag < 5) {
            System.out.println("Если возраст ребенка равен "+childEag+",то ему нельзя кататься на атракционе.");
        }else if (childEag >= 5 && childEag <=14) {
            System.out.println("Если возраст ребенка равен "+childEag+",то ему можно кататься на атракционе в сопровождении с взрослым.");
        }else if (childEag > 14) {
            System.out.println("Если возраст ребенка равен "+childEag+",то ему можно кататься на атракционе без сопровождения взрослого.");
        }

        System.out.println("Задача 6");

        int singleWagonCapacity = 102;
        int seatingPlaces = 60;
        int standingPlaces = singleWagonCapacity - seatingPlaces;

        if (standingPlaces >= 0 && seatingPlaces <=60){
            System.out.println("Сидячих мест больше нет");
        }else if (standingPlaces >60 && standingPlaces <= singleWagonCapacity){
            System.out.println("Стоячих мест больше нет");
        }else {
            System.out.println("Вагон уже полностью забит");
        }

        System.out.println("Задача 7");

        int one = 1;
        int two = 2;
        int three =3;
        boolean task1 = three >= one && three >= two ;



        if ( task1 ){
            System.out.println("Три,самое большщое число ");

        }else {
            System.out.println("Три,не самое большое число");
        }





    }
}

















