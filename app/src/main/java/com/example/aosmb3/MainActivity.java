package com.example.aosmb3;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    EditText textView;
    ActivityResultLauncher<Intent> mStartForResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    Intent data = result.getData();

                    textView.setText(data.getStringExtra("string"));
                }
            });
    private static final String TAG = "MyApp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        EditText textView= (EditText) findViewById(R.id.editTextTextPersonName2);

        imageView.setImageResource(R.drawable.logo);
        textView.setText(R.string.passwordd);



        Button button = (Button) findViewById(R.id.button);

        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View V){
                Context context = getApplicationContext();
                CharSequence text = "Вход!!!";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                Log.i(TAG, "Здравствуйте!!!");
            }


        };
    }
    @Override
    protected void onStart() {
        super.onStart();
        Context context = getApplicationContext();
        CharSequence text = "Start Application!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.w(TAG, "Приложение запущено некорректно");
    }
    @Override
    protected void onStop() {
        super.onStop();
        try{
            Context context = getApplicationContext();
            CharSequence text = "Stop Application!";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            Log.e(TAG, "Ошибка, приложение остановлено");
        }
        catch (Exception exception) {
            Log.e(TAG, "Получено исключение", exception);
        }

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Context context = getApplicationContext();
        CharSequence text = "Destroy Application!!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.v(TAG, "Подробности закрытия приложения");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Context context = getApplicationContext();
        CharSequence text = "Pause Application!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.d(TAG, "onPause");
    }
    public void OnClick1(View view){
        Log.i(TAG, "Здравствуйте!!!");
        Context context = getApplicationContext();
        CharSequence text = "SecondActivity!!!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("onClick1", "Works!");
        startActivity(intent);

    }
    @Override
    protected void onResume() {
        super.onResume();
        Context context = getApplicationContext();
        CharSequence text = "Resume Application!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.d(TAG, "onResume");
    }
    public void onClickk(View V){
        Log.d(TAG, "hi!!!");
    }
}