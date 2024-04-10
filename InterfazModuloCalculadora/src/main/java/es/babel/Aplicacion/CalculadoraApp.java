package es.babel.Aplicacion;

import es.babel.Interfaces.IMensajeCalculadora;
import es.babel.Interfaces.IObtencionDatosConsolaService;
import es.babel.Servicios.Interfaces.IOperacionService;
import org.springframework.stereotype.Component;

@Component
public class CalculadoraApp {

    private final IObtencionDatosConsolaService obtencionDatosService;
    private final IOperacionService operacionService;

    private final IMensajeCalculadora mensajeCalculadora;

    public CalculadoraApp(IObtencionDatosConsolaService obtencionDatosService,
                          IOperacionService operacionService, IMensajeCalculadora mensajeCalculadora){
        this.obtencionDatosService = obtencionDatosService;
        this.operacionService = operacionService;
        this.mensajeCalculadora = mensajeCalculadora;
    }

    public void run(){
        boolean continuar = true;
        while(continuar){
            mensajeCalculadora.mostrarCabecera();
            int opcion = this.obtencionDatosService.valorIntroducido();
            continuar = controlSalidaPrograma(opcion, continuar);
            operacion(opcion);
        }
    }
    private void operacion(int eleccion){
        double resultado;
        switch (eleccion){

            case 1:
                resultado = operacionService.suma(obtencionDatosService.valorIntroducido(),
                        obtencionDatosService.valorIntroducido());
                mensajeCalculadora.resultadoPorPantalla(resultado);
                break;
            case 2:
                resultado = operacionService.resta(obtencionDatosService.valorIntroducido(),
                        obtencionDatosService.valorIntroducido());
                mensajeCalculadora.resultadoPorPantalla(resultado);
                break;
            case 3:
                resultado = operacionService.multiplicacion(obtencionDatosService.valorIntroducido(),
                        obtencionDatosService.valorIntroducido());
                mensajeCalculadora.resultadoPorPantalla(resultado);
                break;
            case 4:
                resultado= operacionService.division(obtencionDatosService.valorIntroducido(),
                        obtencionDatosService.valorIntroducido());
                mensajeCalculadora.resultadoPorPantalla(resultado);
                break;
            case 5:
                System.out.println("Finalizando programa...");
                mensajeCalculadora.mostrarMensajeDespedida();
                break;
            default:
                System.out.println("Ingrese una opcion válida");
                break;
        }
    }
    private boolean controlSalidaPrograma(int opcionDeSalida, boolean continuarConElPrograma){
        if(opcionDeSalida == 5){
            continuarConElPrograma = false;
        }
        return continuarConElPrograma;
    }
}
