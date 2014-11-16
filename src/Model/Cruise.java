/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 * This class create a cruise with its ID, shipID, port1, port2, port3, port4.
 *
 * @author fuyun
 * @version 1.0
 * @since 17/11/2013
 */
public class Cruise {
    int ID;
    int shipID;
    String port1;
    String port2;
    String port3;
    String port4;

    /**
     *
     * set Cruise ID
     * @param ID the Cruise ID
     */
    public void setID(int ID){
        this.ID = ID;
    }
    /**
     *
     * set Ship ID
     * @param shipID the Ship ID
     */
    public void setShipID(int shipID){
        this.shipID = shipID;
    }
    /**
     *
     * set port 1
     * @param port1 the port1
     */
    public void setPort1(String port1){
        this.port1 = port1;
    }
    /**
     *
     * set port 2
     * @param port2 the port2
     */
    public void setPort2(String port2){
        this.port2 = port2;
    }
    /**
     *
     * set port 3
     * @param port3 the port3
     */
    public void setPort3(String port3){
        this.port3 = port3;
    }
    /**
     *
     * set port 4
     * @param port4 the port4
     */
    public void setPort4(String port4){
        this.port4 = port4;
    }
    /**
     *
     * get Cruise ID
     * @return ID the cruiseID
     */
    public int getID(){
        return this.ID;
    }
    /**
     *
     * get Ship ID
     * @return ShipID the ShipID
     */
    public int getShipID(){
        return this.shipID;
    }
    /**
     *
     * get port1
     * @return port1
     */
    public String getPort1(){
        return this.port1;
    }
    /**
     *
     * get port2
     * @return port2
     */
    public String getPort2(){
        return this.port2;
    }
    /**
     *
     * get port3
     * @return port3
     */
    public String getPort3(){
        return this.port3;
    }
    /**
     *
     * get port4
     * @return port4
     */
    public String getPort4(){
        return this.port4;
    }
}
