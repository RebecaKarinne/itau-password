package br.com.itau.password.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordServiceTests {

    private PasswordService passwordService = new PasswordService();

    @Test
    void validationTrue() { // Exemplos seguidos do challenge Itaú
        assertTrue(passwordService.isValid("AbTp9!fok"));
    }

    @Test
    void validationFalse() {
        assertFalse(passwordService.isValid(""));
        assertFalse(passwordService.isValid("aa"));
        assertFalse(passwordService.isValid("ab"));
        assertFalse(passwordService.isValid("AAAbbbCc"));
        assertFalse(passwordService.isValid("AbTp9!foo"));
        assertFalse(passwordService.isValid("AbTp9!foA"));
        assertFalse(passwordService.isValid("AbTp9 fok"));
    }
}
