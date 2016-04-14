package facturaDescuento;

import java.util.Scanner;

public class FacturaDescuento 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double precio;
		double total = 0;
		System.out.print("Introduce la cantidad del producto (0 para finalizar): ");
		double cantidad = sc.nextDouble();
		while(cantidad != 0)
		{
			System.out.print("Introduce el precio del producto: ");
			precio = sc.nextDouble();
			total = total + (cantidad * precio);
			System.out.print("Introduce la cantidad del producto (0 para finalizar: ");
			cantidad = sc.nextDouble();
		}
		sc.close();
		if(total > 1000)
		{
			System.out.println("El importe total, con el 5% de descuento, es de " 
			+ (total - ((total / 100) * 5)) + " €.");
		}
		else
		{
			System.out.println("El importe total es de " + total + " €.");
		}
	}
}
