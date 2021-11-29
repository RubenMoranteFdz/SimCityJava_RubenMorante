
public class Ciudad extends Thread{
	//Caracter�sticas
	String nombre="CIUDAD";
	int poblaci�nInicial=100;
	int poblacionActual=poblaci�nInicial;
	AlmacenComida aComida;

	public Ciudad(String nombre, AlmacenComida aComida) {
		this.nombre=nombre;
		this.aComida=aComida;
	}
	
	//AQU� FALTA C�DIGO {
	public void run() { //<-c�digo que faltaba
		try {
			while(poblacionActual>0) {
				//De forma aleatoria nacen y mueren habitantes. Adem�s lo hacen de una forma en tiempo tambi�n aleatoria
				sleep((int) Math.floor(Math.random()*100)); //Esperamos un tiempo aleatorio
				int nacimientos=(int) Math.floor(Math.random()*5); //Nacen un numero aleatorio entre 0 y 5
				System.out.println("["+this.nombre+"] Ha tenido "+nacimientos+" nacimientos");
				poblacionActual=poblacionActual+nacimientos;
				//Se solicita la comida para la poblaci�n actual
				boolean hayComida=this.aComida.solicitarComida(poblacionActual,this.nombre);
				if (!hayComida) {
					//AQU� FALTA C�DIGO //Esperamos un tiempo aleatorio 
					sleep((int) Math.floor(Math.random()*100));//<-c�digo que faltaba
					//AQU� FALTA C�DIGO //Mueren un numero aleatorio entre 0 y 10
					int muertes=(int) Math.floor(Math.random()*10); //<-c�digo que faltaba
					System.out.println("["+this.nombre+"] Ha tenido "+muertes+" muertes");
					//AQU� FALTA C�DIGO //Restamos las muertes
					poblacionActual=poblacionActual-muertes;//<-c�digo que faltaba
				}
			}
			System.out.println("["+this.nombre+"] HA DESAPARECIDO");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
