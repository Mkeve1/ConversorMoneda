import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Menu = (String) JOptionPane.showInputDialog(null,"Seleccione Un Color",
				   "Menu", JOptionPane.QUESTION_MESSAGE, null,
				  new Object[] {"Conversor Moneda", "Conversor Temperatura" },"Seleccione");
	
		switch (Menu) {
		case "Conversor Moneda": {
			
			String pares=(String) JOptionPane.showInputDialog(null,"Seleccione Un Color",
					   "Pares", JOptionPane.QUESTION_MESSAGE, null,
						  new Object[] {"VES  ->  $", "COP  ->  $", "(€)  ->  $", "$  ->  VES", "$  ->  COP", "$  ->  (€)" },"Seleccione");
			
			
			if (pares == "VES  ->  $") {
				int i = 0;
			do {
				String Monto = JOptionPane.showInputDialog(null, "Ingrese Monto a Convertir");
				float Cantidad = Integer.parseInt(Monto);
				double tasa = 0.0609145;
				double conversion = Cantidad * tasa;
				JOptionPane.showMessageDialog(null,"Su saldo en $ Americanos es "  +  conversion);
				i=JOptionPane.showConfirmDialog(null, "Desea Convertir de Nuevo");
			} while (i==0); 		
			
				}
								
		   if (pares == "COP  ->  $" ) {
			    int i =0;
			   	do {
			   		String Monto = JOptionPane.showInputDialog(null, "Ingrese Monto a Convertir");
					float Cantidad = Integer.parseInt(Monto);
					double tasa = 0.00021;
					double conversion = Cantidad * tasa;
					JOptionPane.showMessageDialog(null,"Su saldo en $ Americanos es "  +  conversion);
					i=JOptionPane.showConfirmDialog(null, "Desea Convertir de Nuevo");
					
				} while (i==0);
			   
			   
		   }
		   
		   if(pares =="(€)  ->  $") {
			   int i =0;
			   do {
				   String Monto = JOptionPane.showInputDialog(null, "Ingrese Monto a Convertir");
					float Cantidad = Integer.parseInt(Monto);
					double tasa =1.06;
					double conversion = Cantidad * tasa;
					JOptionPane.showMessageDialog(null,"Su saldo en $ Americanos es "  +  conversion);
					i=JOptionPane.showConfirmDialog(null, "Desea Convertir de Nuevo");
				
			} while (i==0);
			   
		   }
		   
		   if(pares =="$  ->  VES" ) {
			   int i=0;
			   do {
				   String Monto = JOptionPane.showInputDialog(null, "Ingrese Monto a Convertir");
					float Cantidad = Integer.parseInt(Monto);
					double tasa = 0.0609145;
					double conversion = Cantidad / tasa;
					JOptionPane.showMessageDialog(null,"Su saldo  es "  +  conversion);
					i=JOptionPane.showConfirmDialog(null, "Desea Convertir de Nuevo");
			} while (i==0);
			   
			   
		   }
		   
		   if(pares=="$  ->  COP") {
			   int i=0;
			   do {
				   String Monto = JOptionPane.showInputDialog(null, "Ingrese Monto a Convertir");
					float Cantidad = Integer.parseInt(Monto);
					double tasa = 0.00021;
					double conversion = Cantidad / tasa;
					JOptionPane.showMessageDialog(null,"Su saldo  es "  +  conversion);
				
			} while (i==0);
			   
			   
		   }
		   
		   if(pares =="$  ->  (€)" ) {
			   int i=0;
			   do {
				   String Monto = JOptionPane.showInputDialog(null, "Ingrese Monto a Convertir");
					float Cantidad = Integer.parseInt(Monto);
					double tasa =1.06;
					double conversion = Cantidad / tasa;
					JOptionPane.showMessageDialog(null,"Su saldo  es "  +  conversion);  
				
			} while (i==0);
			    
		   }
		   	break;
		}
		
		case "Conversor Temperatura":{
			
			JOptionPane.showMessageDialog(null, "En Mantenimiento");
		}
		
		}
		
		
		

	}

}
