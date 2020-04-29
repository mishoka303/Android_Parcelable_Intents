package bg.tu_varna.sit.uprajnenie2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {
    final String person_key = "Person";

    Button button2;
    EditText age, address, city, dobirth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        button2 = findViewById(R.id.button2);
        age = findViewById(R.id.age);
        address = findViewById(R.id.address);
        city = findViewById(R.id.city);
        dobirth = findViewById(R.id.birthdate);

        //collect our intent
        Intent intent = getIntent();
        final Person person = intent.getParcelableExtra(person_key);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Create promenlivi + adding in class
                Integer tmp_age = Integer.parseInt(age.getText().toString());
                String tmp_address = address.getText().toString();
                String tmp_city = city.getText().toString();
                String tmp_dobirth = dobirth.getText().toString();

                person.set_age(tmp_age);
                person.set_address(tmp_address);
                person.set_city(tmp_city);
                person.set_dobirth(tmp_dobirth);

                Intent intent = new Intent(Activity2.this, Activity3.class);
                intent.putExtra(person_key, person);
                startActivity(intent);
            }
        });
    }
}
