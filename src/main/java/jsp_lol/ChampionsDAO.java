package jsp_lol;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChampionsDAO {

    public List<Champions> getAllChampions() {
        List<Champions> champions = new ArrayList<>();

        try (Connection conn = DBConnect.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM champions")) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                int blueEssenceCost = rs.getInt("blue_essence_cost");
                int rpCost = rs.getInt("rp_cost");

                Champions champion = new Champions(id, name, description, blueEssenceCost, rpCost);
                champions.add(champion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return champions;
    }
}
