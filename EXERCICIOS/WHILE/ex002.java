/** Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.*/

import java.util.Scanner;

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Produto: ");
    int produto = sc.nextInt();
    int alcool = 0;
    int gasolina = 0;
    int diesel = 0;
    
    while(produto != 4) {
        if(produto == 1) {
            alcool += 1;
        }else if (produto == 2){
            gasolina += 1;
        }else if(produto == 3){
            diesel += 1;
        }
        produto = sc.nextInt();
    }
    System.out.println("MUITO OBRIGADO");
    System.out.printf("Alcool: %d \n", alcool);
    System.out.printf("Gasolina: %d \n", gasolina);
    System.out.printf("Diesel: %d \n", diesel);
    
    sc.close();
}

// USANDO O SWITCH COMO RESPOSTA TAMBEM
import java.util.Scanner;

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int alcool = 0;
    int gasolina = 0;
    int diesel = 0;

    int produto = sc.nextInt();

    while (produto != 4) {
        switch (produto) {
        case 1:
            alcool += 1;
            break;
        case 2:
            gasolina += 1;
            break;
        case 3:
            diesel += 1;
            break;
        default:
            produto = 0;
        }
        produto = sc.nextInt();
    }

    System.out.println("MUITO OBRIGADO");
    System.out.println("Alcool: " + alcool);
    System.out.println("Gasolina: " + gasolina);
    System.out.println("Diesel: " + diesel);

    sc.close();
}