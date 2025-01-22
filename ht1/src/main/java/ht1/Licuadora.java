package ht1;

public interface Licuadora {
    void encender();
    void apagar();
    double llenar(double volumen);
    int incrementarVelocidad();
    int decrecerVelocidad();
    int consultarVelocidad();
    boolean estaLlena();
    void vaciar();
    double servir(double volumenTestado);
}
