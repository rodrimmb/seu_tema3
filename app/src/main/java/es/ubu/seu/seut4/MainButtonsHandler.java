package es.ubu.seu.seut4;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by rodrigo on 18/04/17.
 */

public class MainButtonsHandler implements View.OnClickListener {

    private final String LOG_TAG = "BUTTON_HANDLER";

    private Context context;
    private EditText inputText;

    public MainButtonsHandler(Context context, EditText inputText){
        this.context = context;
        this.inputText = inputText;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_submit){
            launchActivity();
        }

        if(v.getId() == R.id.btn_cancel){
            clearInputText();
            Toast.makeText(context, "Has pulsado cancelar", Toast.LENGTH_SHORT).show();
        }
    }

    private void clearInputText(){
        if(!"".equals(inputText.getText().toString())){
            Log.i(LOG_TAG, "Se borra el texto del input");
            inputText.setText("");
        }
    }

    private void launchActivity() {
        Intent intent = new Intent(context, SecondActivity.class);
        context.startActivity(intent);
    }
}
