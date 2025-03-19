//CONTROLAR QUANTIDADE DA CASAS DECIMAIS
double x = 10.35784;
System.out.printf("%.2f", x);

//IMPORTAR O LOCALE 
import java.util.Locale;
Locale.setDefault(Locale.US);

//PRINTF
String nome = "Maria";
int idade = 31;
double renda = 4000.0;
System.out.printf("%s tem %d anos e ganha R$%.2f reais %n",nome, idade, renda);