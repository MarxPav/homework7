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
        int people = 12_000_000;
        int diffPeople = people / 1000;
        int rait = 17;
        int dead = 8;
        for (int year = 1; year <= 10; year++) {
            people = people + (diffPeople * (rait - dead));
            System.out.println(" год " + year + " численность начеления составляет " + people);
        }
    }
}



