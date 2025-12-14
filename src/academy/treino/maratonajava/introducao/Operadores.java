package academy.treino.maratonajava.introducao;

public class Operadores {
    public static void main(String[] args) {
        // +   -   /   *
        int number01 = 100;
        int number02 = 200;

        System.out.println(number01 + number02);
        System.out.println(number01 - number02);
        System.out.println(number01 * number02);
        System.out.println(number01 / (double) number02);

        // %
        int rest = 20 % 2;

        System.out.println(rest);

        // < >   <=   >=   ==   !=
        boolean isTenBiggerThanTwelve = 10 > 20;
        boolean isTenSmallerThanTwelve = 10 < 20;
        boolean isTenEqualThanTwelve = 10 == 20;
        boolean isTenEqualThanTen = 10 == 10;
        boolean isTenDifferentThanTwelve = 10 != 20;
        boolean isTenDifferentThanTen = 10 != 10;

        System.out.println(isTenBiggerThanTwelve);
        System.out.println(isTenSmallerThanTwelve);
        System.out.println(isTenEqualThanTwelve);
        System.out.println(isTenEqualThanTen);
        System.out.println(isTenDifferentThanTwelve);
        System.out.println(isTenDifferentThanTen);

        // and = &&   or = ||   not = !
        int age = 35;
        float salary = 3500f;
        boolean WithinTheLawOlderThan30 = age > 30 && salary >= 4612;
        boolean WithinTheLawYoungThan30 = age < 30 && salary >= 3381;

        System.out.println(WithinTheLawOlderThan30);
        System.out.println(WithinTheLawYoungThan30);

        double contaCorrente = 200;
        double contaPoupanca = 10000;
        float pricePlaystation = 5000F;
        boolean isPlaystationFiveBuyable = contaCorrente > pricePlaystation || contaPoupanca > pricePlaystation;

        System.out.println(isPlaystationFiveBuyable);

        // =   +=   -=   *=   /=   %=
        double bonus = 1800;
        bonus = bonus + 1000;
        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);
    }
}