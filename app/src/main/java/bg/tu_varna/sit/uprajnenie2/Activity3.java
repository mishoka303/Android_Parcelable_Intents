package bg.tu_varna.sit.uprajnenie2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
    final String person_key = "Person";

    TextView name,age,address,city,dobirth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        Intent intent = getIntent();
        Person person = intent.getParcelableExtra(person_key);

        name = findViewById(R.id.name_result);
        age = findViewById(R.id.age_result);
        address = findViewById(R.id.address_result);
        city = findViewById(R.id.city_result);
        dobirth = findViewById(R.id.dobirth_result);

        name.setText(person.get_name());
        age.setText(String.valueOf(person.get_age()));
        address.setText(person.get_address());
        city.setText(person.get_city());
        dobirth.setText(person.get_dobirth());
    }
}
