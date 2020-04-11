package net.rusoil.carparking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Registration extends AppCompatActivity {
EditText date,name,num,mark; TextView place;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        date = findViewById(R.id.rdate);
        name = findViewById(R.id.cname);
        num = findViewById(R.id.rnum);
        mark = findViewById(R.id.mark);
        place = findViewById(R.id.place);
    }
    // генерация номера парковочного места
    public void setPlace(View v){
        place.setText(Integer.toString((int)(Math.random()*MainActivity.COUNT_PLACES)));
    //добавить проверку, свободно ли назначенное место.
    //если занято, то сгенерировать новое, чтобы было свободно
    }
    //отправка данных регистрации
     public void send(View v){
         ArrayList<String> data = new ArrayList<>(5);
        data.add(date.getText().toString());
        data.add(name.getText().toString());
        data.add(num.getText().toString());
        data.add(mark.getText().toString());
        data.add(place.getText().toString());
        Intent i = new Intent();
        i.putStringArrayListExtra("answer",data);
        setResult(RESULT_OK,i);
        finish();
    }
}
