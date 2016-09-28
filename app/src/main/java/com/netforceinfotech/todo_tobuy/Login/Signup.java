package com.netforceinfotech.todo_tobuy.Login;

import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;

import com.netforceinfotech.todo_tobuy.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class Signup extends AppCompatActivity {

    @InjectView(R.id.f_name)
    EditText f_name;
    @InjectView(R.id.l_name)
    EditText l_name;
    @InjectView(R.id.spin_country)
    Spinner spin_country;
    @InjectView(R.id.spin_state)
    Spinner spin_state;
    @InjectView(R.id.email_id)
    EditText email_id;
    @InjectView(R.id.username)
    EditText username;
    @InjectView(R.id.password)
    EditText password;
    @InjectView(R.id.conf_password)
    EditText conf_password;
    @InjectView(R.id.signup)
    ImageView signup;
    @InjectView(R.id.already_login)
    RelativeLayout already_login;

    String countrylist[] = {"Country"};

    String statelist[] = {"State"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Window window = getWindow();

// clear FLAG_TRANSLUCENT_STATUS flag:
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            // only for gingerbread and newer versions
            window.setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.greentranparent));
        }

        ButterKnife.inject(this);

    }



    private void setspinner() {


        // country spinner
        ArrayAdapter<String> spinnerArrayAdapter_country = new ArrayAdapter<String>(this, R.layout.spinnertext, countrylist); //selected item will look like a spinner set from XML
        spinnerArrayAdapter_country.setDropDownViewResource(R.layout.spinnertext);
        spin_country.setAdapter(spinnerArrayAdapter_country);


        // state spinner

        ArrayAdapter<String> spinnerArrayAdapter_state = new ArrayAdapter<String>(this, R.layout.spinnertext, statelist); //selected item will look like a spinner set from XML
        spinnerArrayAdapter_state.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_state.setAdapter(spinnerArrayAdapter_state);


    }
}
