package concilioblanco.unex.es.activityintentssesion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdWithBackActivity extends AppCompatActivity {

    private static final String TAG = "TAG_ThirdBackActivity";

    private TextView mTextViewCounter;
    private Button mButtonIncrement;
    private Button mButtonBack;

    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_with_back);
        Log.i(TAG,"onCreate()");

        mTextViewCounter = (TextView) findViewById(R.id.textView_counter_3b);
        mButtonIncrement = (Button) findViewById(R.id.button_increment_3b);
        mButtonBack = (Button) findViewById(R.id.button_back_3b);
        mButtonIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                mTextViewCounter.setText(String.valueOf(counter));
            }
        });
        mButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();
            }
        });

        //TODO: recuperar ese extra del intent

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        // The activity is about to become visible (from "stopped").
        Log.i(TAG,"onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        // The activity is about to become visible.
        Log.i(TAG,"onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        // The activity has become visible (it is now "resumed").
        Log.i(TAG,"onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Another activity is taking focus (this activity is about to be "paused").
        Log.i(TAG,"onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        // The activity is no longer visible (it is now "stopped")
        Log.i(TAG,"onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // The activity is about to be destroyed.
        Log.i(TAG,"onDestroy()");
    }

    private void back(){
        //TODO: devolvemos el contador - RESULT_OK - finish()

    }

}
