public class Player
{
    private int id;
    private String first_name;
    private String last_name;
    private String position;
    private int height_feet;
    private int height_inches;
    private int weight_pounds;
    private String full_name;
    private int teamID;
    private String abbreviation;
    private String city;
    private String conference;
    private String division;
    private String name;

    public Player()
    {

    }

    /**
     * This method overrides the usual toString method, and instead has an output of its own for the players.
     * @return All private variables.
     */
    @Override
    public String toString()
    {
        return "Player " + first_name + " " + last_name + "\n" +
                "Player ID: " + id + "\n" +
                "Team: " + teamID + "\n" +
                "Position: " + position + "\n" +
                "height: " + height_feet + " " + height_inches + "\n" +
                "Weight: " + weight_pounds + "\n";
    }

}
