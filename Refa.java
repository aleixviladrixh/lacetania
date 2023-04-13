


public class Refa {
	public int sou;
	
	private boolean es_bo()
	{
		return true;
	}
	
	private boolean no_es_bo()
	{
		return false;
	}
	
	public boolean EsBonempleat(int problema) {
		if(problema == 0) return true;
		else if(problema < 3) {
			if(sou < 500) return es_bo();
			else return no_es_bo();
		}
		else if(problema >= 3) return no_es_bo();
		else return false;
	}
	
}