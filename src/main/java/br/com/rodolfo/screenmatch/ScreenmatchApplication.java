package br.com.rodolfo.screenmatch;

import br.com.rodolfo.screenmatch.model.ConvertDados;
import br.com.rodolfo.screenmatch.model.DadosSerie;
import br.com.rodolfo.screenmatch.service.ConsumoApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumoApi consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("http://www.omdbapi.com/?i=tt3896198&apikey=94a137eb");
		System.out.println(json);
		ConvertDados conversor = new ConvertDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
