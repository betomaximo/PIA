public abstract class PIAPadre{
	
	//variables que establecen el precio base de las diferentes marcas automotrices
	final protected int baseFord = 750000;
	final protected int baseToyota = 690000;
	final protected int baseKIA = 650000;
	//variable que establece el monto base a pagar por el seguro
	protected int seguro = 5000;
	
	//variables utilizadas para calcular el monto a pagar por el seguro dependiendo de la marca y edicion
	protected int seguroF;
	protected int seguroFP;
	protected int seguroFD;
	
	protected int seguroK;
	protected int seguroKP;
	protected int seguroKD;
	
	protected int seguroT;
	protected int seguroTP;
	protected int seguroTD;
	
	//variable utilizada para seleccionar modelo y marca del auto
	protected int modelo;
	
	protected int fordP;
	protected int fordD;
	protected int toyotaP;
	protected int toyotaD;
	protected int kiaP;
	protected int kiaD;
	
	//matriz que almacena demanera ordenada los precios de las diferentes ediciones y marcas de autos y camionetas
	int matriz[][]= new int[3][3];
	
	//Se establece el valor de cada una de las ediciones de las diferentes marcas de auto
	public void establecer(){
	
	
		//Ford.
		matriz[0][0]= baseFord;
		//Edicion Premium.
		matriz[0][1]= (baseFord + (baseFord * 25)/100);
		//Edicion Deluxe
		matriz[0][2]= (baseFord + (baseFord * 35)/100);
		
		//Toyota.
		matriz[1][0]= baseToyota;
		//Edicion Premium.
		matriz[1][1]= baseToyota + (baseToyota * 25)/100;
		//Edicion Deluxe.
		matriz[1][2]= baseToyota + (baseToyota * 35)/100;
		
		//KIA.
		matriz[2][0]= baseKIA;
		//Edicion Premium.
		matriz[2][1]= baseKIA + (baseKIA * 25)/100;
		//Edicion Deluxe
		matriz[2][2]= baseKIA + (baseKIA * 35)/100;
	}

	//Se establece la cantidad de dinero que va a aumentar el precio original del auto, dependiendo de la edicion deseada
	public void cargoEdicion(){
		
		fordP = (baseFord * 25)/100;
		fordD = (baseFord * 35)/100;
		
		toyotaP = (baseToyota * 25)/100;
		toyotaD = (baseToyota * 35)/100;
		
		kiaP = (baseKIA * 25)/100;																																																															//JIMT
		kiaD = (baseKIA * 35)/100;
		
	}
	
	//establece la edicion y marca de auto que desea (este metodo es abstracto por lo cual, solo actua en las clases hijas)
	public abstract void select();
	
	//establece elmonto a pagar por el seguro dependiendo de la marca y edicion del auto (este metodo es abstracto por lo cual, solo actua en las clases hijas)
	public abstract void establecerSeguro();	
	
	//Agrega unas lineas finales que incentiva al cliente a volver
	public void despedida(){
		
		System.out.println("\nMuchas gracias por su preferencia");
		System.out.println("\n\nEsperamos su proxima visita");
	}
	
	
}