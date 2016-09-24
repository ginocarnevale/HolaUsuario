package ar.com.fixcom.holausuario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;
    private Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtenemos una referencia a los controles de la interfaz
        txtNombre= (EditText)findViewById(R.id.txtNombre);
        btnAceptar=(Button)findViewById(R.id.btnAceptar);

        //Implementamos el evento click del boton
        btnAceptar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Creamos el Intent
                Intent intent= new Intent(MainActivity.this, SaludoActivity.class);

                //Creamos la informacion a pasar entre actividades
                Bundle b= new Bundle();
                b.putString("NOMBRE", txtNombre.getText().toString());

                //Añadimos la informacion al Intent
                intent.putExtras(b);

                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });


    }
}
