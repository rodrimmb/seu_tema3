package es.ubu.seu.seut4.adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import es.ubu.seu.seut4.R;
import es.ubu.seu.seut4.model.User;

/**
 * Created by rodrigo on 24/04/17.
 */

public class UserAdapter extends ArrayAdapter<User> {

    public UserAdapter(Context context, List<User> elements) {
        super(context, R.layout.user_row, elements);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_row, parent, false);
        }

        setRowValues(position, convertView);

        return convertView;
    }

    private void setRowValues(int position, @Nullable View convertView) {
        TextView userName = (TextView) convertView.findViewById(R.id.user_name_row);
        TextView userSurname = (TextView) convertView.findViewById(R.id.user_surname_row);
        TextView userPosition = (TextView) convertView.findViewById(R.id.user_position_row);
        TextView userCompany = (TextView) convertView.findViewById(R.id.user_company_row);

        userName.setText(getItem(position).getName());
        userName.setTextColor(Color.BLUE);
        userSurname.setText(getItem(position).getSurname());
        userPosition.setText(getItem(position).getPosition());
        userCompany.setText(getItem(position).getCompany());
    }
}
