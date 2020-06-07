package br.edu.logatti.aula8.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(final String message) {
        super(String.format("O recurso '%s' não foi encontrado.", message));
    }
}