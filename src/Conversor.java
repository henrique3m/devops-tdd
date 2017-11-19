
public class Conversor {

	public String converte(int i) {
		
		String resultado = "";
		if (i >= 1000 && i < 3999){
			resultado = ConverteMilhar(i/1000);
			i = i % 1000;
		}
		
		if ( i>= 100){
			resultado +=  ConverteCentena(i/100);
			i = i % 100;
		}
		
		if ( i >= 10){			
			resultado +=  ConverteDezena(i/10);
		    i= i % 10;
		}
		
		if ( i > 0)
			resultado +=  ConverteUnidade(i);

		return resultado;

	}
	
	public String ConverteMilhar (int i) {
		
		switch (i){      
		case 3:
			return "MMM";					
		case 2:
			return "MM";
		case 1:
			return "M";
		}
		return "";
	}
	
	public String ConverteCentena (int i) {
		
		switch (i){      
		case 9:
			return "CM";
		case 8:
			return "DCCC";
		case 7:
			return "DCC";
		case 6:
			return "DC";	
		case 5:
			return "D";	
		case 4:
			return "CD";			
		case 3:
			return "CCC";					
		case 2:
			return "CC";
		case 1:
			return "C";
		}
		return "";
	}
	
	public String ConverteDezena (int i) {
		
		switch (i){      
		case 9:
			return "XC";
		case 8:
			return "LXXX";
		case 7:
			return "LXX";
		case 6:
			return "LX";	
		case 5:
			return "L";	
		case 4:
			return "XL";			
		case 3:
			return "XXX";					
		case 2:
			return "XX";
		case 1:
			return "X";
		}
		return "";
	}

	public String ConverteUnidade(int i){
		switch (i){      
		case 9:
			return "IX";
		case 8:
			return "VIII";
		case 7:
			return "VII";
		case 6:
			return "VI";	
		case 5:
			return "V";	
		case 4:
			return "IV";			
		case 3:
			return "III";					
		case 2:
			return "II";
		case 1:
			return "I";
		}
		return "";
	}
}
