package com.example.foodorderingapp;// MenuActivity.java
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.foodorderingapp.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_menu);

        ListView listViewMenu = findViewById(R.id.listViewMenu);
        Button btnCart = findViewById(R.id.btnCart);


        // Sample list of food item names
        String[] foodItems = {"Nepolian Pizza (600/-) Code : 01", "Lunch Thali (300/-) Code : 02", "Coke (20/-) Code : 03", "Ice cream (50/-) Code : 04"};

        // Create an ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, foodItems);

        // Set the adapter to the ListView
        listViewMenu.setAdapter(adapter);


        // ListView item click listener
        listViewMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = foodItems[position];
                Toast.makeText(MenuActivity.this, "Selected: " + selectedItem, Toast.LENGTH_SHORT).show();
                // You can add more actions here when a menu item is clicked

            }
        });

        // Button click listeners
        btnCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to CartActivity
                Intent intent = new Intent(MenuActivity.this, CartActivity.class);
                startActivity(intent);
            }
        });


    }
}
