package weathermatters.puskuuu.com.weathermatters;

import android.os.AsyncTask;

import org.json.JSONObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by user on 4/3/2017.
 */

public class DownloadTask extends AsyncTask<String,Void,String> {

    @Override
    protected  String doInBackground(String... urls){
        String result="";
        URL url;
        HttpURLConnection urlConnection= null;

        try{
            url= new URL(urls[0]);

            urlConnection =(HttpURLConnection) url.openConnection();
            InputStream in= urlConnection.getInputStream();
            InputStreamReader reader = new InputStreamReader(in);
            int data = reader.read();
            while(data!=-1){
                char current =(char) data;

                result+=current;

                data= reader.read();
            }
            return result;

        } catch(Exception e){
            e.printStackTrace();
        }

        return null;

    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        try {
            JSONObject jsonObject = new JSONObject(result);

            JSONObject weatherData= new JSONObject(jsonObject.getString("main"));
            Double temperature= Double.parseDouble((String) weatherData.get("temp"));
            double temperatureInt=(int) (temperature-273);
            String place = jsonObject.getString("name");
            MainActivity.temperatureText.setText(   String.valueOf(temperatureInt));
            MainActivity.placeText.setText(place);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
