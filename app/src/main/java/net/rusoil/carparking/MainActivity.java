package net.rusoil.carparking;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
public static final int CODE = 1;
public static final int COUNT_PLACES = 1000; //количество мест на стоянке
ArrayList<String> s; //получение данных с формы регистрации
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //делаем регистрацию
    public void reg(View v){
        Intent intent = new Intent(MainActivity.this,Registration.class);
        startActivityForResult(intent,CODE);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK) {
            s = data.getStringArrayListExtra("answer");
        // кто не знаком со списками ArrayList, может работать с массивом строк
           // String []w = new String[5];
           // s.toArray(w);
        myRun(s);// вызов функции, которая выполняет поставленные задачи
        }
    }

    protected void myRun(ArrayList<String> arrayList){//для тех, кто работает со списком
    //protected void myRun(String[] sArray){  - для тех, кто работает с массивом
        // решение задач управления парковкой
    }
    //обработка въезда-выезда.
    // При изменении меняется текстовое поле с числом свободных мест.
    public void in(View v){
        //программируем учёт заезжающей машины
        //обеспечить проверку наличия свободных мест:
        //выводить сообщение, если мест нет, но машина хочет заехать
    }
    public void out(View v){
        //программируем выезд
    }

}
