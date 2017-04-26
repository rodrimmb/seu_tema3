package es.ubu.seu.seut3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import es.ubu.seu.seut3.adapters.recycler.RecyclerUserAdapter;
import es.ubu.seu.seut3.model.User;
import es.ubu.seu.seut3.services.UserService;

public class SecondActivity extends AppCompatActivity {

    @BindView(R.id.elements_list) RecyclerView listView;
    @BindView(R.id.btn_add_user) Button addUser;

    private UserService userService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);

        userService = new UserService();
        listView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        listView.setAdapter(new RecyclerUserAdapter(userService));
        addUser.setOnClickListener(new AddUserClickHandler());
    }

    private class AddUserClickHandler implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.btn_add_user) {
                addNewUser(new Integer(userService.getCount()));
                listView.getAdapter().notifyDataSetChanged();
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
