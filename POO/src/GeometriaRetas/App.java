package GeometriaRetas;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;
        
        do {
            // 1 - ler as coordenadas
            System.out.println("Digite as coordenadas da reta:");
            
            System.out.print("X1: ");
            double x1 = leCoordenada(1);
            
            System.out.print("Y1: ");
            double y1 = leCoordenada(2);
            
            System.out.print("X2: ");
            double x2 = leCoordenada(3);
            
            System.out.print("Y2: ");
            double y2 = leCoordenada(4);
            
            // 2.1 - instanciar a classe Retas
            Retas reta = new Retas(x1, y1, x2, y2);
            
            // 2 - se coordenadas forem válidas (usando método da classe Retas)
            if (reta.valida(x1, y1, x2, y2)) {
                // 2.2 - calcular o comprimento
                // 2.3 - contar retas  
                // 2.4 - exibir
                System.out.println(reta.exibe());
                
            } else {
                System.out.println("ERRO: As coordenadas devem estar no 1º quadrante!");
            }
            
            // 2.5 - perguntar se deseja repetir
            System.out.print("Deseja continuar? (s/n): ");
            resposta = scanner.next();
            
        } while (resposta.equalsIgnoreCase("s"));
        
        scanner.close();
    }
    
    public static double leCoordenada(int posicao) {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}