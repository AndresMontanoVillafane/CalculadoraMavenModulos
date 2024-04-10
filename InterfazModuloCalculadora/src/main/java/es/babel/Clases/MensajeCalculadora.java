package es.babel.Clases;

import es.babel.Interfaces.IMensajeCalculadora;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;

@Service
public class MensajeCalculadora implements IMensajeCalculadora {
    @Override
    public void mostrarCabecera() {
        System.out.println("Bienvenido a la calculadora, selecciona una opción:\n"
                + "1. Sumar\n"
                + "2. Restar\n"
                + "3. Multiplicar\n"
                + "4. Dividir\n"
                + "5. Salir");
    }

    @Override
    public void mostrarMensajeDespedida() {
        System.out.println("Feliz día");
    }

    public void resultadoPorPantalla(Double resultado){
        System.out.println("El resultado de la operacion es: " + resultado);
    }
}
