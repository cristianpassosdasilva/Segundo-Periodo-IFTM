package PrimeiraEtapa;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;
        
        do {
            // 1 - ler as coordenadas
            System.out.println("Digite as coordenadas da reta:");
            
            System.out.print("X1: ");
            double x1 = leCoordenada(scanner);
            
            System.out.print("Y1: ");
            double y1 = leCoordenada(scanner);
            
            System.out.print("X2: ");
            double x2 = leCoordenada(scanner);
            
            System.out.print("Y2: ");
            double y2 = leCoordenada(scanner);
            
            // 2 - se coordenadas forem válidas
            if (valida(x1, y1, x2, y2)) {
                // 2.1 - instanciar a classe Retas
                Retas reta = new Retas(x1, y1, x2, y2);
                
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
        
        System.out.println("Total de retas criadas: " + Retas.getContadorRetas());
        scanner.close();
    }
    
    public static boolean valida(double x1, double y1, double x2, double y2) {
        return x1 > 0 && y1 > 0 && x2 > 0 && y2 > 0;
    }
    
    public static double leCoordenada(Scanner scanner) {
        return scanner.nextDouble();
    }
}