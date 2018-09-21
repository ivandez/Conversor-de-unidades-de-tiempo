package graficos;

import javax.swing.*;
import java.awt.*;

public class Marco extends JFrame {

	public Marco() {

		setTitle("Conversor :)");

		setBounds(pantallaAncho / 4, pantallaAlto / 4, pantallaAncho / 2, pantallaAlto / 2);

		Lamina lamina = new Lamina();

		add(lamina);

		setResizable(false);
	}

	Toolkit t = Toolkit.getDefaultToolkit();

	int pantallaAncho = Toolkit.getDefaultToolkit().getScreenSize().width;

	int pantallaAlto = Toolkit.getDefaultToolkit().getScreenSize().height;

}
