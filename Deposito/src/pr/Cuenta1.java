package pr;


/**
 * Clase Cuenta para la gestion de cuentas Tarea 04
 * @author Francisco Javier Garcia Sanz
 */
public class Cuenta1 {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor sin parametros
     */
    public Cuenta1()
    {
    }

    /**
     * Constructor 
     * @param nom  Dueño de la cuenta
     * @param cue  Número de cuenta
     * @param sal  Saldo en la cuenta
     * @param tipo tipo de interes de la cuenta
     */
    public Cuenta1(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Devuelve el saldo de la cuente
     * @return Saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Ingresa dinero en la cuenta
     * @param cantidad cantidad a ingresar se sumara al saldo
     * @throws Exception si la cantidad es negativa genera un error
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = getSaldo() + cantidad;
    }

    /**
     * Retira dinero de la cuenta
     * @param cantidad cantidad a retirar se restara al saldo
     * @throws Exception genera error si la cantidad es negativa o no hay sufieciente saldo en la cuenta
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = getSaldo() - cantidad;
    }

    /**
     * Devuelve el propietario de la cuenta
     * @return nombre del propietario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre del propietario de la cuenta
     * @param nombre nombre del nuevo propietario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el numero de cuenta
     * @return número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Cambia el saldo de la cuenta
     * @param cuenta el nuevo saldo de la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo de la cuenta
     * @return saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Devuelve el tipo de interes de la cuenta
     * @return tipo de interes
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Cambia el tipo de interes de la cuenta
     * @param tipoInteres nuevo tipo de interes
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
