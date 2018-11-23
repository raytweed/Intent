package application.android.example.com.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txt,addre,phn;
    Button click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=findViewById(R.id.enter);
        addre=findViewById(R.id.ansh);
        phn=findViewById(R.id.phone);
        click=findViewById(R.id.click);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=txt.getText().toString();
                String b=addre.getText().toString();
                String c=phn.getText().toString();
                Intent i=new Intent(MainActivity.this,Secong_Activity.class);
                i.setAction(Intent.ACTION_SEND);
                i.putExtra("address",b);
                i.putExtra("Phone",c);
                i.putExtra("Enter_text",a);
                startActivity(i);
            }
        });
    }
}
