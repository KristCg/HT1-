package recursos;

public class Licuadora implements ILicuadora{
    private int velocidad;
    private boolean estado;
    private double capacidadMax;
    private double cantidadActual;

    public Licuadora(int velocidad, double capacidadMax) {
        this.velocidad = velocidad;
        this.estado = false;
        this.capacidadMax = capacidadMax;
        this.cantidadActual = 0;
    }
    
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    @Override
    public void encender() {
        this.estado = true;
        this.velocidad = 1;

    }

    @Override
    public void apagar() {
        this.estado = false;
        this.velocidad = 0;
    }

    @Override
    public double llenar(double volumen) {
        if (this.capacidadMax >= volumen){
            this.cantidadActual += volumen;
        }
        else{
            this.cantidadActual = this.capacidadMax;
        }
        return this.cantidadActual;
    }

    @Override
    public int incrementarVelocidad() {
        if (this.velocidad < 3){
            this.velocidad += 1;
            return this.velocidad;
        }
        else{
            return this.velocidad; 
        }

    }

    @Override
    public int decrecerVelocidad() {
        if (this.velocidad > 1){
            this.velocidad -= 1;
            return this.velocidad;
        }
        else{
            return this.velocidad; 
        }
    }

    @Override
    public boolean estaLlena() {
        if (this.cantidadActual == 0){
            return false;
        }
        else{
            return true; 
        }

    }

    @Override
    public void vaciar() {
        this.cantidadActual = 0;

    }

    @Override
    public double servir(double volumenTestado) {
        if (volumenTestado <= this.cantidadActual){
            this.cantidadActual -= volumenTestado;
            return this.cantidadActual;
        }
        else{
            this.cantidadActual = 0;
            return this.cantidadActual; 
        }

    }

    @Override
    public int consultarVelocidad() {
        return this.velocidad;
    }
}