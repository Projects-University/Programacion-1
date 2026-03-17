package cuentas;

// 3. Clase Hija - Uso de herencia, múltiples interfaces y @Overrides
public class CuentaAhorros extends Cuenta implements IRetirable, ITransferible {

    public CuentaAhorros(String numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("-> Retiro exitoso de $" + monto + " en la cuenta " + numero);
        } else {
            System.out.println("-> Error: Fondos insuficientes para retirar en la cuenta " + numero);
        }
    }

    @Override
    public void transferir(Cuenta destino, double monto) {
        if (monto > 0 && monto <= saldo) {
            this.saldo -= monto; // Retiramos de la cuenta actual
            destino.depositar(monto); // Depositamos en la cuenta destino
            System.out.println("-> Transferencia exitosa de $" + monto + " hacia la cuenta " + destino.numero);
        } else {
            System.out.println("-> Error: No se pudo transferir. Fondos insuficientes en la cuenta " + numero);
        }
    }
}
