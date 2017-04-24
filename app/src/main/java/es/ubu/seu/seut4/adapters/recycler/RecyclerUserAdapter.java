package es.ubu.seu.seut4.adapters.recycler;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import es.ubu.seu.seut4.R;
import es.ubu.seu.seut4.model.User;
import es.ubu.seu.seut4.services.UserService;

/**
 * Created by rodrigo on 24/04/17.
 */

public class RecyclerUserAdapter extends RecyclerView.Adapter<RecyclerUserAdapter.UserViewHolder> {

    private UserService userService;

    public RecyclerUserAdapter(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_row, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        holder.paint(userService.findByPosition(position));
    }

    @Override
    public int getItemCount() {
        return userService.getCount();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.user_name_row) TextView userName;
        @BindView(R.id.user_surname_row) TextView userSurname;
        @BindView(R.id.user_position_row) TextView userPosition;
        @BindView(R.id.user_company_row) TextView userCompany;

        public UserViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void paint(User user) {
            userName.setText(user.getName());
            userName.setTextColor(Color.RED);
            userSurname.setText(user.getSurname());
            userPosition.setText(user.getPosition());
            userCompany.setText(user.getCompany());
        }
    }
}
