package main.java.com.alura.desafio.LiterAlura.service;

public interface IConvierteDatos {
    <T> T obtieneDatos (String json, Class <T> clase);
}
