package br.com.desafioItau.password.service;

import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class PasswordService {

    private static final String validations =
            "^(?=.*[A-Za-z0-9])" // Ao menos: 1 maiúscula, 1 minúscula e 1 dígito
            + "(?=.*[!@#$%^&*()-+])" // Ao menos um destes caracteres especiais
            + "(?!.*(.).*\\1)" // Sem caracteres repetidos
            + "(?=\\S+$).{9,}$"; // Sem espaços em branco e ao menos 9 caracteres

    public boolean isValid(String password) {
        Pattern p = Pattern.compile(validations);
        Matcher m = p.matcher(password);
        return m.matches();
    }

}
