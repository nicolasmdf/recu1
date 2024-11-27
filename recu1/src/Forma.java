public abstract class Forma {
    protected String nombre;
    protected String color;
    protected Punto centro;

    public Forma(String nombre, String color, Punto centro) {
        this.nombre = nombre;
        this.color = color;
        this.centro = centro;
    }

    public void cambiarColor(String c){
        this.color = c;
    }
    public String obtenerColor(){
        return this.color;
    }
    public void moverCentro (Punto p){
        this.centro = p;
    }
    public abstract String mostrarDatos();
    public abstract float perimetro();
    public abstract float area();
    public abstract void escalar(float m);
}
