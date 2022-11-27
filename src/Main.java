public class Main {
    public static void main(String[] args) {

        // Exercise 1
        System.out.println("\n Exercise 1");
        int sumInBank = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000){
            total = total + total/100;
            total = total + sumInBank;
            int month = i++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }

        // Exercise 2
        System.out.println("Exercise 2");
        int b = 1;
        while (b <= 10){
            int a = b++;
            System.out.print(a + " ");
        }
        System.out.println("\n");
        for (int a = 10; a > 0; a--){
            System.out.print(a + " ");
        }

        //Exercise 3
        System.out.println("\n Exercise 3");
        int people = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        fertility = fertility * (people / 1000);
        mortality = mortality * (people / 1000);
        System.out.println("Год 0, численность населения составляет " + people);
        for (int q = 1; q <=10; q = q + 1){
            people = people + fertility - mortality;
            System.out.println("Год " + q + ", численность населения составляет " + people);
        }

        //Exercise 4
        System.out.println("\n Exercise 4");
        int bank = 15000;
        int tota = 0;
        int w = 0;
        for (; tota < 12_000_000; w++) {
            tota = tota + tota/93;
            tota = tota + bank;
            System.out.println("Месяц " + w + " Итого " + tota);
        }

        //Exercise 5
        System.out.println("\n Exercise 5");
        int salary = 15000;
        int percent = 0;
        int e = 0;
        for (; percent < 12_000_000; e++) {
            percent = percent + percent/93;
            percent = percent + salary;
            if (e % 6 == 0) {
                System.out.println("Месяц " + e + " Итого " + percent);
            }
        }

        //Exercise 6
        System.out.println("\n Exercise 6");
        int firstSum = 15000;
        int percentInMonth = 0;
        int r = 0;
        for (; r < 108; r++) {
            percentInMonth = percentInMonth + percentInMonth / 93;
            percentInMonth = percentInMonth + firstSum;
            if (r % 6 == 0) {
                System.out.println("Месяц " + r + " Итого " + percentInMonth);
            }
        }

        //Exercise 7
        System.out.println("\n Exercise 7");
        int friday = 7;
        for (int dayNumber = 1; dayNumber <= 31; dayNumber++){
            if (dayNumber % 7 == 0){
                System.out.println("Сегодня пятница, " + dayNumber + "-е число. Необходимо подготовить отчет.");
            }

        }

        //Exercise 8
        System.out.println("\n Exercise 8");
        int year = 2022;
        int before = year - 200;
        int after = year + 100;
        for (int years = 0; years < after; years = years + 79){
              if (years >= before){
            System.out.println(years);}
        }


        //Exercise 9
        System.out.println("\n Exercise 9");
        for (int t = 1; t <=10; t++){
            System.out.println("2 * " + t + " = " + 2*t);
        }
    }
}