import java.util.ArrayList;

public class ListaDeFormas {

    private ArrayList<Forma> lista;

    public ListaDeFormas() {
        this.lista = new ArrayList<>();
    }

    public String agregarForma(Forma f){
        if (lista.contains(f)){
            return "Esta forma ya se encuentra cargada,";
        } else {
            lista.add(f);
            return "Forma agregada con exito.";
        }
    };
    public String mostrarFormas(){
        String res = "";
        for (Forma f : lista){
            res = res + f.mostrarDatos() + "\n";
        }
        return res;
    };
    public Forma areaMaxima(){
        float res = 0;
        int i = 0;
        int iRes= 0;
        for (Forma f : lista){
            if (f.area() > res){
                res = f.area();
                iRes = i;
            }
            i++;
        }
        return lista.get(iRes);
    };
    public Forma perimetroMinimo(){
        float res = lista.get(0).perimetro();
        int i = 0;
        int iRes= 0;
        for (Forma f : lista){
            if (f.perimetro() < res){
                res = f.perimetro();
                iRes = i;
            }
            i++;
        }
        return lista.get(iRes);
    };
}
