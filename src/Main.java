public class Main {
    public static void main(String[] args) {
        // Task 1
        byte variableByte1 = 1;
        short variableShort1 = 11_111;
        int variableInt1 = 111_111_111;
        long variableLong1 = 111_111_111_111_111L;
        float variableFloat1 = 1.001F;
        double variableDouble1 = 1.0000001;
        System.out.println("Значение переменной variableByte с типом byte равно " + variableByte1);
        System.out.println("Значение переменной variableShort с типом short равно " + variableShort1);
        System.out.println("Значение переменной variableInt с типом int равно " + variableInt1);
        System.out.println("Значение переменной variableLong с типом long равно " + variableLong1);
        System.out.println("Значение переменной variableFloat с типом float равно " + variableFloat1);
        System.out.println("Значение переменной variableDouble с типом double равно " + variableDouble1);

        // Task 2
        byte variableByte2 = 67;
        short variableShort2 = 569;
        short variableShort3 = -159;
        int variableInt2 = 27897;
        long variableLong2 = 987_678_965_549L;
        float variableFloat2 = 27.12F;
        double variableDouble2 = 2.786;

        // Task 3
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short totalPaper = 480;
        System.out.println("\nНа каждого ученика рассчитано " + totalPaper / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna) + " листов бумаги.");

        // Task 4
        byte bottlesPerTwoMinutes = 16;
        int bottlesPerMinute = bottlesPerTwoMinutes / 2;
        int bottlesPerTwentyMinutes = bottlesPerMinute * 20;
        int bottlesPerDay = bottlesPerMinute * 60 * 24;
        int bottlesPerThreeDays = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPerDay * 30;
        System.out.println("\nЗа 20 минут машина произвела " + bottlesPerTwentyMinutes + " штук бутылок.");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + bottlesPerThreeDays + " штук бутылок.");
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " штук бутылок.");

        // Task 5
        byte totalJar = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int quantityClasses = totalJar / (whitePaint + brownPaint);
        System.out.println("\nВ школе, где " + quantityClasses + " классов, нужно " + quantityClasses * 2  + " банок белой краски и " + quantityClasses * 4  + " банок коричневой краски.");

        // Task 6
        byte quantityBananas = 5;
        short quantityMilk = 200;
        byte quantityIceCream = 2;
        byte quantityEggs = 1;
        byte weightBanana = 80;
        byte weightMilk = 105;
        byte weightIceCream = 100;
        byte weightEggs = 70;
        int totalWeight = (quantityBananas * weightBanana) + (weightMilk * (quantityMilk / 100)) + (quantityIceCream * weightIceCream) + (quantityEggs * weightEggs);
        System.out.println("\nВес в граммах - " + totalWeight + " г.");
        System.out.println("Вес в килограммах - 0.88 кг.");

        // Task 7
        byte weight = 7;
        short lostWeight1 = 250;
        short lostWeight2 = 500;
        int Losing250PerDay = weight * 1000 / lostWeight1;
        int Losing500PerDay = weight * 1000 / lostWeight2;
        int LosingInAverage = (Losing250PerDay + Losing500PerDay) / 2;
        System.out.println("\nНужно потратить " + Losing250PerDay + " дней, чтобы потерять 7 кг веса, при потере 250 г веса в день.");
        System.out.println("Нужно потратить " + Losing500PerDay + " дней, чтобы потерять 7 кг веса, при потере 500 г веса в день.");
        System.out.println("В среднем нужно потратить " + LosingInAverage + " день, чтобы потерять 7 кг веса.");

        // Task 8
        int mashaMoneyPerMonth = 67760;
        int denisMoneyPerMonth = 83690;
        int kristinaMoneyPerMonth = 76230;
        int mashaSalaryAfterIncreasing = mashaMoneyPerMonth * 110 / 100;
        int denisSalaryAfterIncreasing = denisMoneyPerMonth * 110 / 100;
        int kristinaSalaryAfterIncreasing = kristinaMoneyPerMonth * 110 / 100;
        int mashaDifferenceSalary = mashaSalaryAfterIncreasing * 12 - mashaMoneyPerMonth * 12;
        int denisDifferenceSalary = denisSalaryAfterIncreasing * 12 - denisMoneyPerMonth * 12;
        int kristinaDifferenceSalary = kristinaSalaryAfterIncreasing * 12 - kristinaMoneyPerMonth * 12;
        System.out.println("\nМаша теперь получает " + mashaSalaryAfterIncreasing + " рублей. Годовой доход вырос на " + mashaDifferenceSalary + " рублей.");
        System.out.println("Маша теперь получает " + denisSalaryAfterIncreasing + " рублей. Годовой доход вырос на " + denisDifferenceSalary + " рублей.");
        System.out.println("Маша теперь получает " + kristinaSalaryAfterIncreasing + " рублей. Годовой доход вырос на " + kristinaDifferenceSalary + " рублей.");
    }
}