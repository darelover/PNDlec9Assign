package com.example.atulsachdeva.pndlec9assign;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by AtulSachdeva on 18/09/17.
 */

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.UserViewHolder> {

    ArrayList<User> users = new ArrayList<>();
    Context context;
    FragmentManager fragmentManager;

    public UsersAdapter(ArrayList<User> users, Context context, FragmentManager fragmentManager) {
        this.users = users;
        this.context = context;
        this.fragmentManager = fragmentManager;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        return new UserViewHolder(inflater.inflate(R.layout.list_item_face, parent, false));
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, final int position) {
        holder.bindView(users.get(position));

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder {

        ImageView ivFace;

        public UserViewHolder(View itemView) {
            super(itemView);
            ivFace = itemView.findViewById(R.id.ivFace);
        }

        void bindView(final User thisUser) {

            ivFace.setImageResource(thisUser.getFaceId());

            final UserDetailsFragment userDetailsFragment = new UserDetailsFragment();


            ivFace.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    FragmentTransaction transaction = fragmentManager.beginTransaction();

                    Bundle bundle = new Bundle();
                    bundle.putInt("FaceId", thisUser.getFaceId());
                    bundle.putString("Name", thisUser.getName());
                    bundle.putString("Dob", thisUser.getDob());
                    bundle.putString("Email", thisUser.getEmail());
                    userDetailsFragment.setArguments(bundle);

                    transaction.replace(R.id.flFragContainer, userDetailsFragment).commit();
                }
            });
        }

    }
}
