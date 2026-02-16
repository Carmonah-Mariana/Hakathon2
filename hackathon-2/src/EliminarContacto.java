import java.util.ArrayList;

public class EliminarContacto {
    public static boolean eliminarContacto(ArrayList<Contacto> agenda, String nombre) {
        if (nombre == null || nombre.isEmpty()) return false;
        for (int i = 0; i < agenda.size(); i++){
            if (agenda.get(i).getNombre().equalsIgnoreCase(nombre)){
                agenda.remove(i);
                return true;
            }
        }
        return false;
    }
    void main() {

    }
}
