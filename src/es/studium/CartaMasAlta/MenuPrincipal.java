package es.studium.CartaMasAlta;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class MenuPrincipal extends Frame
{
	private static final long serialVersionUID = 1L;

	// Objetos que contienen imágenes
	Image nuevaPartida, ayuda, ranking, salir;
	// Objeto para manipulación de imágenes
	Toolkit herramienta;

	public MenuPrincipal()
	{
		setLayout(null);
		setTitle("Carta Más Alta");
		setSize(600,400);
		setBackground(Color.black);
		// Activamos la herramienta
		herramienta = getToolkit();
		// Cargar la imagen
		nuevaPartida = herramienta.getImage("newGame.png");
		setResizable(false);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		// Dibujar la imagen
		g.drawImage(nuevaPartida,220,25,this);
	}
}