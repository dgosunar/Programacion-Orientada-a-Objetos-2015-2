
public class Ficha {
	
	String nombre;
	boolean colorFicha;
	String movimiento[][];
	String inicial[][];
	String Final[][];
	boolean aprobado = false;
	
		/*Inicial[a][b]="XXX";
		Final[c][d]="XXX";
		if (Final[c][d]==Inicial[a][b+1] || Final[c][d]==Inicial[a][b-1] || Final[c][d]==Inicial[a+1][b] || Final[c][d]==Inicial[a-1][b] || Final[c][d]==Inicial[a+1][b+1] || Final[c][d]==Inicial[a-1][b+1] || Final[c][d]==Inicial[a-1][b+1] || Final[c][d]==Inicial[a-1][b-1]){
			aprobado = true;
			return;
		 }*/
	
	
}
class Reina extends Ficha{
    public void movimientoReina(){
        
    }
		
}

class Peon extends Reina{
    public void movimientoPeon(){
        
    }
	
}

class Caballo extends Ficha{
    public void movimientoCaballo(){
        
    }
	
}