package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fuyun
 */
import Model.Cruise;
import Model.Passenger;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;




public class database {
    public static Connection conn = null;
    PreparedStatement psInsert;
    PreparedStatement psUpdate;
    Statement s;
    Statement s1;
    Statement s2;
    Statement s3;
    Statement s4;
    ResultSet rs = null;
    Properties props = new Properties();
    String dbName = "cruiseDB";

    
    
    public database(){


            /*
             * This connection specifies create=true in the connection URL to
             * cause the database to be created when connecting for the first
             * time. 
             */
        props.put("user", "");
        props.put("password", "");

        try {
            conn = DriverManager.getConnection("jdbc:derby:" + dbName
                    + ";create=true", props);
            conn.setAutoCommit(false);
            s = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        // We create a table... table cruise

        try {
            s.executeUpdate("create table cruise(CruiseID int, ShipID int, Port1 varchar(40), Port2 varchar(40), Port3 varchar(40), Port4 varchar(40),primary key(CruiseID))");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            s = conn.createStatement();
            rs = s.executeQuery("SELECT * FROM cruise");
            conn.commit();


            if (!rs.next()) {
                psInsert = conn.prepareStatement("insert into cruise values (?, ?, ?, ?, ?, ?)");
                psInsert.setInt(1, 1);
                psInsert.setInt(2, 1);
                psInsert.setString(3, "Shanghai");
                psInsert.setString(4, "Tokyo");
                psInsert.setString(5, "Seoul");
                psInsert.setString(6, "Sydney");
                psInsert.executeUpdate();
                psInsert.setInt(1, 2);
                psInsert.setInt(2, 2);
                psInsert.setString(3, "Brisbane");
                psInsert.setString(4, "Sydney");
                psInsert.setString(5, "Melbourne");
                psInsert.setString(6, "Adelaide");
                psInsert.executeUpdate();
                psInsert.setInt(1, 3);
                psInsert.setInt(2, 3);
                psInsert.setString(3, "Beijing");
                psInsert.setString(4, "Shanghai");
                psInsert.setString(5, "HongKong");
                psInsert.setString(6, "Taiwan");
                psInsert.executeUpdate();
                psInsert.setInt(1, 4);
                psInsert.setInt(2, 4);
                psInsert.setString(3, "NewYork");
                psInsert.setString(4, "Boston");
                psInsert.setString(5, "Altlantic");
                psInsert.setString(6, "Dover");
                psInsert.executeUpdate();
                psInsert.setInt(1, 5);
                psInsert.setInt(2, 5);
                psInsert.setString(3, "London");
                psInsert.setString(4, "Rome");
                psInsert.setString(5, "Paris");
                psInsert.setString(6, "Barcelona");
                psInsert.executeUpdate();

                psInsert.setInt(1, 6);
                psInsert.setInt(2, 6);
                psInsert.setString(3, "NewYork");
                psInsert.setString(4, "Tokyo");
                psInsert.setString(5, "Shanghai");
                psInsert.setString(6, "Boston");
                psInsert.executeUpdate();
                psInsert.setInt(1, 7);
                psInsert.setInt(2, 7);
                psInsert.setString(3, "Sydney");
                psInsert.setString(4, "Rome");
                psInsert.setString(5, "Paris");
                psInsert.setString(6, "Brisbane");
                psInsert.executeUpdate();
                psInsert.setInt(1, 8);
                psInsert.setInt(2, 8);
                psInsert.setString(3, "NewYork");
                psInsert.setString(4, "Seoul");
                psInsert.setString(5, "Shanghai");
                psInsert.setString(6, "Dover");
                psInsert.executeUpdate();
                psInsert.setInt(1, 9);
                psInsert.setInt(2, 9);
                psInsert.setString(3, "Boston");
                psInsert.setString(4, "Sydney");
                psInsert.setString(5, "Shanghai");
                psInsert.setString(6, "Altlantic");
                psInsert.executeUpdate();
                psInsert.setInt(1, 10);
                psInsert.setInt(2, 10);
                psInsert.setString(3, "Melbourne");
                psInsert.setString(4, "Beijing");
                psInsert.setString(5, "Tokyo");
                psInsert.setString(6, "Dover");
                psInsert.executeUpdate();
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

        //table passenger
//                s.executeUpdate("DROP TABLE passenger");
        try {
            s.execute("create table passenger(PassengerID int, PassengerName varchar(40), Nationality varchar(40), Age int, primary key(PassengerID))");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            s = conn.createStatement();
            rs = s.executeQuery("SELECT * FROM passenger");
            conn.commit();


            if (!rs.next()) {
                psInsert = conn.prepareStatement("insert into passenger values (?, ?, ?, ?)");

                String[] FirstNames = {"Bob", "Jill", "Tom", "Brandon", "Joan", "Ethel", "Albert", "Hpward", "Roy", "Annie", "Alice", "Ruby", "Donald", "Carl", "Bonnie", "Lisa", "Scott", "Sean", "Morgan", "Oliva"};
                String[] LastNames = {"Matthew", "Nathan", "Aaron", "Zachary", "Jadon", "Matteo", "Harrison", "Titus", "Magnus", "Jax", "Jude", "Dexter", "Sawyer", "Beckett", "Miles", "Land", "Letitia", "Leopold", "Louise", "Lucretia"};
                String[] Nationalities = {"China", "Japan", "USA", "Korea", "Australia", "India"};

                for (int i = 1; i < 211; i++) {
                    psInsert.setInt(1, i);
                    int index1 = (int) (Math.random() * FirstNames.length);
                    int index2 = (int) (Math.random() * LastNames.length);
                    String FirstName = FirstNames[index1];
                    String LastName = LastNames[index2];
                    psInsert.setString(2, FirstName + " " + LastName);
                    int index3 = (int) (Math.random() * Nationalities.length);
                    String Nationality = Nationalities[index3];
                    psInsert.setString(3, Nationality);
                    int age = (int) (20 + Math.random() * 40);
                    psInsert.setInt(4, age);
                    psInsert.executeUpdate();
                }

                s.executeUpdate("alter table passenger add AgeRange VARCHAR(30)");
                s.executeUpdate("update passenger set AgeRange = '<20' where Age<20");
                s.executeUpdate("update passenger set AgeRange = '20-30' where Age>=20 AND Age<30");
                s.executeUpdate("update passenger set AgeRange = '30-40' where Age>=30 AND Age<40");
                s.executeUpdate("update passenger set AgeRange = '40-50' where Age>=40 AND Age<50");
                s.executeUpdate("update passenger set AgeRange = '50-60' where Age>=50 AND Age<60");
                conn.commit();
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

        //table CruisePassenger
        try {
            s.execute("create table CruisePassenger(CruiseID int, PassengerID int, food double, "
                    + "service double, environment double, drink double, internet double, entertainment double, "
                    + "MoneySpent double, primary key(PassengerID, CruiseID))");
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            s = conn.createStatement();
            rs = s.executeQuery("SELECT * FROM CruisePassenger");
            conn.commit();

            if (!rs.next()) {
                psInsert = conn.prepareStatement("insert into CruisePassenger values (?, ?, ?, ?, ?, ?, ?, ?, ?)");


                for (int i = 0; i < 10; i++) {
                    for (int j = 1; j < 31; j++) {
                        psInsert.setInt(1, i + 1);
                        psInsert.setInt(2, i * 20 + j);
                        double FoodRate = (double) (1.0 + Math.random() * 5.0);
                        psInsert.setDouble(3, FoodRate);
                        double ServiceRate = (double) (1 + Math.random() * 5);
                        psInsert.setDouble(4, ServiceRate);
                        double EnvironmentRate = (double) (1 + Math.random() * 5);
                        psInsert.setDouble(5, EnvironmentRate);
                        double DrinkRate = (double) (1 + Math.random() * 5);
                        psInsert.setDouble(6, DrinkRate);
                        double InternetRate = (double) (1 + Math.random() * 5);
                        psInsert.setDouble(7, InternetRate);
                        double EntertainmentRate = (double) (1 + Math.random() * 5);
                        psInsert.setDouble(8, EntertainmentRate);
                        double MoneySpent = (double) (50 + Math.random() * 300);
                        psInsert.setDouble(9, MoneySpent);
                        psInsert.executeUpdate();
                        conn.commit();
                    }
                }
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

        //create table Sailor
        try {
            s.execute("create table sailor(SailorID int, CruiseID int, SupervisorID int, primary key(SailorID))");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            s = conn.createStatement();
            rs = s.executeQuery("SELECT * FROM sailor");
            conn.commit();


            if (!rs.next()) {
                psInsert = conn.prepareStatement("insert into sailor values (?, ?, ?)");


                for (int i = 0; i < 10; i++) {
                    psInsert.setInt(1, i * 2 + 1);
                    psInsert.setInt(2, i + 1);
                    psInsert.setInt(3, 0);
                    psInsert.executeUpdate();
                    psInsert.setInt(1, i * 2 + 2);
                    psInsert.setInt(2, i + 1);
                    psInsert.setInt(3, i + 1);
                    psInsert.executeUpdate();
                    conn.commit();
                }
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            s = conn.createStatement();
            rs = s.executeQuery("SELECT TotalMoneySpent FROM passenger");
            conn.commit();

            if (!rs.next()) {
                s.executeUpdate("alter table passenger add TotalMoneySpent double");
                s.executeUpdate("update passenger set TotalMoneySpent = ( SELECT SUM(MoneySpent) FROM CruisePassenger WHERE CruisePassenger.PassengerID=passenger.PassengerID GROUP BY PassengerID)");
                conn.commit();
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }


//            System.out.println("Generate Report 1 : Revenue generated from the cruise passengers by nationality and age.");

//            System.out.println("");
//
//            System.out.println("Generate Report 2 : Sailors that worked on a cruise and their supervisors");
//            rs = s.executeQuery("SELECT SailorID, CruiseID, SupervisorID  FROM sailor");
//            System.out.printf("%-30s%-30s%-30s\n", "Sailor", "Cruise", "Supervisor");
//            while (rs.next()) {
//                if (rs.getInt("SupervisorID") == 0) {
//                    System.out.printf("%-30s%-30s%-30s\n", "Sailor" + rs.getInt("SailorID"), "Cruise" + rs.getInt("CruiseID"), "");
//                } else {
//                    System.out.printf("%-30s%-30s%-30s\n", "Sailor" + rs.getInt("SailorID"), "Cruise" + rs.getInt("CruiseID"), "Supervisor" + rs.getInt("SupervisorID"));
//                }
//            }
//            System.out.println("");
//
//            System.out.println("Generate Report 3 : list of passengers sorted by MoneySpentOnCruise");
//            rs = s.executeQuery("SELECT PassengerName, CruiseID, MoneySpent FROM CruisePassenger LEFT JOIN passenger ON CruisePassenger.PassengerID=passenger.PassengerID ORDER BY MoneySpent");
//            System.out.printf("%-30s%-30s%-30s\n", "PassengerName", "MoneySpent", "CruiseID");
//            while (rs.next()) {
//                System.out.printf("%-30s%-30d%-30s\n", rs.getString("PassengerName"), rs.getInt("MoneySpent"), "Cruise" + rs.getString("CruiseID"));
//            }
//            System.out.println("");
//
//            System.out.println("Generate Report 4 : Cruise evaluation report by passengers.");
//            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s%-30s\n", "Cruise", "Survey1", "Survey2", "Survey3", "Survey4", "Survey5", "Survey6");
//            System.out.printf("%-30s%-30f%-30f%-30f%-30f%-30f%-30f\n", ("CruiseID"), rs.getDouble("FOOD"), rs.getDouble("SERVICE"), rs.getDouble("ENVIRONMENT"), rs.getDouble("DRINK"), rs.getDouble("INTERNET"), rs.getDouble("ENTERTAINMENT"));
//            System.out.println("");
//            System.out.println("");


//            rs.close();
        //          s.close();
//            conn.close();


    ArrayList<Passenger> passenger = new ArrayList<Passenger>();


    public ArrayList<Passenger> getPassenger(){


            try {

                conn = DriverManager.getConnection("jdbc:derby:" + dbName
                        + ";create=false", props);
                conn.setAutoCommit(false);
                s1 = conn.createStatement();

                rs = s1.executeQuery("SELECT Nationality, AgeRange, sum(TotalMoneySpent) as Money, COUNT(PassengerID) as NoOfPassenger FROM passenger group by Nationality, AgeRange ORDER BY Nationality");
                conn.commit();

                int i = 0;
                passenger.clear();
                while (rs.next()) {
                    passenger.add(new Passenger());
                    passenger.get(i).setNationality(rs.getString("Nationality"));
                    passenger.get(i).setAgeRange(rs.getString("AgeRange"));
                    passenger.get(i).setMoney(rs.getDouble("Money"));
                    passenger.get(i).setNoOfPassenger(rs.getInt("NoOfPassenger"));
                    i++;
                }

            } catch (SQLException ex) {
                ex.printStackTrace();

            }
            return passenger;
        }

        public ArrayList<Passenger> getPassenger2(){


            try {

                conn = DriverManager.getConnection("jdbc:derby:" + dbName
                        + ";create=false", props);
                conn.setAutoCommit(false);
                s2 = conn.createStatement();

                rs = s2.executeQuery("SELECT Nationality, AgeRange, sum(TotalMoneySpent) "
                        + "as Money, COUNT(PassengerID) as NoOfPassenger FROM passenger "
                        + "group by AgeRange, Nationality ORDER BY AgeRange");

                conn.commit();

                int i = 0;
                passenger.clear();
                while (rs.next()) {
                    passenger.add(new Passenger());
                    passenger.get(i).setNationality(rs.getString("Nationality"));
                    passenger.get(i).setAgeRange(rs.getString("AgeRange"));
                    passenger.get(i).setMoney(rs.getDouble("Money"));
                    passenger.get(i).setNoOfPassenger(rs.getInt("NoOfPassenger"));
                    i++;
                }

            } catch (SQLException ex) {
                ex.printStackTrace();

            }
            return passenger;
        }

        public ArrayList<Passenger> getPassengerAll(){


            try {

                conn = DriverManager.getConnection("jdbc:derby:" + dbName
                        + ";create=false", props);

                conn.setAutoCommit(false);
                s3 = conn.createStatement();

                rs = s3.executeQuery("SELECT * FROM passenger ");

                conn.commit();

                int i = 0;
                passenger.clear();
                while (rs.next()) {

                    passenger.add(new Passenger());
                    passenger.get(i).setID(rs.getInt("PassengerID"));
                    passenger.get(i).setName(rs.getString("PassengerName"));
                    passenger.get(i).setNationality(rs.getString("Nationality"));
                    passenger.get(i).setAge(rs.getInt("Age"));
                    passenger.get(i).setAgeRange(rs.getString("AgeRange"));
                    i++;
                }

            } catch (SQLException ex) {
                ex.printStackTrace();

            }
            return passenger;
        }

        ArrayList<Cruise> cruise = new ArrayList<Cruise>();
        public ArrayList<Cruise> getCruiseAll(){

            try {

                conn = DriverManager.getConnection("jdbc:derby:" + dbName
                        + ";create=false", props);
                conn.setAutoCommit(false);
                s4 = conn.createStatement();

                rs = s4.executeQuery("SELECT * FROM cruise ");

                conn.commit();

                int i = 0;
                cruise.clear();
                while (rs.next()) {
                    cruise.add(new Cruise());
                    cruise.get(i).setID(rs.getInt("CruiseID"));
                    cruise.get(i).setShipID(rs.getInt("ShipID"));
                    cruise.get(i).setPort1(rs.getString("Port1"));
                    cruise.get(i).setPort2(rs.getString("Port2"));
                    cruise.get(i).setPort3(rs.getString("Port3"));
                    cruise.get(i).setPort4(rs.getString("Port4"));
                    i++;
                }

            } catch (SQLException ex) {
                ex.printStackTrace();

            }
            return cruise;
        }

    public void close() throws SQLException {
        conn.close();
    }


}
    


