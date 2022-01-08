package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rs1 = value / 70;
        return rs1;
    }

    public static float rubleToDollar(float value) {
        float rs1 = value / 60;
        return rs1;
    }

    public static void main(String[] args) {

        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        float dollars = Converter.rubleToDollar(180);
        System.out.println("140 rubles are " + dollars + " dollars.");
        expected = 3;
        out = Converter.rubleToDollar(in);
        System.out.println("140 rubles are 3. Test result : " + passed);
    }
}

