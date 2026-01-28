package presentacion;

import dominio.*;
import servicio.IServiciosDeCalculadora;
import servicio.ServiciosDeCalculadora;

import java.util.Scanner;

public class Menu
{
    private static final Scanner entrada = new Scanner(System.in);

    //interfaz de implementacion

    private static final IServiciosDeCalculadora calculadora = new ServiciosDeCalculadora();

    public static void main(String[] args)
    {
        var salir = false;

        try {
            while (!salir)
            {
                mostrarMenu();
                salir = ejecutarOpciones();
            }
        }
        catch (Exception e)
        {
            System.out.println("Ocurrio un error en la operación: " + e.getMessage());
        }
    }


    // MENU OPERACIONES ARITMETICAS
    private static void MenuEcuacionesAritmeticas()
    {
        var salir = false;

        try {
            while (!salir)
            {
                System.out.println("""
                        \nOPERACIONES ARITMETICAS
                            1. Suma
                            2. Resta
                            3. Multiplicación
                            4. División
                            0. Regresar al menu principal
                        """);
                System.out.print("Ingrese una opción: ");
                int opcion = Integer.parseInt(entrada.nextLine());

                switch (opcion)
                {

                    case 1 ->
                    {
                        //pedimos los datos
                        System.out.println("Ingrese el primer numero:");
                        double num1 = Double.parseDouble(entrada.nextLine());
                        System.out.println("Ingrese el segundo numero:");
                        double num2 = Double.parseDouble(entrada.nextLine());
                        //declaramos una nueva variable para enviar los datos y mostrar un resultado
                        EcuAritmeticas Datos = new EcuAritmeticas(num1, num2);
                        System.out.println("El resultado de la suma es: " + calculadora.suma(Datos));
                    }
                    case 2 ->
                    {
                        //pedimos los datos
                        System.out.println("Ingrese el primer numero:");
                        double num1 = Double.parseDouble(entrada.nextLine());
                        System.out.println("Ingrese el segundo numero:");
                        double num2 = Double.parseDouble(entrada.nextLine());
                        //declaramos una nueva variable para enviar los datos y mostrar un resultado
                        EcuAritmeticas Datos = new EcuAritmeticas(num1, num2);
                        System.out.println("El resultado de la suma es: " + calculadora.resta(Datos));
                    }
                    case 3 ->
                    {
                        //pedimos los datos
                        System.out.println("Ingrese el primer numero:");
                        double num1 = Double.parseDouble(entrada.nextLine());
                        System.out.println("Ingrese el segundo numero:");
                        double num2 = Double.parseDouble(entrada.nextLine());
                        //declaramos una nueva variable para enviar los datos y mostrar un resultado
                        EcuAritmeticas Datos = new EcuAritmeticas(num1, num2);
                        System.out.println("El resultado de la suma es: " + calculadora.multiplicacion(Datos));
                    }
                    case 4 ->
                    {
                        //pedimos los datos
                        System.out.println("Ingrese el primer numero:");
                        double num1 = Double.parseDouble(entrada.nextLine());
                        System.out.println("Ingrese el segundo numero:");
                        double num2 = Double.parseDouble(entrada.nextLine());
                        //declaramos una nueva variable para enviar los datos y mostrar un resultado
                        EcuAritmeticas Datos = new EcuAritmeticas(num1, num2);
                        System.out.println("El resultado de la suma es: " + calculadora.div(Datos));
                    }
                    case 0 -> salir = true;
                    default -> System.out.println("Opción inválida.");
                }
            }
        }   catch (Exception e)
        {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
    }

    //MENU OPERACIONES LOGARITMICAS
    private static void MenuEcuacionesLogaritmicas()
    {
        var salir = false;

        try {
            while (!salir)
            {
                System.out.println("""
                        \nOPERACIONES LOGARITMICAS
                            1. Logaritmos Natural
                            2. Logaritmos Base10
                            0. Regresar al menú principal
                        """);
                System.out.print("Ingrese una opción: ");
                int opcion = Integer.parseInt(entrada.nextLine());

                switch (opcion)
                {
                    case 1 ->
                    {
                        //Pedimos el datos
                        System.out.println("\nIngrese un numero:");
                        double num = Double.parseDouble(entrada.nextLine());
                        //declaramos una nueva variable para enviar los datos y mostrar un resultado
                        EcuLogaritmicas Datos = new EcuLogaritmicas(num);
                        System.out.println("Resultado: "+calculadora.logaritmoNatural(Datos));

                    }
                    case 2 ->
                    {
                        //Pedimos el datos
                        System.out.println("\nIngrese un numero:");
                        double num = Double.parseDouble(entrada.nextLine());
                        //declaramos una nueva variable para enviar los datos y mostrar un resultado
                        EcuLogaritmicas Datos = new EcuLogaritmicas(num);
                        System.out.println("Resultado: "+calculadora.logaritmobase10(Datos));
                    }

                    case 0 -> salir = true;

                    default -> System.out.println("Opción inválida.");
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Ocurrio un error en la operación: " + e.getMessage());
        }
    }

    //SUB MENU OPERACIONES TRIGONOMETRICAS
    private static void MenuEcuacionesTrigonometricas()
    {
        var salir = false;

        try
        {
            while (!salir)
            {
                System.out.println("""
                        \nOPERACIONES LOGARITMICAS
                            1. Seno
                            2. Coseno
                            3. Tangente
                            0. Volver al menú principal
                        """);
                System.out.print("Ingrese una opción: ");
                int opcion = Integer.parseInt(entrada.nextLine());

                switch (opcion)
                {
                    case 1 ->
                    {
                        //Pedimos el datos
                        System.out.println("\nIngrese un numero:");
                        double num = Double.parseDouble(entrada.nextLine());

                        //declaramos una nueva variable para enviar los datos y mostrar un resultado
                        EcuTrigonometricas Datos = new EcuTrigonometricas(num);
                        System.out.println("Resultado: "+calculadora.seno(Datos));
                    }
                    case 2 ->
                    {
                        //Pedimos el datos
                        System.out.println("\nIngrese un numero:");
                        double num = Double.parseDouble(entrada.nextLine());

                        //declaramos una nueva variable para enviar los datos y mostrar un resultado
                        EcuTrigonometricas Datos = new EcuTrigonometricas(num);
                        System.out.println("Resultado: "+calculadora.coseno(Datos));
                    }
                    case 3 ->
                    {
                        //Pedimos el dato
                        System.out.println("\nIngrese un numero:");
                        double num = Double.parseDouble(entrada.nextLine());

                        //declaramos una nueva variable para enviar los datos y mostrar un resultado
                        EcuTrigonometricas Datos = new EcuTrigonometricas(num);
                        System.out.println("Resultado: "+calculadora.tangente(Datos));
                    }

                    case 0 -> salir = true;

                    default -> System.out.println("Opción inválida.");
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Ocurrio un error en la operación: " + e.getMessage());
        }
    }

    //Metodos Auxiliares
    private static void mostrarMenu()
    {
        System.out.println("""
                1. Operaciones Aritmetica
                2. Operaciones Logaritmo
                3. Operaciones Trigonometria
                0. Salir
                """);
        System.out.println("Ingrese una opcion: ");
    }

    private static boolean ejecutarOpciones()
    {
        int opcion = Integer.parseInt(entrada.nextLine());
        var salir = false;

        switch(opcion)
        {
            case 1 ->
            {
                MenuEcuacionesAritmeticas();
            }
            case 2 ->
            {
                MenuEcuacionesLogaritmicas();
            }
            case 3 ->
            {
                MenuEcuacionesTrigonometricas();
            }

            case 0 ->
            {
                System.out.println("Programa finalizado.");
                salir = true;
            }
            default ->
            {
                System.out.println("Ocurrio un error......");
            }
        }
        return salir;
    }

}

