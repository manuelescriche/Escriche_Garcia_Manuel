package datos;

import com.coti.tools.Esdia;
import java.util.ArrayList; 


public class Almacen {
    //private Libro[] libros;
    ArrayList<Libro> libros; 
    private float ritmolec = 1;
    private float tiempoAlmacen;
    private float precioAlmacen;

    public Almacen(){
        this.libros = new ArrayList<Libro>();

    }
    public void addLibro(){
            String titulo = Esdia.readString("INTRODUCE EL TITULO: ");
            String _autor = Esdia.readString("INTRODUCE EL NOMBRE DEL AUTOR: ");
            int añoPublicacion = Esdia.readInt("INTRODUCE EL AÑO DE PUBLICACIÓN DEL LIBRO: ");
            int numpaginas = Esdia.readInt("INTRODUCE EL NUMERO DE PAGINAS: ");
            float precio = Esdia.readFloat("INTRODUCE EL PRECIO DEL LIBRO: ");
            String premioPlaneta= Esdia.readString("EL AUTOR TIENE PREMIO PLANETA?", "Si", "No");
            boolean _premioPlaneta=false;
            if(premioPlaneta=="Si"){
                _premioPlaneta = true;
            }
                 
            Autor autor = new Autor(_autor.split(" ")[0], _autor.split(" ")[1], _premioPlaneta);
            Libro libro = new Libro(titulo,autor,añoPublicacion,numpaginas,precio);
            libros.add(libro);
    }
    
    public void addLibro(String titulo, Autor autor, int añoPublicacion, int numpaginas,float precio) {
        Libro libro = new Libro(titulo,autor,añoPublicacion,numpaginas,precio);
        libros.add(libro);
    }
    public void cargar(){
        Autor autor1 = new Autor("Miguel"," de Cervantes", false);
        Libro libro1 = new Libro("El Quijote",autor1,1605,800,8.0f);
        libros.add(libro1);
    }

    public void mostrar(){
        String separador= "|" + "-".repeat(104)+"|";
        String prompt= "LIBROS EN EL ALMACEN";
        System.out.println(separador);  
        System.out.println("|"+" ".repeat(52-(prompt.length())/2)+prompt+" ".repeat(52-(prompt.length())/2)+"|");
        System.out.println(separador);
        String msg = String.format("|%-20s|%-20s|%-10s|%-12s|%-12s|%-12s|%-12s|","Título","Autor","P Planeta","Año Public.","Nº Páginas", "Tiempo Lec","Precio");
        System.out.println(msg);
        for(Libro l: libros){
            l.mostrar();
        }
        System.out.println(separador);
        String msg1=String.format("%f",tiempoAlmacen);
        String msg2=String.format("%f",precioAlmacen);
        System.out.println("| Tiempo de lectura total del almacén:"+" ".repeat(59-msg1.length())+tiempoAlmacen+" ".repeat(13)+"|");
        System.out.println("| Precio total del almacén:"+" ".repeat(83-msg2.length())+precioAlmacen+"|");
        System.out.println(separador);
        System.out.println("\n\n\n");
    }



    public void setRitmolec(float ritmolec) {
        this.ritmolec = ritmolec;
    }
    public float getRitmolec() {
        return ritmolec;
    }

    public void setTiempoAlmacen(float ritmo){
        float tiempo =0;
        for(Libro l: libros){
            l.setTiempoLec(ritmo);
            tiempo=tiempo + l.getTiempoLec();
        }
        this.tiempoAlmacen = tiempo;
    }
    public float getTiempoAlmacen() {
        return tiempoAlmacen;
    }

    public void setPrecioAlmacen(){
        float dinero =0;
        for(Libro l: libros){
            dinero=dinero + l.getPrecio();
        }
        this.precioAlmacen = dinero;
    }
    public float getPrecioAlmacen() {
        return precioAlmacen;
    }
   
}
