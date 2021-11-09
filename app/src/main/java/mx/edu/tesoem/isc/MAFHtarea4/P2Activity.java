package mx.edu.tesoem.isc.MAFHtarea4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class P2Activity extends AppCompatActivity {

    EditText txtcontra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2);

        txtcontra = findViewById(R.id.txtcontra);
    }

    public void onclic(View v){
        String pass = "Android2021";
        if (pass.equals(txtcontra.getText().toString())){
            Intent intent = new Intent(this, P3Activity.class);
            startActivity(intent);
            finish();
        } else{
            Toast.makeText(this, "error de contraseña", Toast.LENGTH_LONG).show();
        }
    }
}