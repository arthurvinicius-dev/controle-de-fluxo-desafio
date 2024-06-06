import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUM = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUM, parametroDois);
        } catch (ParametrosInvalidosExeption exeption) {
            // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(exeption.getMessage());
        }
    }

    static void contar(int parametroUM, int parametroDois) throws ParametrosInvalidosExeption {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUM >= parametroDois) {
            throw new ParametrosInvalidosExeption("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUM;
        // Realizar o for para imprimir os números com base na variável contagem
        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}