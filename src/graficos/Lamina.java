package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Lamina extends JPanel {

	public Lamina() {

		setLayout(new BorderLayout());

		EventoRadioButton e = new EventoRadioButton();

		EventoBoton a = new EventoBoton();
//display -------------------------------------------------
		display = new JButton("0");

		display.setEnabled(false);

		add(display, BorderLayout.NORTH);
// lamina 2 boton convertir ------------------------------------------------		
		JPanel lamina2 = new JPanel();

		//JButton cancelar = new JButton("LIMPIAR");

		convertir = new JButton("CONVERTIR");

		convertir.addActionListener(a);

		//lamina2.add(cancelar);

		lamina2.add(convertir);

		add(lamina2, BorderLayout.SOUTH);
// lamina 3: radio buttons---------------------------
		JPanel lamina3 = new JPanel();

		unidad = new JLabel("segundos:");

		campoTexto = new JTextField(20);

		lamina3.add(unidad);

		lamina3.add(campoTexto);

		ButtonGroup migrupo = new ButtonGroup();

		horasMinutos = new JRadioButton("Horas a minutos");

		horasMinutos.addActionListener(e);

		segundosMinutos = new JRadioButton("Segundos a minutos");

		segundosMinutos.addActionListener(e);

		minutosHoras = new JRadioButton("Minutos a Horas");

		minutosHoras.addActionListener(e);

		segundosHoras = new JRadioButton("Segundos a horas");

		segundosHoras.addActionListener(e);

		minutosSegundos = new JRadioButton("Minutos a segundos");

		minutosSegundos.addActionListener(e);

		horasSegundos = new JRadioButton("Horas a segundos");

		horasSegundos.addActionListener(e);

		migrupo.add(horasMinutos);

		migrupo.add(segundosMinutos);

		migrupo.add(minutosHoras);

		migrupo.add(segundosHoras);

		migrupo.add(minutosSegundos);

		migrupo.add(horasSegundos);

		lamina3.add(segundosMinutos);

		lamina3.add(segundosHoras);

		lamina3.add(minutosHoras);

		lamina3.add(minutosSegundos);

		lamina3.add(horasMinutos);

		lamina3.add(horasSegundos);

		add(lamina3, BorderLayout.CENTER);
		
        segundosMinutos.setSelected(true);
	}

	private class EventoRadioButton implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == segundosMinutos || e.getSource() == segundosHoras) {

				unidad.setText("segundos:");

			}

			else if (e.getSource() == minutosHoras || e.getSource() == minutosSegundos) {

				unidad.setText("minutos:");

			}

			else if (e.getSource() == horasMinutos || e.getSource() == horasSegundos) {

				unidad.setText("horas:");

			}

		}

	}

	private class EventoBoton implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (segundosMinutos.isSelected()) {

				entrada = Integer.parseInt(campoTexto.getText()) * 1 / 60;

				if (entrada >= 2) {

					String texto = Integer.toString(entrada);

					display.setText(texto + " minutos");
				}

				else {

					String texto = Integer.toString(entrada);

					display.setText(texto + " minuto");

				}

			}

			else if (minutosHoras.isSelected()) {

				entrada = Integer.parseInt(campoTexto.getText()) * 1 / 60;

				if (entrada >= 2) {

					String texto = Integer.toString(entrada);

					display.setText(texto + " horas");
				}

				else {

					String texto = Integer.toString(entrada);

					display.setText(texto + " hora");

				}
			}

			else if (horasMinutos.isSelected()) {

				entrada = Integer.parseInt(campoTexto.getText()) * 60 / 1;

				if (entrada >= 2) {

					String texto = Integer.toString(entrada);

					display.setText(texto + " minutos");
				}

				else {

					String texto = Integer.toString(entrada);

					display.setText(texto + " minuto");

				}

			}

			else if (horasSegundos.isSelected()) {

				entrada = Integer.parseInt(campoTexto.getText()) * 3600 / 1;

				if (entrada >= 2) {

					String texto = Integer.toString(entrada);

					display.setText(texto + " segundos");
				}

				else {

					String texto = Integer.toString(entrada);

					display.setText(texto + " segundo");

				}

			}

			else if (minutosSegundos.isSelected()) {

				entrada = Integer.parseInt(campoTexto.getText()) * 60 / 1;

				if (entrada >= 2) {

					String texto = Integer.toString(entrada);

					display.setText(texto + " segundos");
				}

				else {

					String texto = Integer.toString(entrada);

					display.setText(texto + " segundo");

				}

			}

			else if (segundosHoras.isSelected()) {

				entrada = Integer.parseInt(campoTexto.getText()) / 3600 * 1;

				if (entrada >= 2) {

					String texto = Integer.toString(entrada);

					display.setText(texto + " horas");
				}

				else {

					String texto = Integer.toString(entrada);

					display.setText(texto + " hora");

				}

			}

		}

	}

	private JRadioButton horasMinutos;

	private JRadioButton segundosMinutos;

	private JRadioButton minutosHoras;

	private JRadioButton segundosHoras;

	private JRadioButton minutosSegundos;

	private JRadioButton horasSegundos;

	private JLabel unidad;

	private JButton convertir;

	private JTextField campoTexto;

	private JButton display;

	private int entrada;
}
