package br.com.hericStreamer.screenmatch.model;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface IConverterDados {
    <T> T obterDados(String json, Class<T> classe) throws JsonProcessingException;
 }
