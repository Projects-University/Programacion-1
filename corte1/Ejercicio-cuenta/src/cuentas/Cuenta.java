package cuentas;

// Interfaces con métodos en español
interface IConsultable {
    void verSaldo();
}

interface IRetirable {
    void retirar(double monto);
}

interface ITransferible {
    void transferir(Cuenta destino, double monto);
}

// 1. Clase Padre - Uso de herencia
public abstract class Cuenta implements IConsultable {
    protected String numero;
    protected double saldo;

    public Cuenta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Se depositaron $" + monto + " en la cuenta " + numero);
        }
    }

    // 2. Uso de @Override al sobreescribir el método de la interfaz
    @Override
    public void verSaldo() {
        System.out.println("El saldo actual de la cuenta " + numero + " es: $" + saldo);
    }
}
