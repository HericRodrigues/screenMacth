package br.com.hericStreamer.screenmatch.principal;

import br.com.hericStreamer.screenmatch.model.DadosSerie;
import br.com.hericStreamer.screenmatch.service.ConverterDados;
import br.com.hericStreamer.screenmatch.service.consumeApi;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private consumeApi consumo = new consumeApi();
    private ConverterDados conversor = new ConverterDados();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=6585022c";

    public void exibeMenu() {
        System.out.println("\nDigite o nome da série para a busca");
        var nomeSerie = leitura.nextLine();
        var json = consumeApi.obterDados(ENDERECO + nomeSerie.replace(" ", " + ") + API_KEY);
        DadosSerie dados = null;
        try {
            dados = conversor.obterDados (json, DadosSerie.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        System.out.println(dados);
    }
}


