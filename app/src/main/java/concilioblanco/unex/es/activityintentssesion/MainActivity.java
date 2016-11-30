package concilioblanco.unex.es.activityintentssesion;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*Ciclo de Vida
        https://developer.android.com/images/activity_lifecycle.png?hl=es-419
        https://developer.android.com/guide/components/activities.html?hl=es-419#Lifecycle

      Restauracion de una Activity
        https://developer.android.com/images/training/basics/basic-lifecycle-savestate.png?hl=es-419

      Intents
        https://developer.android.com/images/components/intent-filters@2x.png
        https://developer.android.com/guide/components/intents-filters.html
     */

    private static final String TAG = "TAG_MainActivity";
    private static final String BACK_KEY = "restaurar";
    private static final String URL = "https://twitter.com/epcc_techhouse";

    private EditText mEditText;
    private TextView mTextView;
    private Button mButtonSaveText;
    private Button mButtonExplicit;
    private Button mButtonImplicit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG,"onCreate()");
        //TODO: esos atibutos de arriba no se van a referenciar solos :/

        //TODO: bottones -> acciones

        //TODO: Porque pierdo mi texto? :_(

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
    public void onSaveInstanceState(Bundle savedInstanceState) {
        Log.i(TAG,"onSaveInstanceState()");
        //TODO: guardamos lo que no queremos perder

    }

    /*
    @Override
    public void onRestoreInstanceState (Bundle savedInstanceState){
        Log.i(TAG,"onRestoreInstanceState()");
        super.onRestoreInstanceState(savedInstanceState);
    }
    */

    private void saveText(){
        String text = mEditText.getText().toString();
        mTextView.setText(text);
    }

    private void explicitActivation(){
        //TODO: Intent Explicito

    }

    private void implicitActivation(){
        //TODO: Intent Implicito

    }

}
