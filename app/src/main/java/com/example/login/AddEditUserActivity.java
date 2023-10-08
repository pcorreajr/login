package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddEditUserActivity extends AppCompatActivity {
    private EditText editTextName;
    private EditText editTextUsername;
    private EditText editTextPassword;
    // Adicione mais campos de acordo com suas necessidades

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit_user);

        editTextName = findViewById(R.id.editTextName);
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        // Inicialize outros campos conforme necessário

        Button buttonSaveUser = findViewById(R.id.buttonSaveUser);
        buttonSaveUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aqui você pode salvar os dados do usuário
                // Por exemplo, fazer uma chamada à API para criar ou atualizar um usuário
                // Em seguida, você pode voltar para a atividade de lista de usuários
                finish();
            }
        });
    }
}
