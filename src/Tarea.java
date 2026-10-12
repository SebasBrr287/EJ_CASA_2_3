public class Tarea {
    public String titulo;
    public String responsable;

    // Atributos con acceso por defecto
    double horasEstimadas;
    boolean completada;

    // Métodos public
    public void mostrarInformacion() {
        System.out.println("Tarea: " + titulo + " Responsable: " + responsable + " Horas: " + horasEstimadas + " Completada: " + completada);
    }

    public void completar() {
        completada = true;
        System.out.println("La tarea '" + titulo + "' ha sido completada.");
    }

    // Métodos con acceso por defecto
    void mostrarResponsable() {
        System.out.println("Responsable de la tarea '" + titulo + "': " + responsable);
    }

    void mostrarEstado() {
        System.out.println("Estado de completado para '" + titulo + "': " + completada);
    }
}
