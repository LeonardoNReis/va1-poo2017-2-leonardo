package br.unincor.view;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

/**
 * Nesta classe você deve tratar exceção
 * em todos os métodos que podem vir a lançar
 * exceções por entrada incorreta do usuário. 
 *
 */
public class Usuario {

	public void exibeMsg(String texto) {
		JOptionPane.showMessageDialog(null, texto, "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
	}

	public void exibeMsgErro(String texto) {
		JOptionPane.showMessageDialog(null, texto, "ERRO", JOptionPane.ERROR_MESSAGE);
	}

	public void exibeMsgDebug(String texto) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(sdf.format(new Date()) + " - [DEBUG] " + texto);
	}

	public Integer recebeInteiro(String texto) {
		return Integer.parseInt(JOptionPane.showInputDialog(texto));
	}

	public Long recebeLong(String texto) {
		return Long.parseLong(JOptionPane.showInputDialog(texto));
	}

	public Double recebeDouble(String texto) {
		return Double.parseDouble(JOptionPane.showInputDialog(texto));
	}

	public Float recebeFloat(String texto) {
		return Float.parseFloat(JOptionPane.showInputDialog(texto));
	}

	public Boolean recebeBoolean(String texto) {
		return Boolean.parseBoolean(JOptionPane.showInputDialog(texto));
	}

	public String recebeTexto(String texto) {
		return JOptionPane.showInputDialog(texto);
	}
}
