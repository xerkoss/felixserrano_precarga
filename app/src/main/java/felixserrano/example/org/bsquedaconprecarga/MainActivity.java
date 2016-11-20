package felixserrano.example.org.bsquedaconprecarga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TextWatcher {

    private TextView seleccion;

    private AutoCompleteTextView edit;
    private static final String[] items = {"En", "un", "lugar", "de", "la", "Mancha", "de", "cuyo", "nombre",
            "no", "quiero", "acordarme", "no", "ha", "mucho", "tiempo", "que", "vivía", "un", "hidalgo", "de", "los", "de"
            , "lanza", "en", "astillero", "adarga", "antigua", "rocín", "flaco", "y", "galgo", "corredor"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seleccion = (TextView)findViewById(R.id.seleccion);
        edit =(AutoCompleteTextView)findViewById(R.id.edit);
        edit.addTextChangedListener(this);
        edit.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,items));
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        seleccion.setText(edit.getText());
    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}
