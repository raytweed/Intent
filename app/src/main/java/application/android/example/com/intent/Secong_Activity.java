package application.android.example.com.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Secong_Activity extends AppCompatActivity {
    TextView tor,address,phn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        tor=findViewById(R.id.tor);
        address=findViewById(R.id.address);
        phn=findViewById(R.id.phn);
        Intent on=getIntent();
        String Extra_txt=on.getStringExtra("Enter_text");
        String b=on.getStringExtra("address");
        String c=on.getStringExtra("Phone");
        tor.setText(Extra_txt);
        address.setText(b);
        phn.setText(c);
        getSupportActionBar().setTitle(Extra_txt);

    }
}
