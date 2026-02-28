package datosPrincipales;

import java.util.Date;

public class Votante {
    // ENCAPSULAMIENTO
    // PROTECCION DE INFORMACION
    // CON ACCESO CONTROLADO

    private long numeroIdentificacion;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;

    // metodo modificar

    public void modificarNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    public void modificarApellido(String nuevoApellido) {
        apellido = nuevoApellido;
    }

    public void modificarnumeroIdentificacion(long nuevaIdentificacion) {
        numeroIdentificacion = nuevaIdentificacion;
    }

    public void modificarFechaNac(Date nuevaFecha) {
        fechaNacimiento = nuevaFecha;
    }

    // metodo obtener
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public long obtenerNumeroIdentif() {
        return numeroIdentificacion;
    }

    public Date obtenerFechaNac() {
        return fechaNacimiento;
    }

    public int calcularEdad() {
        if (fechaNacimiento == null) {
            return 0;
        }
        java.util.Calendar nacimiento = java.util.Calendar.getInstance();
        nacimiento.setTime(fechaNacimiento);
        java.util.Calendar hoy = java.util.Calendar.getInstance();

        int edad = hoy.get(java.util.Calendar.YEAR) - nacimiento.get(java.util.Calendar.YEAR);
        if (hoy.get(java.util.Calendar.MONTH) < nacimiento.get(java.util.Calendar.MONTH) ||
                (hoy.get(java.util.Calendar.MONTH) == nacimiento.get(java.util.Calendar.MONTH) &&
                        hoy.get(java.util.Calendar.DAY_OF_MONTH) < nacimiento.get(java.util.Calendar.DAY_OF_MONTH))) {
            edad--;
        }
        return edad;
    }
}
