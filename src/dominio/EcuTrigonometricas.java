package dominio;

public class EcuTrigonometricas
{
    private double grados;
    public EcuTrigonometricas(){}

    public EcuTrigonometricas(double grados)
    {
        this.grados = grados;
    }

    public double getGrados()
    {
        return grados;
    }

    public void setGrados(double grados)
    {
        this.grados = grados;
    }

    public double DeGradosARadianes()
    {
        return Math.toRadians(grados);
    }
}
