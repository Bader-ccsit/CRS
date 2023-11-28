import java.util.HashMap;

public class IDandPasswords {
    HashMap<String,String> logininfo = new HashMap<String,String>();
    
    IDandPasswords(){
        logininfo.put("Admin", "123");

    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
