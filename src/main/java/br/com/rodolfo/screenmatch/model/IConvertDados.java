package br.com.rodolfo.screenmatch.model;

public interface IConvertDados {
    <T> T obterDados(String json, Class<T> classe);
}
