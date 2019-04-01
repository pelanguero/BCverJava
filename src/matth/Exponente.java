package matth;

public class Exponente {
    
	//numerador del exponente fraccionario
	private int a;
	//denominador del exponente fraccionario
	private int b;
	//double de un exponente 
	private double c;
	//exponente fraccionario
	public Exponente(int A,int B)
	{
		a=A;
		b=B;
	}
	//exponente decimal
	public Exponente(double C)
	{
		c=C;
	}
	
	public int darA()
	{
		return a;
	}
	
	public int darB()
	{
		return b;
	}
	public double darC()
	{
		return c;
	}
}
