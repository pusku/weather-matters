package weathermatters.puskuuu.com.weathermatters.Model;

/**
 * Created by user on 4/3/2017.
 */

public class Weather {
    private int id;
    private String description;
    private String icon;

    public Weather(int id, String description, String icon) {
        this.id = id;
        this.description = description;
        this.icon = icon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}

