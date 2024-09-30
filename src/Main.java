public class Main {
    public static void main(String[] args) {
        // Task 1
        byte variableByte = 1;
        short variableShort = 11_111;
        int variableInt = 111_111_111;
        long variableLong = 111_111_111_111_111L;
        float variableFloat = 1.001F;
        double variableDouble = 1.0000001;
        System.out.println("Значение переменной variableByte с типом byte равно " + variableByte);
        System.out.println("Значение переменной variableShort с типом short равно " + variableShort);
        System.out.println("Значение переменной variableInt с типом int равно " + variableInt);
        System.out.println("Значение переменной variableLong с типом long равно " + variableLong);
        System.out.println("Значение переменной variableFloat с типом float равно " + variableFloat);
        System.out.println("Значение переменной variableDouble с типом double равно " + variableDouble);

        // Task 2
        variableByte = 67;
        variableShort = 569;
        variableShort = -159;
        variableInt = 27897;
        variableLong = 987_678_965_549L;
        variableFloat = 27.12F;
        variableDouble = 2.786;

        // Task 3
        var ludmilaPavlovna = 23;
        var annaSergeevna = 27;
        var ekaterinaAndreevna = 30;
        var totalPaper = 480;
        System.out.println("\nНа каждого ученика рассчитано " + totalPaper / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna) + " листов бумаги.");

        // Task 4
        var bottlesPerTwoMinutes = 16;
        var bottlesPerMinute = bottlesPerTwoMinutes / 2;
        var bottlesPerDay = bottlesPerMinute * 60 * 24;
        var bottlesPerThreeDays = bottlesPerDay * 3;
        var bottlesPerMonth = bottlesPerDay * 30;
        System.out.println("\nЗа 20 минут машина произвела " + bottlesPerMinute + " штук бутылок.");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + bottlesPerThreeDays + " штук бутылок.");
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " штук бутылок.");

        // Task 5
        var totalJar = 120;
        var whitePaint = 2;
        var brownPaint = 4;
        var quantityClasses = totalJar / (whitePaint + brownPaint);
        System.out.println("\nВ школе, где " + quantityClasses + " классов, нужно " + quantityClasses * 2  + " банок белой краски и " + quantityClasses * 4  + " банок коричневой краски.");

        // Task 6
        var quantityBananas = 5;
        var quantityMilk = 200;
        var quantityIceCream = 2;
        var quantityEggs = 1;
        var weightBanana = 80;
        var weightMilk = 105;
        var weightIceCream = 100;
        var weightEggs = 70;
        var totalWeight = (quantityBananas * weightBanana) + (weightMilk * (quantityMilk / 100)) + (quantityIceCream * weightIceCream) + (quantityEggs * weightEggs);
        System.out.println("\nВес в граммах - " + totalWeight + " г.");
        System.out.println("Вес в килограммах - 0.88 кг.");

        // Task 7
        var weight = 7;
        var lostWeight1 = 250;
        var lostWeight2 = 500;
        var Losing250PerDay = weight * 1000 / lostWeight1;
        var Losing500PerDay = weight * 1000 / lostWeight2;
        var LosingInAverage = (Losing250PerDay + Losing500PerDay) / 2;
        System.out.println("\nНужно потратить " + Losing250PerDay + " дней, чтобы потерять 7 кг веса, при потере 250 г веса в день.");
        System.out.println("Нужно потратить " + Losing500PerDay + " дней, чтобы потерять 7 кг веса, при потере 500 г веса в день.");
        System.out.println("В среднем нужно потратить " + LosingInAverage + " день, чтобы потерять 7 кг веса.");

        // Task 8
        var mashaMoneyPerMonth = 67760;
        var denisMoneyPerMonth = 83690;
        var kristinaMoneyPerMonth = 76230;
        var mashaSalaryAfterIncreasing = mashaMoneyPerMonth * 110 / 100;
        var denisSalaryAfterIncreasing = denisMoneyPerMonth * 110 / 100;
        var kristinaSalaryAfterIncreasing = kristinaMoneyPerMonth * 110 / 100;
        var mashaDifferenceSalary = mashaSalaryAfterIncreasing * 12 - mashaMoneyPerMonth * 12;
        var denisDifferenceSalary = denisSalaryAfterIncreasing * 12 - denisMoneyPerMonth * 12;
        var kristinaDifferenceSalary = kristinaSalaryAfterIncreasing * 12 - kristinaMoneyPerMonth * 12;
        System.out.println("\nМаша теперь получает " + mashaSalaryAfterIncreasing + " рублей. Годовой доход вырос на " + mashaDifferenceSalary + " рублей.");
        System.out.println("Маша теперь получает " + denisSalaryAfterIncreasing + " рублей. Годовой доход вырос на " + denisDifferenceSalary + " рублей.");
        System.out.println("Маша теперь получает " + kristinaSalaryAfterIncreasing + " рублей. Годовой доход вырос на " + kristinaDifferenceSalary + " рублей.");
    }
}