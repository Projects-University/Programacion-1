import cuentas.CuentaAhorros;

/**
 * Author: Vinni 2025
 */
// public class Principal {
//     public static void main(String[] args) {
//         java.awt.EventQueue.invokeLater(new Runnable() {
//             public void run() {
//                 new Ventana().setVisible(true);
//             }
//         });
//     }
// }

public class Principal {
    public static void main(String[] args) {
        System.out.println("===== INICIO DEL EJERCICIO: RETIRO, VER SALDO Y TRANSFERIR =====");
        
        CuentaAhorros miCuenta = new CuentaAhorros("C-1001", 50000);
        CuentaAhorros cuentaAmigo = new CuentaAhorros("C-2002", 0);

        System.out.println("\n--- 1. VER SALDO ---");
        miCuenta.verSaldo();
        cuentaAmigo.verSaldo();

        System.out.println("\n--- 2. RETIRO ---");
        miCuenta.retirar(15000);
        miCuenta.verSaldo();

        System.out.println("\n--- 3. TRANSFERIR ---");
        miCuenta.transferir(cuentaAmigo, 20000);
        
        System.out.println("\n--- SALDOS FINALES ---");
        miCuenta.verSaldo();
        cuentaAmigo.verSaldo();
        
        System.out.println("================================================================");
    }
}
