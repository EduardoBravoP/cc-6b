import java.util.List;
import java.util.Objects;

public class SomaQuadrados {

    private final List<Integer> numeros;

    public SomaQuadrados(List<Integer> numeros) {
        Objects.requireNonNull(numeros, "A lista nao pode ser nula.");
        this.numeros = List.copyOf(numeros);
    }

    public int calcular() {
        int soma = 0;
        for (int n : numeros) {
            soma = soma + quadrado(n);
        }
        return soma;
    }
    
    private int quadrado(int n) {
        return n * n;
    }

    @Override
    public String toString() {
        return "SomaQuadrados" + numeros;
    }
}
