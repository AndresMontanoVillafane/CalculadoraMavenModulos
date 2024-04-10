package es.babel.Servicios.Clases;

import es.babel.Servicios.Interfaces.ITransformacionDeDato;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class TransformacionDeDato implements ITransformacionDeDato {
    @Override
    public int conversorStringAInt(Scanner scanner){
        int opcion = 0;
        boolean esCorrecto = false;
        do {
            try{
                opcion = Integer.parseInt(scanner.nextLine());
                esCorrecto = true;
            } catch (NumberFormatException e){
                System.out.println("Ingrese un numero por favor");
            }
        }while (!esCorrecto);
        return opcion;
    }
}
