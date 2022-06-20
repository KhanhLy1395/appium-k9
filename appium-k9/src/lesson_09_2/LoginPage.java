package lesson_09_2;

public abstract class LoginPage {

    public void login(){

    }

    protected abstract String usernameLocator();
    protected abstract String passwordLocator();
    protected abstract String loginBtnLocator();
}
