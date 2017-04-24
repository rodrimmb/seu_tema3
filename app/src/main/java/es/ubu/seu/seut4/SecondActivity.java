package es.ubu.seu.seut4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;
import es.ubu.seu.seut4.adapters.UserArrayAdapterFactory;
import es.ubu.seu.seut4.services.UserService;

public class SecondActivity extends AppCompatActivity {

    @BindView(R.id.elements_list) ListView listView;

    private UserService userService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);

        userService = new UserService();
        listView.setAdapter(
                UserArrayAdapterFactory.getArrayAdapterWithAndroidNative(
                        getApplicationContext(),
                        userService.getAllUsers()
                )
        );
    }
}
