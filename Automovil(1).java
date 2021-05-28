import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
class Automovil extends PIAPadre{
	
	
	private String recibo = null;
	Scanner sc = new Scanner(System.in);
	
	
	//metodo constructor
	public Automovil(){
		
		super();
	
	}
	
	//Seleciona el auto que desea comrar																																																																																																																																																	//JIMT
	public void select(){
	
		System.out.println("Seleccione la marca y modelo de su preferencia: \n\nFord. \n1 Edicion Deluxe. \n2 Edicion Premium. \n3 Edicion Clasic \n ");
		System.out.println("Toyota. \n4 Edicion Deluxe. \n5 Edicion Premium. \n6 Edicion Clasic \n ");
		System.out.println("KIA. \n7 Edicion Deluxe. \n8 Edicion Premium. \n9 Edicion Clasic ");
		
		modelo = sc.nextInt();
		
	}
	
	//establece cuanto se tendra que pagar por el seguro del automovil dependiendo de la edicion y la marca
	public void establecerSeguro()	{
		//Ford.
		seguroF = matriz[0][0] + seguro;
		//Ford Premium.
		seguroFP = matriz[0][1] + seguro;
		//Ford Deluxe.
		seguroFD = matriz[0][2] + seguro;
		
		//Toyota.
		seguroT = matriz[1][0] + seguro;
		//Toyota Premium.
		seguroTP = matriz[1][1] + seguro;
		//Toyota Deluxe.
		seguroTD = matriz[1][2] + seguro;
		
		//KIA.
		seguroK = matriz[2][0] + seguro;
		//KIA Premium.
		seguroKP = matriz[2][1] + seguro;
		//KIA Deluxe.
		seguroKD = matriz[2][2] + seguro;
	
	}
	
	
	
	//metodo para concatenar e imprimir el ticket
	public String toString (){
		
		
		if(modelo == 1){
			
			recibo ="Ticket : \n \n" + "A continuacion, se le desglosaran los diferentes cargos a cubrir: \n\n"  +"\n\nPrecio base del auto:   " + baseFord +"\nCargo por edicion:  "+ fordD +  "\nPrecio + Cargo por edicion:   " + matriz[0][2] + "\nCargo por seguro: " + seguro + "\nPrecio + cargo por seguro:  " + seguroFD + "\nTotal a pagar: " + seguroFD;
		
		}else if(modelo == 2){
			recibo = "Ticket : \n \n" + "A continuacion, se le desglosaran los diferentes cargos a cubrir: \n\n"+"\n\nPrecio base del auto:   " + baseFord +"\nCargo por edicion:  "+ fordP +  "\nPrecio + Cargo por edicion:   " + matriz[0][1] + "\nCargo por seguro: " + seguro + "\nPrecio + cargo por seguro:  " + seguroFP + "\nTotal a pagar: " + seguroFP;
		
		}else if(modelo == 3){
			recibo = "Ticket : \n \n" + "A continuacion, se le desglosaran los diferentes cargos a cubrir: \n\n"+"\n\nPrecio base del auto:   " + baseFord +"\nCargo por edicion:  "+ 0 +  "\nPrecio + Cargo por edicion:   " + matriz[0][0] + "\nCargo por seguro: " + seguro + "\nPrecio + cargo por seguro:  " + seguroF + "\nTotal a pagar: " + seguroF;
		}else if(modelo == 4){
			recibo = "Ticket : \n \n" + "A continuacion, se le desglosaran los diferentes cargos a cubrir: \n\n"+"\n\nPrecio base del auto:   " + baseToyota +"\nCargo por edicion:  "+ toyotaD +  "\nPrecio + Cargo por edicion:   " + matriz[1][2] + "\nCargo por seguro: " + seguro + "\nPrecio + cargo por seguro:  " + seguroTD + "\nTotal a pagar: " + seguroTD;
			
		}else if(modelo == 5){
			recibo = "Ticket : \n \n" + "A continuacion, se le desglosaran los diferentes cargos a cubrir: \n\n"+"\n\nPrecio base del auto:   " + baseToyota +"\nCargo por edicion:  "+ toyotaP +  "\nPrecio + Cargo por edicion:   " + matriz[1][1] + "\nCargo por seguro: " + seguro + "\nPrecio + cargo por seguro:  " + seguroTP + "\nTotal a pagar: " + seguroTP;
			
		}else if(modelo == 6){
			recibo = "Ticket : \n \n" + "A continuacion, se le desglosaran los diferentes cargos a cubrir: \n\n"+"\n\nPrecio base del auto:   " + baseToyota +"\nCargo por edicion:  "+ 0 +  "\nPrecio + Cargo por edicion:   " + matriz[1][0] + "\nCargo por seguro: " + seguro + "\nPrecio + cargo por seguro:  " + seguroT + "\nTotal a pagar: " + seguroT;
		}else if(modelo == 7){
			recibo = "Ticket : \n \n" + "A continuacion, se le desglosaran los diferentes cargos a cubrir: \n\n"+"\n\nPrecio base del auto:   " + baseKIA +"\nCargo por edicion:  "+ kiaD +  "\nPrecio + Cargo por edicion:   " + matriz[2][2] + "\nCargo por seguro: " + seguro + "\nPrecio + cargo por seguro:  " + seguroKD + "\nTotal a pagar: " + seguroKD;
		}else if(modelo == 8){
			recibo = "Ticket : \n \n" + "A continuacion, se le desglosaran los diferentes cargos a cubrir: \n\n"+"\n\nPrecio base del auto:   " + baseKIA +"\nCargo por edicion:  "+ kiaP+  "\nPrecio + Cargo por edicion:   " + matriz[2][1] + "\nCargo por seguro: " + seguro + "\nPrecio + cargo por seguro:  " + seguroKP + "\nTotal a pagar: " + seguroKP;
		}else if(modelo == 9){
			recibo = "Ticket : \n \n" + "A continuacion, se le desglosaran los diferentes cargos a cubrir: \n\n"+"\n\nPrecio base del auto:   " + baseKIA +"\nCargo por edicion:  "+ 0 +  "\nPrecio + Cargo por edicion:   " + matriz[2][0] + "\nCargo por seguro: " + seguro + "\nPrecio + cargo por seguro:  " + seguroK + "\nTotal a pagar: " + seguroK;
		}
		
		return recibo;
	
	}
	public void crearF(){
		
		try{
		
			File archivo=new File("recibo.txt");
			FileWriter escribir=new FileWriter(archivo,true);
			escribir.write(recibo);
			escribir.close();
		}catch(Exception e){
			System.out.println("Error al escribir");
		
		}
	}
	
	
	

}