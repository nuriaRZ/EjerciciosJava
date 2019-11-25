package programacion.Capitulo04_POO.bloque02.Ejercicio01_Articulos;

import javax.swing.JOptionPane;

public class Articulos {
	
		protected String codigo;
		protected String nombre;
		protected float precio;
		/**
		 * @param codigo
		 * @param nombre
		 * @param precio
		 */
		public Articulos(String codigo, String nombre, float precio) {
			super();
			this.codigo = codigo;
			this.nombre = nombre;
			this.precio = precio;
		}
		/**
		 * 
		 * @return
		 */
		
		public void imprimir() {
			System.out.println("codigo: "+ codigo + " nombre: "+ nombre + " precio: "+ precio);
		}


		public String getCodigo() {
			return codigo;
		}
		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public float getPrecio() {
			return precio;
		}
		public void setPrecio(float precio) {
			this.precio = precio;
		}
		

	

}
