package datos;

public class Autor {
    private String nombre;
    private String apellidos;
    private boolean premioPlaneta;

    public Autor(String nombre, String apellidos, boolean premioPlaneta){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.premioPlaneta=premioPlaneta;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getNombre() {
        return nombre;
    }

    public String getPremioPlaneta(){
        if (premioPlaneta) {
            return "Sí";
        }else{
            return "No";
        }
            
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPremioPlaneta(boolean premioPlaneta) {
        this.premioPlaneta = premioPlaneta;
    }
}
