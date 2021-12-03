package pl.pollub.app32;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tv1,tv2;
    float n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv1=findViewById(R.id.textView16);
        tv2=findViewById(R.id.textView17);
        n1=getIntent().getFloatExtra("number1",0);
        n2=getIntent().getFloatExtra("number2",0);
        tv1.setText(String.valueOf(n1));
        tv2.setText(String.valueOf(n2));
    }
    public void finish() {
        Intent i = new Intent();
        i.putExtra("number1", n1);
        i.putExtra("number2", n2);
        setResult(RESULT_OK, i);
        super.finish();
    }
}