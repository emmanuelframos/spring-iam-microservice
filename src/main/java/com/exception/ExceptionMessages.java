package com.exception;

public enum ExceptionMessages {

    GENERIC("Falha no servidor"),
    INVALID_USER_OR_PASSWORD("Usuário e/ou senha inválidos"),
    EMAIL_ALREADY_EXISTS("E-mail já existente"),
    INVALID_SESSION("Sessão inválida"),
    UNAUTHORIZED("Não autorizado"),
    USER_NOT_FOUND("Usuário não encontrado"),
    USER_NAME_MANDATORY("Nome do usuário é obrigatório"),
    USER_EMAIL_MANDATORY("Email do usuário é obrigatório"),
    USER_EMAIL_INVALID("E-mail invalido"),
    USER_PASSWORD_MANDATORY("Senha do usuário é obrigatória"),
    USER_PASSWORD_TOO_SMALL("Senha do usuário deve ter no mínimo oito dígitos"),
    USER_PHONE_MANDATORY("Telefone do usuário é obrigatório"),
    PHONE_DDD_MANDATORY("DDD é obrigatório no telefone"),
    PHONE_NUMBER_MANDATORY("Número é obrigatório no telefone");

    private String message;

    ExceptionMessages(String message){
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }
}