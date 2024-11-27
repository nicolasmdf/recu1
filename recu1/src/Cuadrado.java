public class Cuadrado extends Forma{
    private float lado;

    public Cuadrado(String nombre, String color, Punto centro, float lado) {
        super(nombre, color, centro);
        this.lado = lado;
    }

    public String mostrarDatos(){
        return "nombre: " + nombre + " color: " + color + " centro: " + centro.mostrarDatos() + " lado: " + lado;
    };
    public float perimetro(){
        return lado*4;
    };
    public float area(){
        return lado*lado;
    };
    public void escalar(float m){
        lado = lado*m;
    };
}
