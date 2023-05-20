package com.example.taskperformance;



        import androidx.appcompat.app.AppCompatActivity;


        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText text1;
    EditText text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button_check);
        text1 = (EditText) findViewById(R.id.first_string_edit_text);
        text2 = (EditText) findViewById(R.id.second_string_edit_text);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                Intent i = new Intent(getApplicationContext(), layout2.class);
                String fir = text1.getText().toString();
                String sec = text2.getText().toString();
                if (fir.equalsIgnoreCase(sec)) {
                    i.putExtra("same", "THE SAME");
                    startActivity(i);

                } else {
                    i.putExtra("same", "NOT THE SAME");
                    startActivity(i);
                }
            }
        });
    }
    public void onSwap (View view){
        text1 = (EditText) findViewById(R.id.first_string_edit_text);
        text2 = (EditText) findViewById(R.id.second_string_edit_text);
        String getFirstString = String.valueOf(text1.getText());
        String getSecondString = String.valueOf(text2.getText());
        text1.setText(getSecondString);
        text2.setText(getFirstString);
    }
}
