package com.example.login;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;
import java.util.List;

public class UserListActivity extends AppCompatActivity {
    private RecyclerView recyclerViewUserList;
    private UserListAdapter adapter;
    private List<User> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);

        recyclerViewUserList = findViewById(R.id.recyclerViewUserList);
        userList = new ArrayList<>();
        adapter = new UserListAdapter(userList);

        recyclerViewUserList.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewUserList.setAdapter(adapter);

        // Configurar o clique do botão "Adicionar Usuário"
        Button buttonAddUser = findViewById(R.id.buttonAddUser);
        buttonAddUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar a atividade de adição/edição de usuário
                Intent intent = new Intent(UserListActivity.this, AddEditUserActivity.class);
                startActivity(intent);
            }
        });
    }
}
