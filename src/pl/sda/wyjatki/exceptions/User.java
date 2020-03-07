package pl.sda.wyjatki.exceptions;

public class User {
    private String login;
    private String email;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws EmailException {
        if(!this.checkEmail(email)) {
            throw new EmailException("Niepoprawny email");
        } else {
            this.email = email; }
    }
    public boolean checkEmail(String email) {
        return email.contains("@");
    }

    public User(String login, String email) {
        this.login = login;
        this.email = email;
    }
}
