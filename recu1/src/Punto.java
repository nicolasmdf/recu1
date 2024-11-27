public class Punto {
    private float x;
    private float y;

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public String mostrarDatos(){
        return "(" + String.valueOf(x) + "," + String.valueOf(y) + ")";
    }
}
