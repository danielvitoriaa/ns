package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.models.Drawer;
import com.example.myapplication.models.Machine;
import com.example.myapplication.models.Product;
import com.example.myapplication.models.User;

import java.util.ArrayList;

public class MachineActivity extends AppCompatActivity {

    private Machine machine;
    private User user;
    private ArrayList<Product> produtos;
    private Drawer drawer1;



    TextView textViewBalanceValue;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine);
        this.user = (User) getIntent().getSerializableExtra("user");
        Log.v("MachineActivityUser", String.valueOf(this.user.getBalance()));
        this.textViewBalanceValue = findViewById(R.id.text_view_balance_value);
        this.textViewBalanceValue.setText(String.valueOf(this.user.getBalance()));
        this.textViewBalanceValue.setTextColor(Color.parseColor("#FFFFFF"));
        if (this.user.alertBalance()) {
            this.textViewBalanceValue.setTextColor(Color.parseColor("#FF0000"));
        }

        machine = new Machine("Bacon", "Alho", "Ketchup", "Mostarda");
        this.buildMachine();

        // Product product1 = new Product("dada", "nome", 23, "2024-03-03");
        // Product product2 = new Product("dada", "nome", 23, "2024-03-03");
        // Product product3 = new Product("dada", "nome", 23, "2024-03-03");
        // this.produtos = new ArrayList<Product>();
        // produtos.add(product1);
        // produtos.add(product2);

        // this.drawer1 = new Drawer("bacon", produtos, 0);
        // Log.v("drawer1", drawer1.toString());
        // Log.v("drawer1", String.valueOf(drawer1.productsQuantity()));
    }

    private void buildMachine() {
        // criar produtos para a gaveta1
        Product product3 = new Product("037000184935", "bacon", 2, "2024-03-03");
        Product product4 = new Product("037000230045", "bacon", 2, "2024-03-03");

        this.machine.addProductToDrawer(0, product3);
        this.machine.addProductToDrawer(0, product4);

        Product product5 = new Product("0370001849399", "bacon", 2, "2024-03-03");
        Product product6 = new Product("03700023004555", "bacon", 2, "2024-03-03");

        this.machine.addProductToDrawer(1, product5);
        this.machine.addProductToDrawer(1, product6);

        Product product7 = new Product("0370001849311", "bacon", 2, "2024-03-03");
        this.machine.addProductToDrawer(2, product7);

        Product product8 = new Product("0370001849322", "bacon", 2, "2024-03-03");
        this.machine.addProductToDrawer(3, product8);



    }
    public void buyProduct1(View view){
        Log.v("qtdprod",String.valueOf(this.drawer1.productsQuantity()));
        this.drawer1.downloadProduct();
        Log.v("qtdprod",String.valueOf(this.drawer1.productsQuantity()));
        Toast.makeText(this, "Comprar 1", Toast.LENGTH_SHORT).show();
    }

    public void buyProduct2(View view){
        Toast.makeText(this, "Comprar 2", Toast.LENGTH_SHORT).show();
    }

    public void buyProduct3(View view){
        Toast.makeText(this, "Comprar 3", Toast.LENGTH_SHORT).show();
    }

    public void buyProduct4(View view){
        Toast.makeText(this, "Comprar 4", Toast.LENGTH_SHORT).show();
    }
}