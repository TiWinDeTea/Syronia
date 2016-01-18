package tiwindetea.syronia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Syronia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syronia);

        TextView text = new TextView(this);
        text.setText("test");
        setContentView(text);
    }
}
