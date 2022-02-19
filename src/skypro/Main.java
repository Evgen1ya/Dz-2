package skypro;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        // Задача 1
        var box = 5;
        byte banana =100;
        short apples = 400;
        int oranges = 1000;
        long days = 365L;

        float weight = 5.5f;
        double weightsSingle = 1.01010101;

        //Задача 2
        System.out.println(" Задача 2");
        float boxersWight1 = 78.2f;
        float boxersWight2 = 82.7f;
        float totalWight = boxersWight1 + boxersWight2;
        float differenceWight = boxersWight2 - boxersWight1;
        System.out.println("Общий вес двух бойцов: " + totalWight + " кг" );
        System.out.println("Разница в весе между бойцами: " + differenceWight + " кг" );

        // Задача 3
        System.out.println(" Задача 3");
        int bananas = 80;
        int milk = 105;
        int iceCream = 100;
        int eggs = 70;
        int totalWights = bananas * 5 + milk * 2 + iceCream * 2 + eggs * 4;
        System.out.println("Количество спорт-завтрака - " + totalWights + " грамм");
        float sumWights = totalWights / 1000f;
        System.out.println("Количество спорт-завтрака " + sumWights + " кг" );

        // Задача 4
        System.out.println(" Задача 4");
        int wight = 7;
        float minusWight1 = 0.25f;
        float minusWight2 = 0.5f;
        float days1 = 7 / minusWight1;
        float days2 = 7 / minusWight2;
        float middleDays = (days1 + days2) / 2;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то он сбросит вес через " + days1 + " дней.");
        System.out.println("Если спортсмен будет терять каждый день  по 500 грамм, то он сбросит вес через " + days2 + " дней.");
        System.out.println("В среднем понадобится " + middleDays + " день для того, чтобы потерять вес.");

        // Задача 5
        System.out.println(" Задача 5");
        int MashaSalary = 67760;
        int DensSalary = 83690;
        int KristinaSalary = 76230;
        float MashaNewSalary = MashaSalary * 1.1f;
        float DensNewSalary = DensSalary * 1.1f;
        float KristinaNewSalary =KristinaSalary * 1.1f;
        int months = 12;
        int MashaTotalsSalary = MashaSalary * months;
        int DenTotalsSalary = DensSalary * months;
        int KristinaTotalsSalary = KristinaSalary * months;
        float MashaTotalsNewSalary = MashaNewSalary * months;
        float DensTotalsNewSalary = DensNewSalary * months;
        float KristinaTotalsNewSalary = KristinaNewSalary * months;
        float difSalaryMasha = MashaTotalsNewSalary - MashaTotalsSalary;
        float difSalaryDens = DensTotalsNewSalary - DenTotalsSalary;
        float difSalaryKristina = KristinaTotalsNewSalary - KristinaTotalsSalary;
        System.out.println("Маша теперь получает " + MashaNewSalary + " рублей." + "Годовой доход вырос на " + difSalaryMasha + " рублей.");
        System.out.println("Денис теперь получает " + DensNewSalary + " рублей." + "Годовой доход вырос на " + difSalaryDens + " рублей.");
        System.out.println("Кристина теперь получает " + KristinaNewSalary + " рублей." + "Годовой доход вырос на " + difSalaryKristina + " рублей.");




    }
}
