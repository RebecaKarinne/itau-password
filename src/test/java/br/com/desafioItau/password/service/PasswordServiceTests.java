package br.com.desafioItau.password.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordServiceTests {

    private PasswordService pS = new PasswordService();

    // Exemplos seguidos do challenge Itaú

    @Test
    void validationFalse() { // Exemplo de passwords não válidos
        assertFalse(pS.isValid(""));
        assertFalse(pS.isValid("aa"));
        assertFalse(pS.isValid("ab"));
        assertFalse(pS.isValid("AAAbbbCc"));
        assertFalse(pS.isValid("AbTp9!foo"));
        assertFalse(pS.isValid("AbTp9!foA"));
        assertFalse(pS.isValid("AbTp9 fok"));
    }

    @Test
    void validationTrue() { // Exemplo de password válido
        assertTrue(pS.isValid("AbTp9!fok"));
    }
}
