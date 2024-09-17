/*Crie uma classe com um método que lê o comprimento de 3 pedaços de madeira e verifica se os mesmos podem formar um triângulo, ou seja, se cada lado é menor que a soma dos outro dois. Esse método deve ser chamado pelo método main de outra classe do mesmo projeto. A < B + C B < A + C  C < A + B */
import java.util.Scanner;
public class comprimento{  //A CLASSE
    public void medir(){  //O MÉTODO
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o comprimento do pedaço A:");
        double A = sc.nextDouble();
        System.out.println("Informe o comprimento do pedaço B:");
        double B = sc.nextDouble();
        System.out.println("Informe o comprimento do pedaço C:");
        double C = sc.nextDouble();

        if (A < B + C && B < A + C && C < A + B) {
            System.out.println("Os comprimentos podem formar um triângulo.");
        } else {
            System.out.println("Os comprimentos não podem formar um triângulo.");
        }
    }
}
