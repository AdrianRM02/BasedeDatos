package Triangulo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;
/*********************************    */
/*   GENERADOR DE TRIANGULOS   *****  */
/*   Entornos de Desarrollo 2021-2022 */
/*   Versi�n. 1.0                     */
/**************************************/
@SuppressWarnings("serial")
public class Triangulo extends JPanel {
	
	
	Polygon poly; //atributo para almacenar el pol�gono
	int xPoly[]; //vector de coordenadas X
    int yPoly[]; //vector de coordenadas Y
    Color Fondo; //Color de fondo del pol�gono
    Color Linea; //Color de l�nea
    static double ladoAB;
    static double ladoBC;
    static double ladoCAaproximado;
    
    static double perimetroTriangulo;
    double areaTriangulo;
    
    //Constructor por par�metro para construir un tri�ngulo dadas
    //las 3 coordenadas X y las 3 coordenadas Y
    public Triangulo(int x[], int y[]) {
		xPoly=new int[3];
		yPoly=new int[3];
		xPoly=x;
		yPoly=y;
		Fondo=Color.yellow;
		Linea=Color.black;//Establece colores por defecto
		poly = new Polygon(xPoly, yPoly, xPoly.length);
	}
	//Constructor por par�metro para construir un tri�ngulo dadas
    //las 3 coordenadas X y las 3 coordenadas Y y con colores espec�ficos
    public Triangulo(int x[], int y[],Color F, Color L) {
		xPoly=new int[3];
		yPoly=new int[3];
		xPoly=x;
		yPoly=y;
		Fondo=F;
		Linea=L;
		poly = new Polygon(xPoly, yPoly, xPoly.length);
	}
    
	//M�todo para pintar el componente
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Linea);
		g.drawPolygon(poly);
		g.setColor(Fondo);
		g.fillPolygon(xPoly,yPoly,3);
	}
	
	//M�todo al que hay que llamar para el que Tri�ngulo sea dibujado en un JFrame (Ventana)
	public void Dibujar() {
			JFrame miForm = new JFrame();
			miForm.setSize(1280,720);
			miForm.setResizable(false);
	        miForm.setVisible(true);
	        miForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            miForm.add(this);
	}
	
	//M�todo para calcular el �rea
	public double CalcularArea() {
		ladoAB = Math.sqrt(Math.pow((xPoly[0]-(xPoly[1])),2) + (Math.pow((yPoly[0]-(yPoly[1])),2))); //F�rmula para el lado AB, que ser� la base
		ladoBC = Math.sqrt(Math.pow((xPoly[1]-(xPoly[2])),2) + (Math.pow((yPoly[1]-(yPoly[1])),2))); //F�rmula para el lado BC, que ser� la altura
		areaTriangulo = (ladoAB)*(ladoBC)/2;
	    
	    //Aplicaremos la f�rmula para calcular el area del triangulo
	    System.out.println("El �rea de este triangulo cuya base tiene un valor de "+ladoAB+" y cuya altura tiene un valor de "+ladoBC+" ser� igual a "+areaTriangulo);
	    return areaTriangulo;
	}
	
	//M�todo para obtener el per�metro
	public double Perimetro(){
		ladoAB = Math.sqrt(Math.pow((xPoly[0]-(xPoly[1])),2) + (Math.pow((yPoly[0]-(yPoly[1])),2))); //F�rmula para el lado AB
		ladoBC = Math.sqrt(Math.pow((xPoly[1]-(xPoly[2])),2) + (Math.pow((yPoly[1]-(yPoly[1])),2))); //F�rmula para el lado BC
		ladoCAaproximado = Math.round(Math.sqrt(Math.pow((xPoly[0]-(xPoly[2])),2) + (Math.pow((yPoly[0]-(yPoly[1])),2)))); //F�rmula para el lado CA y aproximar, en caso de no querer aproximar eliminar el m�todo Math.round
		perimetroTriangulo = (ladoAB + ladoBC + ladoCAaproximado);
		 
		System.out.println("El per�metro de este tri�ngulo aproximado de ladoAB un valor de "+ladoAB+", de ladoBC "+ladoBC+" y de ladoCA "+ladoCAaproximado+" ser� igual a "+perimetroTriangulo);
		
		return perimetroTriangulo;
	}
	
	//M�todo main
	public static void main(String args[]) {
		Triangulo a=new Triangulo(new int[] {0,0,400}, new int[] {0,400,400});
		a.Dibujar();
		a.CalcularArea();
		a.Perimetro();
		}
}