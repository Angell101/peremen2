public class Main {
    public static void main(String[] args) {
        task1();// Описание переменных
        task2();// Инициализация переменныйх
        task3();// Задача 1
        task4();// Задача 2
        task5();// Задача 3
        task6();// Задача 4
        task7();// задача 5
        task8();// Задание 6

    } //Задача 1
    public static void task1() {
        System.out.println("Задание 1");
        int a = 2147483647;
        System.out.println("Переменная int a = " +a);
        byte b = 127;
        System.out.println("Переменная byte b = " +b);
        long c = 2233720368547758907L;
        System.out.println("Переменная long c = " +c);
        float d = 3.75F;
        System.out.println("Переменная float d = " +d);
        double f = 1.152674748373;
        System.out.println("Переменная double f = " +f);

    }
    public static void task2() {
        System.out.println("Задание 2");
        float a = 27.12F;
        System.out.println("Значение переменной float = " +a);
        long b = 9876786554L;
        System.out.println("Значение переменной long = " +b);
        double c = 2.786;
        System.out.println("Значение переменной double = " +c);
        short d = 569;
        System.out.println("Значение переменной short = " +d);
        short f = -159;
        System.out.println("Значение переменной short = " + f);
        int h = 27897;
        System.out.println("Значение переменной int = " +h);
        byte g = 67;
        System.out.println("Значение переменной byte = " +g);
    }

    public static void task3() {
        System.out.println("Задание 3");
        short sheetsOfPaper = 480;
        System.out.println("Всего листов = " +sheetsOfPaper);
        byte schoolchildren = 80;
        System.out.println("Всего учеников = " +schoolchildren);
        int calculated = sheetsOfPaper / schoolchildren;
        System.out.println("На каждого ученика рассчитано " +calculated + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задание 4");
        byte bottleInOneMinute = 16 /2;
        System.out.println("Бутылок в минуту = " +bottleInOneMinute);
        int bottleInTwentyMinutes = bottleInOneMinute * 20;
        System.out.println("За 20 минут машина произвела " + bottleInTwentyMinutes + " штук бутылок");
        int bottlePerDay = bottleInOneMinute * 1440;
        System.out.println("За день машина произвела " + bottlePerDay + " штук бутылок");
        int bottleInThreeDays = bottleInOneMinute * 4320;
        System.out.println("За 3 дня машина произвела " +bottleInThreeDays + " штук бутылок");
        int bottlesPerMonth = bottlePerDay * 31;
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задание 5");
        int a = 4 + 2;
        System.out.println("Банок краски на 1 класс " + a);
        int b = 120 / a;
        System.out.println("Всего классов в школе - " +b);
        int c = 20 * 2;
        System.out.println("Белой красский - " + c);
        int d = 20 * 4;
        System.out.println("Коричневой красский - " + d);
        System.out.println("В школе, где " +b + " классов, нужно " +c + " банок белой краски и " +d + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задание 6");
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int gram = bananas + milk + iceCream + eggs;
        System.out.println("Всего спортсмен ест на завтрак - " + gram + " грамм");
        double kg = gram * 0.001;
        System.out.println("Спортсмен на завтрак съедает - " +kg +"килограмм");
    }
    public static void task7() {
        System.out.println("Задание 7");
        // перевод из килограмм в граммы
        int firstOption = 7000 / 250;
        System.out.println("Если спортсмен будет терять по 250 грамм в день, то похуеет через " + firstOption + " дней");
        int secondoptoin = 7000 / 500;
        System.out.println("А елси спортсмен будет худеть по 500 грам в день, то похудеет через " + secondoptoin + " дней");
        int averageQuantity = ((firstOption + secondoptoin) / 2 );
        System.out.println("В среднем спортсмену нужен " + averageQuantity + " день для похудения");
    }
    public static void task8() {
        System.out.println("Задание 8");
        double z = 1 * 0.1;
        // Это 10%
        int Masha = 67760;
        double Masha2 = 67760 * z;
        double Masha3 = Masha + Masha2;
        // Это Маша получает в месяц
        int yearM1 = 67760 * 12;
        double yearM2 = Masha3 * 12;
        double difference = yearM2 - yearM1;
        System.out.println("Маша теперь получает " +Masha3 + " рублей. Годовой доход вырос на " +difference + " рублей");


        int Denis = 83690;
        double Denis2 = 83690 * z;
        double Denis3 = Denis + Denis2;
        // Это Денис получает в месяц
        int yearD1 = 83690 * 12;
        double yearD2 = Denis3 * 12;
        double difference2 = yearD2 - yearD1;
        System.out.println("Денис теперь получает " +Denis3 + " рублей. Годовой доход вырос на " +difference2 + " рублей");

        int Christina = 76230;
        double Christina2 = 76230 * z;
        double Christina3 = Christina + Christina2;
        // Это Денис получает в месяц
        int yearC1 = 76230 * 12;
        double yearC2 = Christina3 * 12;
        double difference3 = yearC2 - yearC1;
        System.out.println("Кристина теперь получает " +Christina3 + " рублей. Годовой доход вырос на " +difference3 + " рублей");
    }
}