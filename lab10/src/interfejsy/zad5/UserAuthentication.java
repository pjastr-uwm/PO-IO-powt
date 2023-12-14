package interfejsy.zad5;

public class UserAuthentication implements Authentication{
    @Override
    public boolean login(String username, String password) {
        if (username == null)
            return false;
        return username.equals(password);
    }

    @Override
    public void logout() {
        System.out.println("Log out");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if (newPassword == null)
            return  false;
        return !newPassword.isEmpty();
    }
}
