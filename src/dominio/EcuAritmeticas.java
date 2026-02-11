package dominio;

public class EcuAritmeticas
{
    private double num1,num2;

    public EcuAritmeticas()
    {
    }

    public EcuAritmeticas(double num1, double num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1()
    {
        return num1;
    }

    public void setNum1(double num1)
    {
        this.num1 = num1;
    }

    public double getNum2()
    {
        return num2;
    }

    public void setNum2(double num2)
    {
        this.num2 = num2;
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == null || getClass() != o.getClass()) return false;

        EcuAritmeticas that = (EcuAritmeticas) o;
        return Double.compare(num1, that.num1) == 0 && Double.compare(num2, that.num2) == 0;
    }

    @Override
    public int hashCode()
    {
        int result = Double.hashCode(num1);
        result = 31 * result + Double.hashCode(num2);
        return result;
    }
}
