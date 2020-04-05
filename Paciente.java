/**
 * @author Walter Saldaña #19897
 * Clase que almacena la ficha de los pacientes
 */

public class Paciente implements Comparable<Paciente>{

    private String nombre;
    private String sintoma;
    private String codigo;

    /**
     * Constructor sin parametros
     * Crea un objeto de tipo Paciente vacio
     */
    public Paciente(){}

    /**
     * Constructor parametros
     * Crea un objeto Paciente con atributos inicializados
     * @param nombre Nombre del paciente
     * @param sintoma Sintoma que tiene
     * @param codigo Nivel de emergencia del sintoma
     */
    public Paciente(String nombre, String sintoma, String codigo){
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.codigo = codigo;
    }

    //--------COMPARABLE--------------------------------------------------------------------------------------------------------------------------------

    public int compareTo(Paciente other){
        return this.codigo.compareTo(other.codigo);
    }

    //--------SETTERS-----------------------------------------------------------------------------------------------------------------------------------

    /**
     * Setter de atributo nombre
     * @param nombre nombre del paciente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Setter de atributo sintoma
     * @param sintoma sintoma del paciente
     */
    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    /**
     * Setter de atributo codigo
     * @param codigo codigo de emergencia
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    //--------GETTERS-----------------------------------------------------------------------------------------------------------------------------------

    /**
     * @return Nombre del paciente
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * @return Sintomas del paciente
     */
    public String getSintoma(){
        return this.sintoma;
    }

    /**
     * @return Codigo de emergencia del paciente
     */
    public String getCodigo(){
        return this.codigo;
    }

    //--------TO STRING--------------------------------------------------------------------------------------------------------------------------------

    public String toString(){
        return this.nombre+", "+this.sintoma+", "+this.codigo;
    }
}