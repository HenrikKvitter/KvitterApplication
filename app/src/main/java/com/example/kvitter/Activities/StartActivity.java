package com.example.kvitter.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kvitter.Activities.AddReceiptActivity;
import com.example.kvitter.Activities.LoginActivity;
import com.example.kvitter.Activities.MyAccountActivity;
import com.example.kvitter.Activities.MyReceiptActivity;
import com.example.kvitter.DatabaseLogic;
import com.example.kvitter.R;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        setListiners();
        DatabaseLogic logic = new DatabaseLogic();

    }
    private void setListiners() {
        findViewById(R.id.btn_account).setOnClickListener(this);
        findViewById(R.id.btn_addReceipt).setOnClickListener(this);
        findViewById(R.id.btn_myReceipt).setOnClickListener(this);
        findViewById(R.id.btn_logOut).setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        Button btn = (Button) v;

        switch (btn.getId()) {
            case R.id.btn_account: {
                Intent intent = new Intent(getApplicationContext(), MyAccountActivity.class);
                startActivity(intent);

                break;
            }
            case R.id.btn_addReceipt: {
                Intent intent = new Intent(getApplicationContext(), AddReceiptActivity.class);
                startActivity(intent);

                break;
            }
            case R.id.btn_myReceipt: {
                Intent intent = new Intent(getApplicationContext(), MyReceiptActivity.class);
                startActivity(intent);

                break;
            }
            case R.id.btn_logOut: {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
