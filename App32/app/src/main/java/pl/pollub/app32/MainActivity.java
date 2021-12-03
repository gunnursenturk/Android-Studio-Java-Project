package pl.pollub.app32;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    TextView tv1,tv2,tv3,tv4;
    private static final int REQUEST_CODE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.editTextTextPersonName);
        et2=findViewById(R.id.editTextTextPersonName2);
        tv1=findViewById(R.id.textView18);
        tv2=findViewById(R.id.textView19);
        tv3=findViewById(R.id.textView20);
        tv4=findViewById(R.id.textView21);

    }
    public void calculate(View v)
    {
        Float number1=Float.parseFloat(et1.getText().toString());
        Float number2=Float.parseFloat(et2.getText().toString());
        Intent i= new Intent(this,MainActivity2.class);
        i.putExtra("number1",number1);
        i.putExtra("number2",number2);
        startActivityForResult(i, REQUEST_CODE);

    }
    public void onActivityResult(int requestCode, int resultCode, Intent i){
        super.onActivityResult(requestCode, resultCode, i);
        if (resultCode == RESULT_OK && requestCode == REQUEST_CODE) {
            float number1=i.getFloatExtra("number1",0);
            float number2=i.getFloatExtra("number2",0);
            tv1.setText(String.valueOf(number1+number2));
            tv2.setText(String.valueOf(number1-number2));
            tv3.setText(String.valueOf(number1*number2));
            tv4.setText(String.valueOf(number1/number2));
        }
    }

}