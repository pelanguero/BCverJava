package matth;

public class Expresion {
      
	//variable de la expresion
	private String letra;
	//numero que multiplica la expresion
	private double num;
	//exponente de la expresion
	private Exponente exp;
	//signo de la expresion
	private char signo;
	
	public Expresion(String pLetra,double pNum,Exponente pExp,char pSigno)
	{
		letra=pLetra;
		num=pNum;
		exp=pExp;
		signo=pSigno;
	}
	
	public String getLetra()
	{
		return letra;
	}
	
	public double getNum()
	{
		return num;
	}
	
	public Exponente getExponente()
	{
		return exp;
	}
	
	public char getSigno()
	{
		
		return signo;
	}
}
