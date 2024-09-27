import java.util.ArrayList;
import java.util.List;

public class InicializarUsuariosYLogias {

    private static final List<Integer> logias7Personas = new ArrayList<>();
    private static final List<Integer> logias5Personas = new ArrayList<>();
    private static final List<Integer> logias3Personas = new ArrayList<>();
    private static final List<String> usuarios = new ArrayList<>();

    public static void cargarLogias() {
        inicializarLogiasPorCapacidad(logias7Personas, 3);
        inicializarLogiasPorCapacidad(logias5Personas, 4);
        inicializarLogiasPorCapacidad(logias3Personas, 3);
    }

    public static void inicializarLogiasPorCapacidad(List<Integer> logias, int cantidad) {
        for (int i = 1; i <= cantidad; i++) {
            logias.add(i);
        }
    }

    public static void cargarUsuarios() {
        usuarios.add("21212121k21");
        usuarios.add("21212121211");
        usuarios.add("21212121212");
        usuarios.add("21212121213");
        usuarios.add("21212121214");
        usuarios.add("21212121215");
        usuarios.add("21212121217");
        // Agrega más usuarios si es necesario...
    }
}
