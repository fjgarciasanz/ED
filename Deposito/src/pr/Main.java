package pr;

public class Main {

    private static  Cuenta1 miCuenta = new Cuenta1("Antonio Lopez","1000-2365-85-1230456789",2500,0);
    private static double saldoActual ;
    public static void main(String[] args) {
       
  
        operativa_cuenta(0,3);
        operativa_cuenta(2300,1);
        operativa_cuenta(695,2);
      }
    
    
    private static void operativa_cuenta(float cantidad, int i){
        
     switch(i){
         case 1:
      try {
            miCuenta.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
         break;
         case 2:
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
        break;
         case 3:
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        break;
    }
    } 
}
