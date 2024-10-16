package org.abiSystems.PageObjects;

import org.abiSystems.BaseClass;
import org.abiSystems.Utils.BrowserUtils;

public class LoginPage extends BaseClass {

    private static String txtEmail = "//form/div[1]/input";
    private static String txtPassword = "//form/div[2]/input";
    private static String btnLogin = "//input[@value='Login']";

    public static void enterUsername(String username){
        BrowserUtils.enterText(txtEmail,username);
    }
    public static void enterPassword(String password){
        BrowserUtils.enterText(txtEmail,password);
    }
    public static void clickLogin(){
        BrowserUtils.clickElement(txtEmail);
    }


}
