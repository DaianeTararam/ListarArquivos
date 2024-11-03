package controller;

import java.io.File;

public class ListarArquivosController {
	public void listarArquivosPorTamanho(String caminho) {
        File diretorio = new File(caminho);

        if (!diretorio.exists() || !diretorio.isDirectory()) {
            System.out.println("Caminho inválido ou não é um diretório.");
            return;
        }

        File[] arquivos = diretorio.listFiles();

        if (arquivos == null || arquivos.length == 0) {
            System.out.println("Não há arquivos no diretório.");
            return;
        }

        
        for (int i = 0; i < arquivos.length - 1; i++) {
            for (int j = 0; j < arquivos.length - 1 - i; j++) {
                if (arquivos[j].length() > arquivos[j + 1].length()) {
                    File aux = arquivos[j];
                    arquivos[j] = arquivos[j + 1];
                    arquivos[j + 1] = aux;
                }
            }
        }
        
        for (File arquivo : arquivos) {
            if (arquivo.isFile()) {
                double tamanhoMB = arquivo.length() / (1024.0 * 1024.0);
                System.out.printf("Nome: %s, Tamanho: %.2f MB%n", arquivo.getName(), tamanhoMB);
            }
        }
    }
}
