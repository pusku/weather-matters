package weathermatters.puskuuu.com.weathermatters.Model;

/**
 * Created by user on 4/3/2017.
 */

public class Sys {
    private int type;
    private double message;
    private String country;
    private double sunrise;
    private double sunset;

    public Sys(int type, double message, String country, double sunrise, double sunset) {
        this.type = type;
        this.message = message;
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getSunrise() {
        return sunrise;
    }

    public void setSunrise(double sunrise) {
        this.sunrise = sunrise;
    }

    public double getSunset() {
        return sunset;
    }

    public void setSunset(double sunset) {
        this.sunset = sunset;
    }
}
