package com.example.foodorderingapp;// CheckoutActivity.java
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.example.foodorderingapp.R;

public class CartActivity extends AppCompatActivity {

    private EditText editTextItemName, editTextQuantity, editTextAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_cart);

        editTextItemName = findViewById(R.id.editTextItemName);
        editTextQuantity = findViewById(R.id.editTextQuantity);
        editTextAddress = findViewById(R.id.editTextAddress);

        Button btnShowPopup = findViewById(R.id.btnShowPopup);
        Button btnNextPage = findViewById(R.id.btnNextPage);

        // Button to Show Popup with Filled Information
        btnShowPopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFilledInformation();
            }
        });

        // Button to Go to Next Page (OrderSummaryActivity)
        btnNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNextPage();
            }
        });
    }

    private void showFilledInformation() {
        String itemName = editTextItemName.getText().toString().trim();
        String quantity = editTextQuantity.getText().toString().trim();
        String address = editTextAddress.getText().toString().trim();

        String message = "Item Name: " + itemName + "\nQuantity: " + quantity + "\nAddress: " + address;

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Filled Information");
        builder.setMessage(message);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }

    private void goToNextPage() {
        Intent intent = new Intent(CartActivity.this, ThankYouActivity.class);
        startActivity(intent);
    }
}
