import java.util.Random;

public class NotasAleatorias {
    public static void main(String[] args) {
        Random random = new Random();

        // Generar 3 notas aleatorias entre 0 y 10
        double nota1 = random.nextDouble() * 10;
        double nota2 = random.nextDouble() * 10;
        double nota3 = random.nextDouble() * 10;

        // Mostrar las notas
        System.out.println("Nota 1: " + String.format("%.2f", nota1));
        System.out.println("Nota 2: " + String.format("%.2f", nota2));
        System.out.println("Nota 3: " + String.format("%.2f", nota3));
    }
}

