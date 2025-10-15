package GeometriaRetas;

public class Retas {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    public int cont;
    
    public Retas(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.cont = 0;  // Inicia com zero
        this.cont++;    // Incrementa no construtor (agora fica 1)
    }
    
    public double comprimento() {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    
    public String exibe() {
        return String.format(
            "=== RETA ===\n" +
            "Ponto 1: (%.2f, %.2f)\n" +
            "Ponto 2: (%.2f, %.2f)\n" +
            "Comprimento: %.2f unidades\n" +
            "Contador: %d",
            x1, y1, x2, y2, comprimento(), cont
        );
    }
}