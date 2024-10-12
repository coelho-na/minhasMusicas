package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void favoritar(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado um sucesso com classificação " + audio.getClassificacao());
        } else{
            System.out.println(audio.getTitulo() + " é um(a) excelente opção para escutar depois.");
        }
    }
}
