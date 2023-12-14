package interfejsy.zad5;

import java.util.ArrayList;

public class TestAuthentication {

    public static void main(String[] args) {
        UserAuthentication u1 = new UserAuthentication();
        System.out.println(u1.login("AA","BB"));
        ArrayList<Authentication> list = new ArrayList<>();
        list.add(new UserAuthentication());
        list.add(new AdminAuthentication());
        list.add(new UserAuthentication());
        list.add(new AdminAuthentication());
        for(Authentication elem : list){
            elem.logout();
        }
    }
}
