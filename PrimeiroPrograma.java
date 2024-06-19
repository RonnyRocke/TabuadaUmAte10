import java.util.Scanner;

public class PrimeiroPrograma {

    int opcao;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        PrimeiroPrograma PP = new PrimeiroPrograma();

        boolean menu = true;

        while (menu) {
            System.out.println("BEM VINDO A TABUADA!");
            System.out.print("DIGITE DE 1 Á 10 QUAL TABUADA DESEJA VER (11 PARA SAIR): ");
            PP.opcao = entrada.nextInt();

            switch (PP.opcao) {
                case 1:
                    System.out.println("TABUADA NO NÚMERO 1 ");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("1 x " + i + " = " + (1 * i));
                    }
                    System.out.println("FIM");
                    break;

                case 2:
                    System.out.println("TABUADA NO NÚMERO 2 ");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("2 x " + i + " = " + (2 * i));
                    }
                    System.out.println("FIM");
                    break;

                case 3:
                    System.out.println("TABUADA NO NÚMERO 3 ");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("3 x " + i + " = " + (3 * i));
                    }
                    System.out.println("FIM");
                    break;

                case 4:
                    System.out.println("TABUADA NO NÚMERO 4 ");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("4 x " + i + " = " + (4 * i));
                    }
                    System.out.println("FIM");
                    break;

                case 5:
                    System.out.println("TABUADA NO NÚMERO 5 ");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("5 x " + i + " = " + (5 * i));
                    }
                    System.out.println("FIM");
                    break;

                case 6:
                    System.out.println("TABUADA NO NÚMERO 6 ");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("6 x " + i + " = " + (6 * i));
                    }
                    System.out.println("FIM");
                    break;

                case 7:
                    System.out.println("TABUADA NO NÚMERO 7 ");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("7 x " + i + " = " + (7 * i));
                    }
                    System.out.println("FIM");
                    break;

                case 8:
                    System.out.println("TABUADA NO NÚMERO 8 ");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("8 x " + i + " = " + (8 * i));
                    }
                    System.out.println("FIM");
                    break;

                case 9:
                    System.out.println("TABUADA NO NÚMERO 9 ");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("9 x " + i + " = " + (9 * i));
                    }
                    System.out.println("FIM");
                    break;

                case 10:
                    System.out.println("TABUADA NO NÚMERO 10 ");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("10 x " + i + " = " + (10 * i));
                    }
                    System.out.println("FIM");
                    break;

                case 11:
                    menu = false;
                    System.out.println("VOCÊ SAIU DO PROGRAMA!");
                    break;

                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
                    break;
            }
        }

        entrada.close();
    }
}
