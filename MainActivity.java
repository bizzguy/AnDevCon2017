package com.example.kaitlynanderson.coordinatorlayoutbehavior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bottomSheetButton = (Button) findViewById(R.id.button_coordinator1);
        bottomSheetButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.button_coordinator1:
                Intent intent = new Intent(this, BottomSheetActivity.class);
                startActivity(intent);
                break;
            case R.id.button_coordinator2:
                break;
            case R.id.button_coordinator3:
                break;
            case R.id.button_percent_relative_layout:
                break;
            case R.id.button_percent_to_constraint:
                break;
            case R.id.button_constraint_chain:
                break;
            case R.id.button_all_layouts:
                break;
        }
    }
}
