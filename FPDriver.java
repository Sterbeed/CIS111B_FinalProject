import com.google.gson.Gson;
import java.net.*;
import java.util.*;

public class FPDriver
{
    public static void main(String[] args) throws Exception
    {
        //Calling the NBA API for teams.
        URL urlTeams = new URL("https://www.balldontlie.io/api/v1/teams");
        Scanner JsonScan1 = new Scanner(urlTeams.openStream());

        //Calling NBA API for players.
        URL urlPlayers = new URL("https://www.balldontlie.io/api/v1/players");
        Scanner JsonScan2 = new Scanner(urlPlayers.openStream());


        //Using the data from the Json scans and putting them into a String called rawData.
        StringBuilder rawDataTeams = new StringBuilder();
        StringBuilder rawDataPlayers = new StringBuilder();

        while (JsonScan1.hasNextLine())
        {
            rawDataTeams.append(JsonScan1.nextLine());
        }
        while (JsonScan2.hasNextLine())
        {
            rawDataPlayers.append(JsonScan2.nextLine());
        }

        //Creating a gson object
        Gson gson = new Gson();
        TeamsList teamsList = gson.fromJson(rawDataTeams.toString(), TeamsList.class);
        PlayersList playersList = gson.fromJson(rawDataPlayers.toString(), PlayersList.class);

        //Accessing team data from TeamsList object
        Team[] teams = teamsList.getData();
        //Accessing player data from PlayerList object
        Player[] players = playersList.getData();

        //Print details for all teams
        if (teams != null)
        {
            for (Team team : teams)
            {
                System.out.println(team.toString());
            }
        }

        //Print details for all players
        if (players != null)
        {
            for(Player player : players)
            {
                System.out.println(player.toString());
            }
        }

    }
}
