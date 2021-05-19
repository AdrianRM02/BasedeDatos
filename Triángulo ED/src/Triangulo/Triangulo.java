package Triangulo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;
/*********************************    */
/*   GENERADOR DE TRIANGULOS   *****  */
/*   Entornos de Desarrollo 2021-2022 */
/*   Versión. 1.0                     */
/**************************************/
@SuppressWarnings("serial")
public class Triangulo extends JPanel {
	Polygon poly; //atributo para almacenar el polígono
	int xPoly[]; //vector de coordenadas X
    int yPoly[]; //vector de coordenadas Y
    Color Fondo; //Color de fondo del polígono
    Color Linea; //Color de línea
    
    //Constructor por parámetro para construir un triángulo dadas
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
	//Constructor por parámetro para construir un triángulo dadas
    //las 3 coordenadas X y las 3 coordenadas Y y con colores específicos
    public Triangulo(int x[], int y[],Color F, Color L) {
		xPoly=new int[3];
		yPoly=new int[3];
		xPoly=x;
		yPoly=y;
		Fondo=F;
		Linea=L;
		poly = new Polygon(xPoly, yPoly, xPoly.length);
	}
	//Método para pintar el componente
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Linea);
		g.drawPolygon(poly);
		g.setColor(Fondo);
		g.fillPolygon(xPoly,yPoly,3);
	}
	//Método al que hay que llamar para el que Triángulo sea dibujado en un JFrame (Ventana)
	public void Dibujar() {
			JFrame miForm = new JFrame();
			miForm.setSize(1280,720);
			miForm.setResizable(false);
	        miForm.setVisible(true);
	        miForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            miForm.add(this);
	        
	}
	//método para calcular el área
	public double CalculaArea() {
	    double areatriangulo = 0;
		double base = 400.00; //Introduciremos el valor de la base calculada anteriormente
	    double altura = 400.00; //Introduciremos el valor de la altura calculada anteriormente
	    
	    areatriangulo = (base*altura)/2; //Aplicaremos la fórmula para calcular el area del triangulo
	    System.out.println("El área de este triangulo cuya base tiene un valor de "+base+" y cuya altura tiene un valor de "+altura+" será igual a "+areatriangulo);
	    return(0);
	    
	}
	//metodo para obtener el perímetro
	public double Perimetro(){
	   double perimetrotriangulo = 0;
	   double ladoAB = 400;
	   double ladoBC = 400;
	   double ladoCA = 565.69;
	   
	   perimetrotriangulo = (ladoAB + ladoBC + ladoCA);
	   System.out.println("El perímetro de este triángulo que tiene como ladoAB un valor de "+ladoAB+" ,como ladoBC un valor de "+ladoBC+" y como ladoCA un valor de "+ladoCA+" será igual a "+perimetrotriangulo);
		return(0);
	}
	//Método main
	public static void main(String args[]) {
		Triangulo a=new Triangulo(new int[] {0,0,400}, new int[] {0,400,400});
		a.Dibujar();
		a.CalculaArea();
		a.Perimetro();
		
		}
}