package com.example.a2ferga42.mapping6;

/**
 * Created by 2ferga42 on 22/02/2018.
 */

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SetLocationActivity extends AppCompatActivity implements OnClickListener{


        public void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_set_location);

            Button setLocation = (Button)findViewById(R.id.btnRegular);
            setLocation.setOnClickListener(this);
        }

        public void onClick(View view)
        {
            EditText set_lat = (EditText)findViewById(R.id.et1);
            EditText set_long = (EditText)findViewById(R.id.et2);
            double latitude = Double.parseDouble(set_lat.getText().toString());
            double longitude = Double.parseDouble(set_long.getText().toString());

            Intent intent = new Intent();
            Bundle bundle = new Bundle();

            bundle.putDouble("com.example.set_lat", latitude);
            bundle.putDouble("com.example.set_long", longitude);
            intent.putExtras(bundle);
            setResult(RESULT_OK,intent);
            finish();

        }



}
