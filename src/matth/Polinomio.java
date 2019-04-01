package matth;

import java.util.ArrayList;

public class Polinomio {

	private ArrayList<Expresion> polinomio;
	
    
	
	public Polinomio()
	{
		polinomio=new ArrayList<Expresion>();
	}
	
	public void agregarExpresion(Expresion pExpresion)
	{
		polinomio.add(pExpresion);
	}
	
	public ArrayList<Expresion> darExpresiones()
	{
		return polinomio;
	}
	
}
