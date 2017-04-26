package es.ubu.seu.seut3.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import es.ubu.seu.seut3.R;
import es.ubu.seu.seut3.model.User;

/**
 * Created by rodrigo on 23/04/17.
 */

public class UserAdapterButterKnife extends ArrayAdapter<User> {

    public UserAdapterButterKnife(Context context, List<User> elements) {
        super(context, R.layout.user_row, elements);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        ViewHolder viewHolder;
        if(convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_row, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.userName.setText(getItem(position).getName());
        viewHolder.userSurname.setText(getItem(position).getSurname());
        viewHolder.userPosition.setText(getItem(position).getPosition());
        viewHolder.userCompany.setText(getItem(position).getCompany());

        return convertView;
    }

    static class ViewHolder {
        @BindView(R.id.user_name_row) TextView userName;
        @BindView(R.id.user_surname_row) TextView userSurname;
        @BindView(R.id.user_position_row) TextView userPosition;
        @BindView(R.id.user_company_row) TextView userCompany;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
