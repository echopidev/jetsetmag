/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author ferchichi
 */
public class Adminstrateur {
    
    private String login;
    private String pwd;

    public Adminstrateur() {
    }
    
    
    public Adminstrateur(String login,String pwd){
    
    this.login=login;
    this.pwd=pwd;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
}
