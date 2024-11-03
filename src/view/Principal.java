package view;

import javax.swing.JOptionPane;

import controller.ListarArquivosController;

public class Principal {
	public static void main(String[] args) {
        
        ListarArquivosController arq= new ListarArquivosController();
        String caminho = JOptionPane.showInputDialog("Digite o caminho do diretório: ");
        System.out.println("Arquivos em ordem de tamanho (em MB):");
        System.out.println("-------------------------------------");
        arq.listarArquivosPorTamanho(caminho);

    }
}
