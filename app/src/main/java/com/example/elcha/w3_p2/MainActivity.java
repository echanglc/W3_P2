package com.example.elcha.w3_p2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.SeekBar;
public class MainActivity extends AppCompatActivity {
    private SeekBar sbpercent;
    private TextView tvamount,tvtip,tvpercent,tvtotal,tvtipamount,tvtotalamount;
    private EditText txtamount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sbpercent = (SeekBar)findViewById(R.id.sbpercent);
        tvamount = (TextView)findViewById(R.id.tvamount);
        tvtip = (TextView)findViewById(R.id.tvtip);
        tvpercent = (TextView)findViewById(R.id.tvpercent);
        tvtotal = (TextView)findViewById(R.id.tvtotal);
        tvtipamount = (TextView)findViewById(R.id.tvtipamount);
        tvtotalamount = (TextView)findViewById(R.id.tvtotalamount);
        txtamount = (EditText)findViewById(R.id.txtamount);


        sbpercent.setMax(25);
        sbpercent.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                double amount = Double.parseDouble(txtamount.getText().toString());
                tvpercent.setText(String.valueOf(i) + '%');
                double i1 = (double) i;
                double amount1 = amount * (i1/100.00);
                tvtipamount.setText("$" + amount1);
                double total = amount + amount1;
                tvtotalamount.setText("$" + total);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



    }
}
