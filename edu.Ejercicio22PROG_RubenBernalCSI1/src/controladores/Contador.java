/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

/**
 * Clase que contendrá un método para contar objetos o eventos
 * @author rbr - 291024
 *
 */
public class Contador {

	//Atributos
	private int valor = 0;
	
	/**
	 * Método público llamado incrementar que aumenta el valor de valor en uno
	 * rbr - 291024
	 */
	public void incrementar() {
		
		valor++;
		
	}
	
	/**
	 * Método público llamado obtenerValor que devuelve el valor actual del contador
	 * rbr - 291024
	 * @return valor
	 */
	public int obtenerValor() {
		
		return valor;
	}
	
	/**
	 * Método privado llamado reiniciar que pone el valor de valor en cero
	 * rbr - 291024
	 */
	private void reiniciar() {
		valor = 0;
	}
	
	/**
	 * El método "incrementar" se podrá llamar desde cualquier parte del proyecto incluido desde otro paquete
	 * instanciando la clase. Pasa lo mismo con el método "obtenerValor". Sin embargo, el atributo "valor" y el método
	 * "reiniciar" solo serán accesibles desde la propia clase y no se podrá acceder desde otra clase de ese mismo
	 * paquete ni siquiera desde una clase que este en otro paquete distinto
	 * 
	 * rbr - 291024
	 */
}
