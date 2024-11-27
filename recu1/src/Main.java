import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // declaro 3 puntos
        var puntito = new Punto(0, 0);
        var puntito2 = new Punto(1, 3);
        var puntito3 = new Punto(5,5);
        //declaro tres formas, una de cada
        var cuadrado1 = new Cuadrado("Cuadrado", "rojo", puntito, 5);
        var rect1 = new Rectangulo("Rectangulo", "rojo", puntito2, 5,4);
        var circulo1 = new Circulo("Circulo", "negro", puntito3,5.5f);

        //muestro un punto y una forma
        System.out.println(puntito.mostrarDatos());
        System.out.println(cuadrado1.mostrarDatos());

        //cambio color a un cuadrado
        cuadrado1.cambiarColor("verde");
        //muestro que el cambio funciono

        System.out.println(cuadrado1.obtenerColor());

        //cambio de centro y muestro nuevamente
        cuadrado1.moverCentro(puntito2);
        System.out.println(cuadrado1.mostrarDatos());

        //muestro el funcionamiento correcto de los metodos perimetro, area y escalar
        System.out.println(cuadrado1.perimetro());
        System.out.println(cuadrado1.area());
        cuadrado1.escalar(3.50f);

        //lo mismo para un rectangulo
        System.out.println(rect1.perimetro());
        System.out.println(rect1.area());
        rect1.escalar(3.50f);
        //muestro estado final de las formas donde se ve el funcionamiento de escalar();
        System.out.println(cuadrado1.mostrarDatos());
        System.out.println(rect1.mostrarDatos());

        //declaro una lista de formas
        ListaDeFormas lista1 = new ListaDeFormas();

        //agrego las tres formas a la lista
        System.out.println(lista1.agregarForma(cuadrado1));
        System.out.println(lista1.agregarForma(rect1));
        System.out.println(lista1.agregarForma(circulo1));

        //muestro la lista
        System.out.println(lista1.mostrarFormas());
        //muestro el mensaje de error al tratar de agregar dos veces una forma
        System.out.println(lista1.agregarForma(cuadrado1));

        // muestro el funcionamiento de los metodos areaMaxima y perimetroMinimo()
        System.out.println(lista1.areaMaxima().mostrarDatos());
        System.out.println(lista1.perimetroMinimo().mostrarDatos());
    }


}