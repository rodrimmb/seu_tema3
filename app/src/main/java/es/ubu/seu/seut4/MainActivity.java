package es.ubu.seu.seut4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final String LOG_TAG = "BUTTON_HANDLER";

    @BindView(R.id.main_label) TextView label;
    @BindView(R.id.btn_submit) Button btnSubmit;
    @BindView(R.id.btn_cancel) Button btnCancel;
    @BindView(R.id.input_text) EditText inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        label.setText(R.string.exercise_title);

        btnSubmit.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_submit) {
            launchActivity();
        }

        if (view.getId() == R.id.btn_cancel) {
            clearInputText();
            Toast.makeText(getApplicationContext(), "Has pulsado cancelar", Toast.LENGTH_SHORT).show();
        }
    }

    private void clearInputText() {
        if (!"".equals(inputText.getText().toString())) {
            Log.i(LOG_TAG, "Se borra el texto del input");
            inputText.setText("");
        }
    }

    private void launchActivity() {
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        startActivity(intent);
    }
}
