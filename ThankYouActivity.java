package com.example.foodorderingapp;// ThankYouActivity.java
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.foodorderingapp.R;

public class ThankYouActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_thankyou);

        Button btnGoToFirstPage = findViewById(R.id.btnGoToFirstPage);

        // Button to Go to First Page (CheckoutActivity)
        btnGoToFirstPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToFirstPage();
            }
        });
    }

    private void goToFirstPage() {
        Intent intent = new Intent(ThankYouActivity.this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
        finish();
    }
}
