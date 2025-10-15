package GeometriaRetas;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;
        int totalRetas = 0;
        
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
            
            // 2 - se coordenadas forem válidas (usando classe Validacao)
            // Demonstrando uso dos dois métodos da classe Validacao
            boolean coordenadasValidas = Validacao.valida(x1, y1, x2, y2);
            boolean noQuadranteUm = Validacao.isQuadOne(x1, y1, x2, y2);
            
            System.out.println("Validação básica: " + coordenadasValidas);
            System.out.println("Está no 1º quadrante: " + noQuadranteUm);
            
            if (coordenadasValidas && noQuadranteUm) {
                // 2.1 - instanciar a classe Retas
                Retas reta = new Retas(x1, y1, x2, y2);
                
                // 2.2 - calcular o comprimento
                // 2.3 - contar retas (usando o cont público)
                totalRetas += reta.cont;
                
                // Demonstrar o uso do cont público
                System.out.println("Esta é a reta número: " + reta.cont);
                
                // 2.4 - exibir
                System.out.println(reta.exibe());
                
                // Exemplo: incrementar o contador após exibir
                reta.cont++;
                System.out.println("Contador após incremento: " + reta.cont);
                
            } else {
                System.out.println("ERRO: As coordenadas devem estar no 1º quadrante!");
            }
            
            // 2.5 - perguntar se deseja repetir
            System.out.print("Deseja continuar? (s/n): ");
            resposta = scanner.next();
            
        } while (resposta.equalsIgnoreCase("s"));
        
        System.out.println("\nTotal de retas válidas criadas: " + totalRetas);
        scanner.close();
    }
    
    public static double leCoordenada(Scanner scanner) {
        return scanner.nextDouble();
    }
}