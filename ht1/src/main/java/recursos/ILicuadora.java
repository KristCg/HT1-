package recursos;

public interface ILicuadora{
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
