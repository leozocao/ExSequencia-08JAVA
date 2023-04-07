import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double ganhaHora, horaTrabalha, sal;

        System.out.print("Digite quanto você ganha por hora: ");
        ganhaHora = teclado.nextDouble();
        System.out.print("Digite quantas horas você trabalha no mês: ");
        horaTrabalha = teclado.nextDouble();

        sal = ganhaHora * horaTrabalha;

        System.out.print("O seu salário no referido mês é de: R$" + sal);

        teclado.close();
    }
}