package br.com.hericStreamer.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodios(@JsonAlias("Title")  String titulo,
                             @JsonAlias("Episode")  Integer numero,
                             @JsonAlias("imdRating")  String avaliacao,
                             @JsonAlias("Released")  String dataLancamento) {
}
