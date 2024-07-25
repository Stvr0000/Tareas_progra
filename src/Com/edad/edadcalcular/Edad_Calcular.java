package Com.edad.edadcalcular;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class Edad_Calcular {
	
	
	

	 public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.println("Ingrese su fecha de nacimiento (YYYY-MM-DD): ");
	        
	        
	        String fechaNacimientoStr = scanner.nextLine();

	       
	        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr);

	        
	        int edad = calcularEdad(fechaNacimiento);

	        
	        System.out.println("Su edad es: " + edad + " años.");
	    }

	   
	    private static int calcularEdad(LocalDate fechaNacimiento) {
	        
	        LocalDate hoy = LocalDate.now();

	       
	        if (fechaNacimiento != null) {
	           
	            return Period.between(fechaNacimiento, hoy).getYears();
	        }

	       
	        return 0;
	    }
	}