package datos;
public class Libro {
    private String titulo;
    private int añoPublicacion;
    private Autor autor;  
    private int numpaginas;
    private float tiempoLec;
    private float precio;

    public Libro(String titulo, Autor autor, int añoPublicacion, int numpaginas, float precio){
        this.titulo=titulo;
        this.autor=autor;
        this.añoPublicacion=añoPublicacion;
        this.numpaginas=numpaginas;
        this.tiempoLec= numpaginas;
        this.precio=precio;
    }

    public String getTitulo() {
        return titulo;
    }
    public Autor getAutor() {
        return autor;
    }
    public int getAñoPublicacion() {
        return añoPublicacion;
    }
    public int getNumpaginas() {
        return numpaginas;
    }   
    public float getTiempoLec() {
        return tiempoLec;
    }
    public float getPrecio() {
        return precio;
    }

    public void setTitulo(String titulo) {
    this.titulo = titulo;
    } 
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }
    public void setNumpaginas(int numpaginas) {
        this.numpaginas = numpaginas;
    }     
    public void setTiempoLec(float ritmo) {
        float numero = numpaginas;
        this.tiempoLec = numero*ritmo;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
   

    public void mostrar(){
        String nombre = autor.getNombre() + " " + autor.getApellidos();

        String msg =String.format("|%-20s|%-20s|%-10s|%12d|%12d|%12f|%12f|", titulo,nombre,autor.getPremioPlaneta(),añoPublicacion,numpaginas,tiempoLec,precio);
        System.out.println(msg);
    }
}
