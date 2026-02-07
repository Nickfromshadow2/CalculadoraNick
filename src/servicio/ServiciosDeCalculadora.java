package servicio;

import dominio.EcuAritmeticas;
import dominio.EcuLogaritmicas;
import dominio.EcuTrigonometricas;

public class ServiciosDeCalculadora implements IServiciosDeCalculadora
{
    //Aritmetica
    @Override
    public double suma(EcuAritmeticas datos)
    {
        return datos.getNum1() + datos.getNum2();
    }

    @Override
    public double resta(EcuAritmeticas datos)
    {
        return datos.getNum1() - datos.getNum2();
    }

    @Override
    public double multiplicacion(EcuAritmeticas datos)
    {
        return datos.getNum1() * datos.getNum2();
    }

    @Override
    public double div(EcuAritmeticas datos)
    {
        if (datos.getNum2() == 0)
        {
            System.out.println("Error: No se puede dividir por cero");
            return 0;
        }
        return datos.getNum1() / datos.getNum2();
    }

    //Logaritmos
    @Override
    public double logaritmoNatural(EcuLogaritmicas Ndatos)
    {
        if(Ndatos.getNumeros() <= 0)
        {
            System.out.println("Error: solo se permiten valores positivo");
            return 0;
        }
        return Math.log(Ndatos.getNumeros());
    }

    @Override
    public double logaritmobase10(EcuLogaritmicas Bdatos)
    {
        if(Bdatos.getNumeros()<= 0)
        {
            System.out.println("Error: solo puede ser positivo");
            return 0;
        }
        return Math.log10(Bdatos.getNumeros());
    }

    //Trigonometria
    @Override
    public double seno(EcuTrigonometricas datos)
    {
        return Math.sin(datos.DeGradosARadianes());
    }

    @Override
    public double coseno(EcuTrigonometricas datos)
    {
        return Math.cos(datos.DeGradosARadianes());
    }

    @Override
    public double tangente(EcuTrigonometricas datos)
    {
        return Math.tan(datos.DeGradosARadianes());
    }
}
