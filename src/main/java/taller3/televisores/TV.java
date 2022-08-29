package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;
    private static int numTV;

    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        this.canal = 1;
        this.volumen = 1;
        this.precio = 500;
        numTV ++;
    }

    public static void setNumTV(int num) {
        numTV = num;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setVolumen(int volumen) {
        if(volumen<=7 && volumen>=0 && this.estado == true) {
            this.volumen = volumen;
        }
    }

    public void setCanal(int canal) {
        if(canal<=120 && canal>=1 && this.estado == true){
            this.canal = canal;
        }
    }

    public void turnOn() {
        this.estado = true;
    }

    public void turnOff() {
        this.estado = false;
    }

    public Marca getMarca() {
        return this.marca;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public int getCanal() {
        return this.canal;
    }

    public Control getControl() {
        return this.control;
    }

    public int getVolumen() {
        return this.volumen;
    }

    public int getPrecio() {
        return this.precio;
    }

    public static int getNumTV() {
        return numTV;
    }

    public void canalUp(){
        if(this.canal<120 && this.estado == true){
            this.canal ++;
        }
    }

    public void canalDown(){
        if(this.canal>1 && this.estado == true){
            this.canal --;
        }
    }

    public void volumenUp() {
        if(this.volumen<7 && this.estado == true){
            this.volumen ++;
        }
    }

    public void volumenDown() {
        if(this.volumen>0 && this.estado == true){
            this.volumen --;
        }
    }

}
