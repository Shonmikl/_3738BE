package aleksey_babaykin.hw20221020;

import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.TreeMap;

@NoArgsConstructor
public class Autorization {

    private Map<String, Login> autorizedLogin = new TreeMap();

    public boolean isAutorized(String loginID){
        return autorizedLogin.containsKey(loginID);
    }

    public void setAutorizedLogin(Login login){
        System.out.println("User Authorazed!");
    }
}
