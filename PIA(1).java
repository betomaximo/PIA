import java.util.Scanner;

class PIA {
	public static void main (String []args){
		
		int opcion;
		int rec = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("BIENVENIDO");
		System.out.println("");
		System.out.println("Seleccione el medio de transporte que desea adquirir (ingrese el numero correspondiente): \n1 Automovil.  \n2 Camioneta. ");																																																																																																																													//JIMT
		opcion = sc.nextInt();
		
		while(rec != 2){
			switch(opcion){
				
				case 1 :
				
					Automovil auto = new Automovil();
					
					auto.establecer();
					auto.cargoEdicion();
					auto.establecerSeguro();
					auto.select();
					System.out.println(auto.toString());
					auto.despedida();
					auto.crearF();
					
					System.out.println("\nSeleccione lo que desee hacer a continuacion : \n1Finalizar la compra y volver al menu de inicio.  \n2Finalizar la compra y Salir.");
					rec = sc.nextInt();
					
				break;
				
				case 2 :
				
					Camioneta cam = new Camioneta();
					cam.establecer();
					cam.cargoEdicion();
					cam.actualizar();
					cam.establecerSeguro();
					cam.select();
					System.out.println(cam.toString());
					cam.despedida();
					cam.crearF();
					
					System.out.println("\nSeleccione lo que desee hacer a continuacion : \n1 Finalizar la compra y volver al menu de inicio.  \n2 Finalizar la compra y Salir.");
					rec = sc.nextInt();
					
				break;
				
				
				
			}
		}
	}
}