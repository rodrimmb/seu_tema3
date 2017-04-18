package es.ubu.seu.seut4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

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

        View.OnClickListener clickHandler = new MainButtonsHandler(getApplicationContext(), inputText);

        btnSubmit.setOnClickListener(clickHandler);
        btnCancel.setOnClickListener(clickHandler);
    }
}
