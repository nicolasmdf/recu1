public class Circulo extends Forma{
    private float radio;

    public Circulo(String nombre, String color, Punto centro, float radio) {
        super(nombre, color, centro);
        this.radio = radio;
    }

    public String mostrarDatos(){
        return "nombre: " + nombre + " color: " + color + " centro: " + centro.mostrarDatos() + " radio: " + radio;
    };
    public float perimetro(){
        return (2*3.14f*radio);
    };
    public float area(){
        return 3.14f*radio*radio;
    };
    public void escalar(float m){
        radio = radio*m;
    };
}
