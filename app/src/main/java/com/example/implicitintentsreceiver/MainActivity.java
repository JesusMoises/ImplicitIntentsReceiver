package com.example.implicitintentsreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //obtenemos el intent que se usó para activar el onCreate
        Intent intent = getIntent();
        //obtenemos los datos del intent
        Uri uri = intent.getData();
        //verificamos que la uri no sea null
        if (uri != null){
            //obtenemos el objeto uri y lo parseamos a string
            String uri_string = "URI: " + uri.toString();
            //creamos un txtView donde obtenemos el editText del activity_main.xml donde posteriormente se pondrá la url
            TextView textView = findViewById(R.id.text_uri_message);
            //colocamos el url que queremos abrir en el intent implicito que recibe
            textView.setText(uri_string);
        }//fin del if
    }//fin del método onCreate

}//fin de la clase MainActivity