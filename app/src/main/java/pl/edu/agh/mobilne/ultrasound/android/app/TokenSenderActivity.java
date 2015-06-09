package pl.edu.agh.mobilne.ultrasound.android.app;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class TokenSenderActivity extends ActionBarActivity {

    private boolean isStarted = false;

    private Button startSendingButton;
    private Button stopSendingButton;
    private Button generateTokenButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_token_sender);

        startSendingButton = (Button) findViewById(R.id.startSendButton);
        stopSendingButton = (Button) findViewById(R.id.stopSendButton);
        generateTokenButton = (Button) findViewById(R.id.generateTokenButton);

        updateButtons();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void startSendingToken(View view) {
        isStarted = true;

        updateButtons();
    }

    public void stopSendingToken(View view) {
        isStarted = false;

        updateButtons();
    }

    public void generateToken(View view) {
    }

    private void updateButtons() {
        startSendingButton.setEnabled(!isStarted);
        stopSendingButton.setEnabled(isStarted);
        generateTokenButton.setEnabled(!isStarted);
    }
}