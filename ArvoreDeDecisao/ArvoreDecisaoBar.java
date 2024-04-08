package ArvoreDeDecisao;

import java.util.Scanner;

public class ArvoreDecisaoBar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tipoBebida = obterTipoBebida(scanner);
        if (tipoBebida == 0) {
            escolherBebidaAlcoolica(scanner);
        } else if (tipoBebida == 1) {
            escolherBebidaNaoAlcoolica(scanner);
        }

        scanner.close();
    }

    private static int obterTipoBebida(Scanner scanner) {
        int tipoBebida = -1;
        while (tipoBebida != 0 && tipoBebida != 1) {
            System.out.println("Escolha o tipo de bebida:");
            System.out.println("0 - para Bebida Alcóolica");
            System.out.println("1 - para Bebida não Alcóolica");
            System.out.print("Digite (0 ou 1): ");
            tipoBebida = validarEntrada(scanner);
        }
        return tipoBebida;
    }

    private static void escolherBebidaAlcoolica(Scanner scanner) {
        int preferenciaSabor = escolherPreferenciaSabor(scanner);
        if (preferenciaSabor == 0) {
            escolherBebidaAmarga(scanner);
        } else if (preferenciaSabor == 1) {
            escolherBebidaDoce(scanner);
        }
    }

    private static int escolherPreferenciaSabor(Scanner scanner) {
        int preferenciaSabor = -1;
        while (preferenciaSabor != 0 && preferenciaSabor != 1) {
            System.out.println("Escolha a preferência de sabor:");
            System.out.println("0 - para Amargo");
            System.out.println("1 - para Doce");
            System.out.print("Digite (0 ou 1): ");
            preferenciaSabor = validarEntrada(scanner);
        }
        return preferenciaSabor;
    }

    private static void escolherBebidaAmarga(Scanner scanner) {
        int tipoBebidaAmarga = -1;
        while (tipoBebidaAmarga != 0 && tipoBebidaAmarga != 1) {
            System.out.println("Escolha o tipo de bebida:");
            System.out.println("0 - para Cerveja");
            System.out.println("1 - para Licor");
            System.out.print("Digite (0 ou 1): ");
            tipoBebidaAmarga = validarEntrada(scanner);
        }
        if (tipoBebidaAmarga == 0) {
            System.out.println("Cerveja recomendada.");
        } else {
            System.out.println("Licor recomendado.");
        }
    }

    private static void escolherBebidaDoce(Scanner scanner) {
        int tipoBebidaDoce = -1;
        while (tipoBebidaDoce != 0 && tipoBebidaDoce != 1) {
            System.out.println("Escolha o tipo de bebida:");
            System.out.println("0 - para Caipirinha");
            System.out.println("1 - para Mojito");
            System.out.print("Digite (0 ou 1): ");
            tipoBebidaDoce = validarEntrada(scanner);
        }
        if (tipoBebidaDoce == 0) {
            System.out.println("Caipirinha recomendada.");
        } else {
            System.out.println("Mojito recomendado.");
        }
    }

    private static void escolherBebidaNaoAlcoolica(Scanner scanner) {
        int preferenciaTemperatura = escolherPreferenciaTemperatura(scanner);
        if (preferenciaTemperatura == 0) {
            escolherBebidaFria(scanner);
        } else if (preferenciaTemperatura == 1) {
            escolherBebidaQuente(scanner);
        }
    }

    private static int escolherPreferenciaTemperatura(Scanner scanner) {
        int preferenciaTemperatura = -1;
        while (preferenciaTemperatura != 0 && preferenciaTemperatura != 1) {
            System.out.println("Escolha a preferência da temperatura:");
            System.out.println("0 - para Fria");
            System.out.println("1 - para Quente");
            System.out.print("Digite (0 ou 1): ");
            preferenciaTemperatura = validarEntrada(scanner);
        }
        return preferenciaTemperatura;
    }

    private static void escolherBebidaFria(Scanner scanner) {
        int tipoBebidaFria = -1;
        while (tipoBebidaFria != 0 && tipoBebidaFria != 1) {
            System.out.println("Escolha o tipo de bebida:");
            System.out.println("0 - para Suco");
            System.out.println("1 - para Refrigerante");
            System.out.print("Digite (0 ou 1): ");
            tipoBebidaFria = validarEntrada(scanner);
        }
        if (tipoBebidaFria == 0) {
            System.out.println("Suco recomendado.");
        } else {
            System.out.println("Refrigerante recomendado.");
        }
    }

    private static void escolherBebidaQuente(Scanner scanner) {
        int tipoBebidaQuente = -1;
        while (tipoBebidaQuente != 0 && tipoBebidaQuente != 1) {
            System.out.println("Escolha o tipo de bebida:");
            System.out.println("0 - para Café");
            System.out.println("1 - para Chá");
            System.out.print("Digite (0 ou 1): ");
            tipoBebidaQuente = validarEntrada(scanner);
        }
        if (tipoBebidaQuente == 0) {
            System.out.println("Café recomendado.");
        } else {
            System.out.println("Chá recomendado.");
        }
    }

    private static int validarEntrada(Scanner scanner) {
        String input = scanner.nextLine();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("\nEntrada inválida, por favor, digite somente números inteiros 0 ou 1.");
            return -1;
        }
    }
}
