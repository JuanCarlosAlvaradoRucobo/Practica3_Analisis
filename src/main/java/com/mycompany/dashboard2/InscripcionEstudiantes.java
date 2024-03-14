public class InscripcionEstudiantes {
    public static void main(String[] args) {
        FormatoInscripcion formato = new FormatoInscripcion();
        TirasMaterias tiras = new TirasMaterias();
        
        // Simulamos la actualización del formato de inscripción
        formato.actualizarFormato();
        
        // Simulamos la inscripción de materias
        tiras.inscribir();
        
        // Simulamos la salida de la actualización de estudiantes
        tiras.updateEstudiante();
    }
}