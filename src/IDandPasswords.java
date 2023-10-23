import java.util.HashMap;

public class IDandPasswords {

    private HashMap<String, String> logininfo = new HashMap<String, String>();

    IDandPasswords() {

        logininfo.put("user1", "password_1");
        logininfo.put("user2", "password_2");
        logininfo.put("user3", "password_3");
    }

    public HashMap<String, String> getLoginInfo() {
        return logininfo;
    }
}
