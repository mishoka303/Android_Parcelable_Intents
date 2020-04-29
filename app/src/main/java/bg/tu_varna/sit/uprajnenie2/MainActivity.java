package bg.tu_varna.sit.uprajnenie2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    final String person_key = "Person";
    Person person;

    Button button;
    EditText name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.button1);
        name = findViewById(R.id.name);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Parsing String To Integer

                String name_temp = name.getText().toString();

                person = new Person();
                person.set_name(name_temp);

                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra(person_key, person);
                startActivity(intent);
            }
        });
    }
}
