package es.ubu.seu.seut4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;
import es.ubu.seu.seut4.adapters.UserArrayAdapterFactory;
import es.ubu.seu.seut4.model.User;
import es.ubu.seu.seut4.services.UserService;

public class SecondActivity extends AppCompatActivity {

    @BindView(R.id.elements_list) ListView listView;
    @BindView(R.id.btn_add_user) Button addUser;

    protected UserService userService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);

        userService = new UserService();
        listView.setAdapter(
                UserArrayAdapterFactory.getArrayAdapterWithButterKnife(
                        getApplicationContext(),
                        userService.getAllUsers()
                )
        );
        addUser.setOnClickListener(new AddUserClickHandler());
    }

    private class AddUserClickHandler implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.btn_add_user) {
                ArrayAdapter<User> adapter = (ArrayAdapter) listView.getAdapter();
                addNewUser(new Integer(listView.getCount()));
                adapter.notifyDataSetChanged();
            }
        }

        private void addNewUser(Integer numberOfElements){
            userService.addUser(
                    new User(
                            Long.getLong(numberOfElements.toString()),
                            "Nombre"+numberOfElements,
                            "Apellidos"+numberOfElements,
                            "Alumno",
                            "Universidad de Burgos"
                    )
            );
        }
    }
}
