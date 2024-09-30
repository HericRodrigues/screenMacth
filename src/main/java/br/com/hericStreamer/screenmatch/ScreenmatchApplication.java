package br.com.hericStreamer.screenmatch;

import br.com.hericStreamer.screenmatch.model.DadosSerie;
import br.com.hericStreamer.screenmatch.service.ConverterDados;
import br.com.hericStreamer.screenmatch.service.consumeApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	private String String;

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var comsumeApi = new consumeApi();
		var json = consumeApi.obterDados("https://www.omdbapi.com/?t=fallout&apikey=6585022c");
//		var json = consumeApi.obterDados("https://coffee.alexflipnote.dev/random.json");
		System.out.println(json);
		ConverterDados conversor = new ConverterDados();
		DadosSerie dados = conversor.obterDados(json,DadosSerie.class);
		System.out.println(dados);

	}
}
