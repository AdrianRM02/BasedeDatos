package Departamento;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Principal {
	
	static Departamento departamento[] = new Departamento[5];

	public static void main(String[] args) throws NumberFormatException,IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		departamento[0]=new Departamento(11,"Economía","Madrid");
		departamento[1]=new Departamento(18,"Comunicaciones","Sevilla");
		departamento[2]=new Departamento(15,"Turistico","Valnecia");
		departamento[3]=new Departamento(21,"Salud","Barcelona");
		departamento[4]=new Departamento(23,"Juridico","Badajoz");
		
		boolean salir = false;
		int opcion;
		
		while(!salir) {
			System.out.println("Menú por consola");
			System.out.println("1.Mostrar departamento");
			System.out.println("2.Buscar departamento");
			System.out.println("3.Insertar departamento");
			System.out.println("4.Borrar departamento");
			System.out.println("5.Modificar departamento");
			System.out.println("6.Salir");
			
			try {
				System.out.println("Escribe una opcion");
				opcion = Integer.parseInt(br.readLine());
				switch (opcion) {
				case 1:
					Mostrar();
					break;
				case 2:
					Buscar();
					break;
				case 3:
					Insertar();
					break;
				case 4:
					Borrar();
					break;
				case 5:
					Modificar();
					break;
				case 6:
					salir=true;
					break;
					
					default:
						System.out.println("Elige una opcion entre 1 y 5");
				}
		} catch(InputMismatchException e) {
			System.out.println("Introduce un número valido y que este entre 1 y 5");
		}
		catch(NumberFormatException e) {
			System.out.println("Introduce un número valido y que este entre 1 y 5");
		}
			
		}
		System.out.println("Final del programa");
	}
	
	private static void Modificar() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean salir = false;
		int opcion;
		System.out.println("Introduce el numero de departamento");
			int dept_noA=Integer.parseInt(br.readLine());
			for (int i = 0;i<departamento.length;i++) {
				if (departamento[i].getDept_no()==dept_noA) {
					
					while (!salir) {
						System.out.println("¿Que deseas modificar?");
						System.out.println("1.nombredeapartamento");
						System.out.println("2.localización");
						System.out.println("3.Salir");
						
						
						try {
							System.out.println("Escribe una de las opciones");
							opcion = Integer.parseInt(br.readLine());
							
							switch (opcion) {
							case 1:
								System.out.println("Introduce el nuevo nombre");
								String nombredeapartamento = br.readLine();
								departamento[i].setDnombre(nombredeapartamento);
								break;
							case 2:
								System.out.println("Introduzca la nueva localización");
								String localizacón = br.readLine();
								departamento[i].setLocalización(localizacón);
								break;
							case 3:
								salir = true;
								break;
								
								default:
									System.out.println("Debes elegir una opcion entre 1 y 5");
							}
						}catch(InputMismatchException e) {
							System.out.println("Debes introducir un número válidoy que este entre 1 y 5");
						}
						catch(NumberFormatException e) {
							System.out.println("Debes introducir un número válidoy que este entre 1 y 5");
						}
					}
				}
			}
			System.out.println("Final del programa");
	}

	private static void Borrar() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce el número de departamento");
		int dept_noA = Integer.parseInt(br.readLine());
		boolean bus = false;
		for(int i=0;i<departamento.length;i++) {
			if (departamento[i].getDept_no()==dept_noA) {
				bus = true;
				departamento[i]=null;
			}
		}
		if (bus==true) {
			System.out.println("El departamento ha sido encontrado");
		}
		else {
			System.out.println("El departamento no ha sido encontrado");
		}
	}

	private static void Insertar() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int dept_no;
		String dnombre;
		String localización;
		
		Departamento n;
		boolean hueco = false;
		int pos = -1;
		
		for (int j=0;j<departamento.length;j++) {
			if (departamento[j]==null) {
				hueco = true;
				pos = j;
			}
		}
		if (hueco==true) {
			System.out.println("Introduce el número de departamento");
			dept_no = Integer.parseInt(br.readLine());
			System.out.println("Introduce el nombre de departamento");
			dnombre = br.readLine();
			System.out.println("Introduce la localización del departamento");
			localización = br.readLine();
			n = new Departamento(dept_no,dnombre,localización);
			System.out.println(n.toString());
			departamento[pos] = n;
		}
		else {
			System.out.println("No existe hueco");
		}
	}

	private static void Buscar() {
		int pos = 0;
			boolean bus = false;
				for (int i = 0;i<departamento.length;i++) {
					if (pos<0);
					
				}
	}

	private static void Mostrar() {
		for (int i = 0;i<departamento.length;i++) {
			if (departamento[i]!=null){
				System.out.println(departamento[i].toString());
				
			}
		}
		
	}
}