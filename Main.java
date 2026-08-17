import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> entrada = List.of(1, 2, 3, 4);

        SomaQuadrados calculadora = new SomaQuadrados(entrada);
        int resultado = calculadora.calcular();

        System.out.println("Entrada: " + entrada);
        System.out.println("Soma dos quadrados: " + resultado);

        System.out.println(new SomaQuadrados(List.of(5, 10)).calcular());
        System.out.println(new SomaQuadrados(List.<Integer>of()).calcular());
    }
}
