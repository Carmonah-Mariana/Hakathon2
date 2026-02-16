import java.util.Map;

public class EspaciosLibres {
    
    public static int calcular(Map<String, Contacto> agenda, int LIMITE) {
        return LIMITE - agenda.size();
    }
    
    void main() {
    }
}