import datos.Libro;
import datos.Autor;
import datos.Almacen;
import com.coti.tools.Esdia;

public class App {

    public static void mostrarMenu(){
        String lineaHeader= "|" + "-".repeat(43)+"|";
        String prompt = "| ELIGE UNA OPCION ";

        System.out.println(lineaHeader);  
        System.out.println(prompt+" ".repeat(44-prompt.length())+"|");
        System.out.println(lineaHeader);
        System.out.println(" 1) Nuevo almacen de libros");
        System.out.println(" 2) Establecer ritmo de lectura (páginas por minuto)");
        System.out.println(" 3) Añadir un nuevo libro al almacen");
        System.out.println(" 4) Mostrar información actual de los libros");
        System.out.println(" 5) Salir (Se borrará toda la información)");
        System.out.println(" 6) Cargar libreria");
        System.out.println(lineaHeader);
    }

    public static void main(String[] args) throws Exception {
        Almacen libreria= new Almacen();
        int key= 0;
        while(key!=5){
            mostrarMenu();
                key = Esdia.readInt("");
                switch (key) {
                    case 1:
                        libreria= new Almacen();
                        break;
                
                    case 2:
                        float ritmo= Esdia.readFloat("INTRODUZCA EL NUEVO RITMO DE LECTURA \n");
                        libreria.setRitmolec(ritmo);
                        System.out.println("EL RITMO DE LECTURA ES: "+libreria.getRitmolec());
                        libreria.setTiempoAlmacen(ritmo);
                        break;
                    case 3:
                        libreria.addLibro();
                        break;
                    case 4:
                        libreria.setTiempoAlmacen(libreria.getRitmolec());//Actualiza los tiempos de lectura
                        libreria.setPrecioAlmacen();
                        libreria.mostrar();
                        break;
                    case 5:
                        break;
                    case 6:
                        libreria.cargar();
                        break;
                    default:
                        System.out.println("Seleccione correctamente una opcion del menú");
                        break;
                }
            }
        }
    }

