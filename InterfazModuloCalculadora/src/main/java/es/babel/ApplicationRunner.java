package es.babel;

import es.babel.Aplicacion.CalculadoraApp;
import es.babel.InterfazConfiguration.InterfazConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ApplicationRunner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(InterfazConfig.class);
        CalculadoraApp calculadora = context.getBean(CalculadoraApp.class);
        calculadora.run();
    }
}