package matth;

public class Exponente {
    
	//numerador del exponente fraccionario
	private Integer a;
	//denominador del exponente fraccionario
	private Integer b;
	//double de un exponente 
	private Double c;
	//exponente fraccionario
	public Exponente(int A,int B)
	{
		a=new Integer(A);
		b=new Integer(B);
	}
	//exponente decimal
	public Exponente(double C)
	{
		c=new Double(C);
	}
	
	public Integer darA()
	{
		return a;
	}
	
	public Integer darB()
	{
		return b;
	}
	public Double darC()
	{
		return c;
	}
}
