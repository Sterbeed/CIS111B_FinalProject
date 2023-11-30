import java.util.*;

public class Team
{
    private int id;
    private String abbreviation;
    private String city;
    private String conference;
    private String division;
    private String full_name;
    private String name;

    /**
     * Default Constructor
     */
    public Team()
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
