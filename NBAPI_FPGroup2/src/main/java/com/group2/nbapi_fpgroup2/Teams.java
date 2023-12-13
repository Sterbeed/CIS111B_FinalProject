package com.group2.nbapi_fpgroup2;

import java.util.*;

public class Teams
{
    public int id;
    public String abbreviation;
    public String city;
    public String conference;
    public String division;
    public String full_name;
    public String name;

    /**
     * Default Constructor
     */
    public Teams()
    {

    }


    /**
     * This method overrides the usual toString method, and instead has an output of its own for the teams.
     * @return All private variables.
     */
    @Override
    public String toString()
    {
        return "Team" + full_name + "\n" +
                "Team ID: " + id + "\n" +
                "Abbreviation: " + abbreviation + "\n" +
                "City: " + city + "\n" +
                "Conference: " + conference + "\n" +
                "Division: " + division + "\n" +
                "Name: " + name + "\n";
    }

}

