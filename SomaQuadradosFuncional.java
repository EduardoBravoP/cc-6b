import java.util.List;

public class SomaQuadradosFuncional {

    public static int calcular(List<Integer> lista) {
        return lista.stream()
                .mapToInt(n -> n * n)
                .sum();
    }

    public static int calcularComReduce(List<Integer> lista) {
        return lista.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> lista = List.of(1, 2, 3, 4);

        System.out.println("map + sum:    " + calcular(lista));
        System.out.println("map + reduce: " + calcularComReduce(lista));
        System.out.println("lista vazia:  " + calcular(List.of()));
    }
}
