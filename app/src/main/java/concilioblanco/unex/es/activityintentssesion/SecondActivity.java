package concilioblanco.unex.es.activityintentssesion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "TAG_SecondActivity";
    public static final String EXTRA_KEY = "contadorACtual";
    private static final int GET_REQUEST_CODE = 986;

    private TextView mTextViewCounter;
    private Button mButtonIncrement;
    private Button mButtonSimpleIntent;
    private Button mButtonForResultIntent;
    private Button mButtonBack;

    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i(TAG,"onCreate()");

        mTextViewCounter = (TextView) findViewById(R.id.textView_counter);
        mButtonIncrement = (Button) findViewById(R.id.button_increment);
        mButtonSimpleIntent = (Button) findViewById(R.id.button_simpleIntent);
        mButtonForResultIntent = (Button) findViewById(R.id.button_forResultIntent);
        mButtonBack = (Button) findViewById(R.id.button_back);
        mButtonIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                mTextViewCounter.setText(String.valueOf(counter));
            }
        });
        mButtonSimpleIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleIntent();
            }
        });
        mButtonForResultIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forResultIntent();
            }
        });
        mButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        counter = 0;
        mTextViewCounter.setText(String.valueOf(counter));
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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        Log.i(TAG, "onActivityResult()");
        //TODO: devolviendo resultados...

    }

    private void simpleIntent(){
        //TODO: intent explicito simple

    }

    private void forResultIntent(){
        //TODO: intent explicito simple con resultCode

    }

}
