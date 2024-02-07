package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.models.User;

public class MainActivity extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = new User("ola@ola", "1234A", 300.0);
    }

    public void gotoToMachine(View view){
        Log.v("User", user.toString());
        EditText editTextEmail = findViewById(R.id.edit_text_email);
        String emailInput = editTextEmail.getText().toString();
        EditText editTextPassword = findViewById(R.id.edit_text_password);
        String passwordInput = editTextPassword.getText().toString();

        if(user.getEmail().equals(emailInput) && user.getPassword().equals(passwordInput )){
            Toast.makeText(this, "Bem Vindo: "+ this.user.getEmail(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MachineActivity.class);
            intent.putExtra("user", user);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Email ou pass errado", Toast.LENGTH_SHORT).show();
        }
    }
}