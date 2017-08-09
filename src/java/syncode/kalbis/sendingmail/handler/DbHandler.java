/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syncode.kalbis.sendingmail.handler;

import javax.servlet.http.HttpServletRequest;
import syncode.kalbis.KalbisConnection;

/**
 *
 * @author Administrator
 */
public class DbHandler extends KalbisConnection {
    
    private String RealPath = "";

    public DbHandler(HttpServletRequest request) {
        this.RealPath = request.getRealPath("/");
    }
    
    

    public String getRealPath() {
        return RealPath;
    }

    public void setRealPath(String RealPath) {
        this.RealPath = RealPath;
    }
    
    
}
