/**Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo). */

import java.util.Scanner;

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int dentro = 0;
    int fora = 0;
    
    System.out.print("Digite quantos numeros quer execultar: ");
    int numero = sc.nextInt();
    
    for(int i = 1; i <= numero; i++) {
        System.out.printf("Valor %d:", i);
        int valor = sc.nextInt();
        
        if(valor >= 10 && valor <= 20 ) {
            dentro += 1;
        }else {
            fora += 1;
        }
    }
        
    System.out.printf("%d in \n", dentro);
    System.out.printf("%d out", fora);
        
    sc.close();
}