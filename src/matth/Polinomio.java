package matth;

import java.util.ArrayList;

public class Polinomio {

	private ArrayList<Expresion> polinomio;

	private double grado;

	private int pre;

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

	public double darGrado()
	{
		return grado;
	}

	public void calcularGrado()
	{
		int cont=0;
		for(int i=0;i<polinomio.size();i++)
		{
			double grd;
			if(polinomio.get(i).getExponente().darC()!=null)
			{
				grd=polinomio.get(i).getExponente().darC();
			}
			else
			{
				grd= polinomio.get(i).getExponente().darA()/polinomio.get(i).getExponente().darB();
			}
			if(cont==0)
				grado=grd;
			else if(Double.compare(grd, grado)>0)
			{
				grado=grd;
			}
			cont++;
		}
	}
	
	public void cambiarPre(int pPre)
	{
		pre=pPre;
	}
	
	public int darPre()
	{
		return pre;
	}
}
