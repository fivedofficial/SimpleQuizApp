package www.fived.pk.simplequizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CategorySelection extends AppCompatActivity {

    Button category1, category2;

    public static String selectedcategory = "category1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_selection);


        category1 = (Button) findViewById(R.id.category1);
        category2 = (Button) findViewById(R.id.category2);



        category1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedcategory = "category1";
                startActivity(new Intent(CategorySelection.this, MainActivity.class));
            }
        });

        category2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedcategory = "category2";
                startActivity(new Intent(CategorySelection.this, MainActivity.class));
            }
        });



    }
}
