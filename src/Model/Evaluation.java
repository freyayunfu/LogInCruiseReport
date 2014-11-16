package Model;

/**
 * This class create the evaluation report for the cruise by each passenger.
 * @author yunfu
 * @version 1.0
 * @since 17/11/2014
 */

public class Evaluation {


            int CruiseID;
            int PassengerID;
            double food;
            double service;
            double environment;
            double drink;
            double internet;
            double entertainment;
            double MoneySpent;
    /**
     *
     * set Cruise ID
     * @param cruiseID the Cruise ID
     */
    public void setCruiseID(int cruiseID) {
        CruiseID = cruiseID;
    }
    /**
     *
     * set Passenger ID
     * @param passengerID the passenger ID
     */
    public void setPassengerID(int passengerID) {
        PassengerID = passengerID;
    }
    /**
     *
     * set score of food
     * @param food the food score
     */
    public void setFood(double food) {
        this.food = food;
    }
    /**
     *
     * set score of service
     * @param service the service score
     */
    public void setService(double service) {
        this.service = service;
    }
    /**
     *
     * set environment score
     * @param environment the environment score
     */
    public void setEnvironment(double environment) {
        this.environment = environment;
    }
    /**
     *
     * set drink score
     * @param drink the drink score
     */
    public void setDrink(double drink) {
        this.drink = drink;
    }
    /**
     *
     * set internet score
     * @param internet the internet score
     */
    public void setInternet(double internet) {
        this.internet = internet;
    }
    /**
     *
     * set entertainment score
     * @param entertainment the entertainment score
     */
    public void setEntertainment(double entertainment) {
        this.entertainment = entertainment;
    }
    /**
     *
     * set the Money Spent by each passenger in each cruise
     * @param moneySpent the Money Spent by each passenger in each cruise
     */
    public void setMoneySpent(double moneySpent) {
        MoneySpent = moneySpent;
    }
    /**
     *
     * get the cruise ID
     * @return cruiseID cruise ID
     */
    public int getCruiseID() {
        return CruiseID;
    }
    /**
     *
     * get the passenger ID
     * @return passengerID
     */
    public int getPassengerID() {
        return PassengerID;
    }
    /**
     *
     * get the food score
     * @return food food score
     */
    public double getFood() {
        return food;
    }
    /**
     *
     * get the service score
     * @return service the service score
     */
    public double getService() {
        return service;
    }
    /**
     *
     * get the environment score
     * @return environment the environment score
     */
    public double getEnvironment() {
        return environment;
    }
    /**
     *
     * get the drink score
     * @return drink the drink score
     */
    public double getDrink() {
        return drink;
    }
    /**
     *
     * get the internet score
     * @return internet the internet score
     */
    public double getInternet() {
        return internet;
    }
    /**
     *
     * get the passenger ID
     * @return entertainment score
     */
    public double getEntertainment() {
        return entertainment;
    }
    /**
     *
     * get the money spent by each passenger in each cruise
     * @return MoneySpent the money spent by each passenger in each cruise
     */
    public double getMoneySpent() {
        return MoneySpent;
    }
}
