package datos;
public class Libro {
    private String titulo;
    private int añoPublicacion;
    private String autor;
    
    private int numpaginas;

    public Libro(String titulo, String autor, int añoPublicacion, int numpaginas){
        this.titulo=titulo;
        this.autor=autor;
        this.añoPublicacion=añoPublicacion;
        this.numpaginas=numpaginas;
    }

    public String getAutor() {
        return autor;
    }
    public int getAñoPublicacion() {
        return añoPublicacion;
    }
    public int getNumpaginas() {
        return numpaginas;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }
    public void setNumpaginas(int numpaginas) {
        this.numpaginas = numpaginas;
    }

}
