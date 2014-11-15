package Model;


import java.sql.Date;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fuyun
 */
public class Passenger{
    public int passengerID;
    public String passengerName;
    public String Nationality;
    public String AgeRange;
    public int Age;
    public double Money;
    public int NoOfPassenger;
    
    
    
    public void setNationality(String Nationality) throws SQLException{
        this.Nationality = Nationality;
    }
    
    public void setAgeRange(String AgeRange) throws SQLException{
        this.AgeRange = AgeRange;
    }
    public void setMoney(double Money) throws SQLException{
        this.Money = Money;
    }
    public void setNoOfPassenger(int NoOfPassenger) throws SQLException{
        this.NoOfPassenger = NoOfPassenger;
    }
    
    public void setName(String Name) throws SQLException{
        this.passengerName = Name;
    }
    public void setAge(int Age) throws SQLException{
        this.Age = Age;
    }
    public void setID(int ID) throws SQLException{
        this.passengerID = ID;
    }
    
    
    public String getNationality() throws SQLException{
        return this.Nationality;
    }
    
     public String getAgeRange() throws SQLException{
        return this.AgeRange;
    }
    
     public double getMoney() throws SQLException{
        return this.Money;
    }

     public int getNoOfPassenger() throws SQLException{
        return this.NoOfPassenger;
    }
     public int getID() throws SQLException{
        return this.passengerID;
    }
     public String getName() throws SQLException{
        return this.passengerName;
    }
     public int getAge() throws SQLException{
        return this.Age;
    }
     
}
