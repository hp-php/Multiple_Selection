package com.example.demomultipleselection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<UserModel> users = new ArrayList<>();
    UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        users.add(new UserModel("A", false));
        users.add(new UserModel("B", false));
        users.add(new UserModel("C", false));
        users.add(new UserModel("D", false));
        users.add(new UserModel("E", false));
        users.add(new UserModel("q", false));
        users.add(new UserModel("w", false));
        users.add(new UserModel("w", false));
        users.add(new UserModel("w", false));
        users.add(new UserModel("w", false));
        users.add(new UserModel("w", false));
        users.add(new UserModel("w", false));
        users.add(new UserModel("w", false));
        users.add(new UserModel("w", false));
        users.add(new UserModel("A", false));
        users.add(new UserModel("B", false));
        users.add(new UserModel("C", false));
        users.add(new UserModel("D", false));
        users.add(new UserModel("E", false));
        users.add(new UserModel("q", false));
        users.add(new UserModel("w", false));
        users.add(new UserModel("w", false));
        users.add(new UserModel("w", false));
        users.add(new UserModel("w", false));
        users.add(new UserModel("w", false));
        users.add(new UserModel("w", false));
        users.add(new UserModel("w", false));
        users.add(new UserModel("w", false));
        users.add(new UserModel("A", false));
        users.add(new UserModel("B", false));
        users.add(new UserModel("C", false));
        users.add(new UserModel("D", false));
        users.add(new UserModel("E", false));
        users.add(new UserModel("q", false));
        users.add(new UserModel("w", false));
        users.add(new UserModel("w", false));
        users.add(new UserModel("w", false));
        users.add(new UserModel("w", false));
        users.add(new UserModel("w", false));
        users.add(new UserModel("w", false));
        users.add(new UserModel("w", false));
        users.add(new UserModel("w", false));

        userAdapter = new UserAdapter(users);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setAdapter(userAdapter);

    }

    public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
        private List<UserModel> listdata;

        // RecyclerView recyclerView;
        public UserAdapter(List<UserModel> listdata) {
            this.listdata = listdata;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
            ViewHolder viewHolder = new ViewHolder(listItem);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {
            UserModel myListData = getItem(position);

            holder.checkBox3.setText(myListData.getName());

            holder.checkBox3.setChecked(myListData.isSelected());

            holder.checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    myListData.setSelected(b);
                    notifyDataSetChanged();
                }
            });
        }

        @Override
        public int getItemViewType(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        public UserModel getItem(int position){
            return listdata.get(position);
        }

        public int getItemCount() {
            return listdata.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            CheckBox checkBox3;

            public ViewHolder(View itemView) {
                super(itemView);
                checkBox3 = itemView.findViewById(R.id.checkBox3);

                this.setIsRecyclable(true);
            }
        }
    }
}