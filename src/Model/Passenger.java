package Model;


import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This class create a passenger with its ID, name, nationality, age, money, age range, and number.
 *
 * @author fuyun
 * @version 1.0
 * @since 17/11/2013
 */
public class Passenger{
    public int passengerID;
    public String passengerName;
    public String Nationality;
    public String AgeRange;
    public int Age;
    public double Money;
    public int NoOfPassenger;


    /**
     *
     * set nationality
     * @param Nationality
     */
    public void setNationality(String Nationality) throws SQLException{
        this.Nationality = Nationality;
    }
    /**
     *
     * set AgeRange
     * @param AgeRange
     */
    public void setAgeRange(String AgeRange) throws SQLException{
        this.AgeRange = AgeRange;
    }
    /**
     *
     * set Money one passenger spent totally on all cruises
     * @param Money
     */
    public void setMoney(double Money) throws SQLException{
        this.Money = Money;
    }
    /**
     *
     * set number of passenger
     * @param NoOfPassenger
     */
    public void setNoOfPassenger(int NoOfPassenger) throws SQLException{
        this.NoOfPassenger = NoOfPassenger;
    }
    /**
     *
     * set name
     * @param Name
     */
    public void setName(String Name) throws SQLException{
        this.passengerName = Name;
    }
    /**
     *
     * set age
     * @param Age
     */
    public void setAge(int Age) throws SQLException{
        this.Age = Age;
    }
    /**
     *
     * set passenger ID
     * @param ID
     */
    public void setID(int ID) throws SQLException{
        this.passengerID = ID;
    }

    /**
     *
     * get nationality
     * @return Nationality
     */
    public String getNationality() throws SQLException{
        return this.Nationality;
    }
    /**
     *
     * get Age Range
     * @return AgeRange
     */
     public String getAgeRange() throws SQLException{
        return this.AgeRange;
    }
    /**
     *
     * get Money spent by one passenger totally in all cruises
     * @return Money
     */
     public double getMoney() throws SQLException{
        return this.Money;
    }
    /**
     *
     * get number of passengers
     * @return NoOfPassenger
     */
     public int getNoOfPassenger() throws SQLException{
        return this.NoOfPassenger;
    }
    /**
     *
     * get passenger ID
     * @return passengerID
     */
     public int getID() throws SQLException{
        return this.passengerID;
    }
    /**
     *
     * get name
     * @return passengerName
     */
     public String getName() throws SQLException{
        return this.passengerName;
    }
    /**
     *
     * get Age
     * @return Age
     */
     public int getAge() throws SQLException{
        return this.Age;
    }
     
}
