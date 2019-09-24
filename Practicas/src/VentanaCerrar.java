
import javax.swing.*;

public class VentanaCerrar extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public VentanaCerrar(){
		
		this.setTitle("Prueba");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		new VentanaCerrar();
	}

}
