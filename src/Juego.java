
public class Juego {

	public static void main(String[] args) {
		//Creamos el Almacen
		AlmacenComida alamacen=new AlmacenComida();
		Thread aComida=new Thread(alamacen);
		aComida.start();
		//Creamos nuesstra primera ciudad
		Ciudad c1=new Ciudad("Madrid", alamacen);
		Ciudad c2=new Ciudad("Barcelona", alamacen);
		//AQUI FALTA C�DIGO //Se arranca la ciudad c1
		c1.start();//<-c�digo que faltaba
		//AQUI FALTA C�DIGO //Se arranca la ciudad c2
		c2.start();//<-c�digo que faltaba
	}

}
