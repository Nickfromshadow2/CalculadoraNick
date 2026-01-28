package servicio;

import dominio.EcuAritmeticas;
import dominio.EcuLogaritmicas;
import dominio.EcuTrigonometricas;

public interface IServiciosDeCalculadora
{

    //Inicializacion Aritmeticas
    double suma(EcuAritmeticas datos);
    double resta(EcuAritmeticas datos);
    double multiplicacion(EcuAritmeticas datos);
    double div(EcuAritmeticas datos);

    //Inicializacion Logaritmicas
    double logaritmoNatural(EcuLogaritmicas Ndatos);
    double logaritmobase10(EcuLogaritmicas Bdatos);

    //Inicializacion Trigonometricas
    double seno(EcuTrigonometricas datos);
    double coseno(EcuTrigonometricas datos);
    double tangente(EcuTrigonometricas datos);
}
