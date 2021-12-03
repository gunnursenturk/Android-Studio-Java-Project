package pl.pollub.app41;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    double cal,x;
    TextView tv;
    EditText et;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=findViewById(R.id.textView);
        et=findViewById(R.id.editTextTextPersonName);
        Toolbar myToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

    }

    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.CelsiustoFahrenheit:
                cal=9*x/5+32;
                return true;
            case R.id.CelsiustoKelvin:
                cal=x+273.15;
                return true;
            case R.id.FahrenheittoCelsius:
                cal=5*(x-32)/9;
            case R.id.FahrenheittoKelvin:
                cal=(x+359.67)*5/9;
            case R.id.KelvintoCelsius:
                cal=x-273.15;
            case R.id.KelvintoFahrenheit:
                cal=9*x/5-459.67;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void calculate(View v){
        double a=Double.parseDouble(et.getText().toString());
        tv.setText(String.valueOf(cal));




    }

}