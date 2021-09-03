package personal.app.partedosactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText monto;
    EditText porcentaje;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monto = (EditText)findViewById(R.id.txbMonto);
        porcentaje = (EditText)findViewById(R.id.txbPorcentaje);
        resultado = (TextView)findViewById(R.id.txtResultado);
    }

    public void Calcular(View view){
        if (view.getId()==R.id.btnCalcular){
            double mont = Double.parseDouble(monto.getText().toString());
            double porcen = Double.parseDouble((porcentaje.getText().toString()));
            double interes = mont*(porcen/100);
            double montoNeto = mont+interes;

            resultado.setText("Interes: "+interes+"\n"+"Monto neto: "+montoNeto);

        }
    }
}