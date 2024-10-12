package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("4 ever 4 me");
        minhaMusica.setCantor("Demi Lovato");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 500; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setApresentador("Demi Lovato");
        meuPodcast.setTitulo("Cooking with Demi Lovato");
        meuPodcast.setConvidado("Selena Gomes");
        meuPodcast.setDuracaoEmMinutos(80);

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 4000; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.favoritar(meuPodcast);
        preferidas.favoritar(minhaMusica);
    }
}
