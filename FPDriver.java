import com.google.gson.Gson;
import java.net.*;
import java.util.*;

public class FPDriver
{
    public static void main(String[] args) throws Exception
    {
        //Calling the NBA API for tea ms.
        URL url = new URL("https://www.balldontlie.io/api/v1/teams");
        Scanner JsonScan = new Scanner(url.openStream());

        //Turning the raw data into a string
        StringBuilder rawData = new StringBuilder();
        while (JsonScan.hasNextLine())
        {
            rawData.append(JsonScan.nextLine());
        }

        //Printing for debugging
        System.out.println(rawData.toString());

        //Creating a gson object
        Gson gson = new Gson();
        TeamsList teamsList = gson.fromJson(rawData.toString(), TeamsList.class);

        //Accessing team data from TeamsList object
        Team[] teams = teamsList.getData();

        //Print details of each team
        if (teams != null)
        {
            for (Team team : teams)
            {
                System.out.println(team.toString());
            }
        }
    }
}
