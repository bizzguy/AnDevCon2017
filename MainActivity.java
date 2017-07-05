package com.example.kaitlynanderson.coordinatorlayoutbehavior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button bottomSheetButton = (Button) findViewById(R.id.button_coordinator1);
        Button customBottomSheetButton = (Button) findViewById(R.id.button_coordinator2);
        Button collapsingToolbarButton = (Button) findViewById(R.id.button_coordinator3);
        Button percentRelativeLayout = (Button) findViewById(R.id.button_percent_relative_layout);
        Button percentToConstraintButton = (Button) findViewById(R.id.button_percent_to_constraint);
        Button constraintChainButton = (Button) findViewById(R.id.button_constraint_chain);
        Button allTheLayoutsButton = (Button) findViewById(R.id.button_all_layouts);

        bottomSheetButton.setOnClickListener(this);
        customBottomSheetButton.setOnClickListener(this);
        collapsingToolbarButton.setOnClickListener(this);
        percentRelativeLayout.setOnClickListener(this);
        percentToConstraintButton.setOnClickListener(this);
        constraintChainButton.setOnClickListener(this);
        allTheLayoutsButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch(id) {
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
