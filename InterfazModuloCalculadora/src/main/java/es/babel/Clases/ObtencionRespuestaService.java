package es.babel.Clases;
import es.babel.Interfaces.IObtencionDatosConsolaService;
import es.babel.Servicios.Clases.TransformacionDeDato;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class ObtencionRespuestaService implements IObtencionDatosConsolaService {

    public Scanner iniciarScanner(){
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    @Override
    public int valorIntroducido() {
        System.out.println("Ingrese a continuación un numero: ");
        TransformacionDeDato transformador = new TransformacionDeDato();
        int numero = transformador.conversorStringAInt((iniciarScanner()));
        return numero;
    }
}
