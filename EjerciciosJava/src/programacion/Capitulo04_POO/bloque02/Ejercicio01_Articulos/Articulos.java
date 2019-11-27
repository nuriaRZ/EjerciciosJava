package programacion.Capitulo04_POO.bloque02.Ejercicio01_Articulos;

import javax.swing.JOptionPane;

public class Articulos {
	
		private String codigo;
		private String nombre;
		private float precio;
		
		/**
		 * 
		 */
		public Articulos () {
			
		}
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

		@Override
		public String toString() {
			return "Articulos [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
		}
		/**
		 * 
		 * @return
		 */
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
