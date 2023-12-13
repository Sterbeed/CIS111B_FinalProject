package com.group2.nbapi_fpgroup2;


public class Teams
{
    //Reason for id being an integer instead of an int is because TableColumn method cant use primitive types
    public Integer id;
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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId(){
        return id;
    }
    public String getAbbreviation() {
        return abbreviation;
    }

    public String getCity() {
        return city;
    }

    public String getConference() {
        return conference;
    }

    public String getDivision() {
        return division;
    }

    public String getFull_name() {
        return full_name;
    }

    public String getName() {
        return name;
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

