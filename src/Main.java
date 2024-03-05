public class Main {
    public static void main(String[] args) {
//Задача 1
        int saveMoney = 15_000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + saveMoney;
            i = i + 1;
            {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }
        }
        //Задача 2
        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start = start + 1;
        }
        System.out.println();
        for (int a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }
        {
            System.out.println();
        }
        //Задача 3
        int people = 12_000_000;
        int diffPeople = people / 1000;
        int rait = 17;
        int dead = 8;
        for (int year = 1; year <= 10; year++) {
            people = people + (diffPeople * (rait - dead));
            System.out.println(" год " + year + " численность начеления составляет " + people);
        }
        //Задача 4
        long money = 15000;
        int y = 0;
        double Percent = 0.07;
        while (money < 12_000_000) {
            y = y + 1;
            money = (long) (money + money * Percent);
            System.out.println("Сумма " + money + " количество месяцев " + y);
        }
        //Задача 5
        long money1 = 15000;
        double bankPercent = 0.07;
        int all1 = 12_000_000;
        int period = 6;
        for (int u = 0; money1 < all1; u++) {
            money1 = (long) (money1 + money1 * bankPercent);
            if (u % period == 0) {
                System.out.println("Сумма " + money1 + " количество месяцев " + u);
            }
        }
        //Задача 6
        long money2 = 15000;
        int period1 = 6;
        int years = 9;
        int allMonth = years * 12;
        double bankPercent1 = 0.07;
        for (int e = 0; e <= allMonth; e++) {
            money2 = (long) (money2 + money2 * bankPercent1);
            if (e % period1 == 0) {
                System.out.println("Сумма " + money2 + " количество месяцев " + e);
            }
        }
        //Задача 7
        for (int friday = 1; friday < 31; friday += 7) {
            System.out.println("Сегодня пятница " + friday + " - е число. Необходимо подготовить отчет");
        }
        //Задача 8
        int currentYear = 2023;
        for (int c = 0; c < currentYear + 100; c += 79) {
            if (c > currentYear - 200) {
                System.out.println(c);
            }
        }
    }
}










