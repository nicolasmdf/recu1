public class Rectangulo extends Forma{
    private float ladoMenor;
    private float ladoMayor;

    public Rectangulo(String nombre, String color, Punto centro, float ladoMenor, float ladoMayor) {
        super(nombre, color, centro);
        this.ladoMenor = ladoMenor;
        this.ladoMayor = ladoMayor;
    }

    public String mostrarDatos(){
        return "nombre: " + nombre + " color: " + color + " centro: " + centro.mostrarDatos() + " lado menor: " + ladoMenor + " lado mayor: " + ladoMayor;
    };
    public float perimetro(){
        return (2*ladoMenor + 2*ladoMayor);
    };
    public float area(){
        return ladoMenor*ladoMayor;
    };
    public void escalar(float m){
        ladoMenor = ladoMenor*m;
        ladoMayor = ladoMayor*m;
    };
}
