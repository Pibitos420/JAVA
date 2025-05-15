import java.util.Date;

public class Alumno {
    private long legajo;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;

    public Alumno(long legajo, String nombre, String apellido, Date fechaNacimiento) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Alumno{" + "legajo=" + legajo + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    public long getLegajo() {
        return legajo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }



}

