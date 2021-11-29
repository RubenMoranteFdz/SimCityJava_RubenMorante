
public class Ciudad extends Thread{
	//Características
	String nombre="CIUDAD";
	int poblaciónInicial=100;
	int poblacionActual=poblaciónInicial;
	AlmacenComida aComida;

	public Ciudad(String nombre, AlmacenComida aComida) {
		this.nombre=nombre;
		this.aComida=aComida;
	}
	
	//AQUÍ FALTA CÓDIGO {
	public void run() { //<-código que faltaba
		try {
			while(poblacionActual>0) {
				//De forma aleatoria nacen y mueren habitantes. Además lo hacen de una forma en tiempo también aleatoria
				sleep((int) Math.floor(Math.random()*100)); //Esperamos un tiempo aleatorio
				int nacimientos=(int) Math.floor(Math.random()*5); //Nacen un numero aleatorio entre 0 y 5
				System.out.println("["+this.nombre+"] Ha tenido "+nacimientos+" nacimientos");
				poblacionActual=poblacionActual+nacimientos;
				//Se solicita la comida para la población actual
				boolean hayComida=this.aComida.solicitarComida(poblacionActual,this.nombre);
				if (!hayComida) {
					//AQUÍ FALTA CÓDIGO //Esperamos un tiempo aleatorio 
					sleep((int) Math.floor(Math.random()*100));//<-código que faltaba
					//AQUÍ FALTA CÓDIGO //Mueren un numero aleatorio entre 0 y 10
					int muertes=(int) Math.floor(Math.random()*10); //<-código que faltaba
					System.out.println("["+this.nombre+"] Ha tenido "+muertes+" muertes");
					//AQUÍ FALTA CÓDIGO //Restamos las muertes
					poblacionActual=poblacionActual-muertes;//<-código que faltaba
				}
			}
			System.out.println("["+this.nombre+"] HA DESAPARECIDO");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
