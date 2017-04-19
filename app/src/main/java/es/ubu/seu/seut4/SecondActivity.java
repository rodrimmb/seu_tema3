package es.ubu.seu.seut4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SecondActivity extends AppCompatActivity {

    @BindView(R.id.elements_list) ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);
        String[] elements = {"Elemento 1","Elemento 2","Elemento 3","Elemento 4"};
        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, elements));
    }
}
