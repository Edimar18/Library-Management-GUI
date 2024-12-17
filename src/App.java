

public class App {
    public static void main(String[] args) throws Exception {
        WelcomePage welcome = new WelcomePage();
        SigninPage login = new SigninPage();
        SignupSuccess loginSuccess = new SignupSuccess();
        HomePage home = new HomePage();

        WelcomePage.run();
        

    }
}
