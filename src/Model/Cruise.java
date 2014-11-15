/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author fuyun
 */
public class Cruise {
    int ID;
    int shipID;
    String port1;
    String port2;
    String port3;
    String port4;
    
    public void setID(int ID){
        this.ID = ID;
    }
    public void setShipID(int shipID){
        this.shipID = shipID;
    }
    public void setPort1(String port1){
        this.port1 = port1;
    }
    public void setPort2(String port2){
        this.port2 = port2;
    }
    public void setPort3(String port3){
        this.port3 = port3;
    }
    public void setPort4(String port4){
        this.port4 = port4;
    }
    
    public int getID(){
        return this.ID;
    }
    public int getShipID(){
        return this.shipID;
    }
    public String getPort1(){
        return this.port1;
    }
    public String getPort2(){
        return this.port2;
    }
    public String getPort3(){
        return this.port3;
    }
    public String getPort4(){
        return this.port4;
    }
}
