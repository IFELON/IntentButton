package com.example.suriya.intentbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class IntentButton extends AppCompatActivity implements View.OnClickListener {

     Button b1,b2,b3,b4;
     ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_button);

        b1=findViewById(R.id.bt1);
        b2=findViewById(R.id.bt2);
        b3=findViewById(R.id.bt3);
        b4=findViewById(R.id.bt4);
        im=findViewById(R.id.image);


                b1.setOnClickListener(this);
                b2.setOnClickListener(this);
                b3.setOnClickListener(this);
                b4.setOnClickListener( this);

    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.bt1){
            im.setImageResource(R.drawable.rasmalai);
        }
       else if(view.getId()==R.id.bt2){
            im.setImageResource(R.drawable.cake);

        }
       else if(view.getId()==R.id.bt3){
            im.setImageResource(R.drawable.utuppam);
        }
        else if (view.getId()==R.id.bt4){
            Intent i =new Intent(IntentButton.this,SecondButton.class);
            startActivity(i);
            Toast.makeText(getApplicationContext(),"Meals Ready To Eat",Toast.LENGTH_LONG).show();

        }
    }
    private void TestUpload(){
        int i = 1+1;
    }
}
