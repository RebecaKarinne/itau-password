package br.com.desafioItau.password.model;

public class PasswordResponse {
    private boolean isValid;

    public PasswordResponse(boolean isValid) {

        this.isValid = isValid;
    }

    public boolean isValid() {

        return isValid;
    }

    public void setValid(boolean valid) {

        isValid = valid;
    }
}
