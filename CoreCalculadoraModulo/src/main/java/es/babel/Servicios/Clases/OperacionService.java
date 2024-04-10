package es.babel.Servicios.Clases;

import es.babel.Servicios.Interfaces.IOperacionService;
import org.springframework.stereotype.Service;

@Service
public class OperacionService implements IOperacionService {
    @Override
    public double suma(double numero1, double numero2) {
        return numero1+numero2;
    }

    @Override
    public double resta(double numero1, double numero2) {
        return numero1-numero2;
    }

    @Override
    public double multiplicacion(double numero1, double numero2) {
        return numero1*numero2;
    }

    @Override
    public double division(double numero1, double numero2) {
        return numero1/numero2;
    }
}
