package es.ubu.seu.seut3.adapters;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

import es.ubu.seu.seut3.model.User;

/**
 * Created by rodrigo on 24/04/17.
 */

public class UserArrayAdapterFactory {

    public static ArrayAdapter<User> getArrayAdapterWithButterKnife(Context context, List<User> users){
        return new UserAdapterButterKnife(context, users);
    }

    public static ArrayAdapter<User> getArrayAdapterWithAndroidNative(Context context, List<User> users){
        return new UserAdapter(context, users);
    }
}
