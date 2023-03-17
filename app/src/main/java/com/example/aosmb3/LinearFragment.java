package com.example.aosmb3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class LinearFragment extends Fragment {

    public LinearFragment() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Жизненный цикл LinearFragment", "Вызов onCreate");
        Toast.makeText(getActivity(), "Вызов onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("Жизненный цикл LinearFragment", "Вызов onCreateView");
        Toast.makeText(getActivity(), "Вызов onCreateView", Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.linerlayout, container, false);
    }
    @Override
    public void onViewCreated( View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Log.d("Жизненный цикл LinearFragment", "Вызов onViewCreated");
        Toast.makeText(getActivity(), "Вызов onViewCreated", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d("Жизненный цикл LinearFragment", "Вызов onViewStateRestored");
        Toast.makeText(getActivity(), "Вызов onViewStateRestored", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.d("Жизненный цикл LinearFragment", "Вызов onStart");
        Toast.makeText(getActivity(), "Вызов onStart", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d("Жизненный цикл LinearFragment", "Вызов onResume");
        Toast.makeText(getActivity(), "Вызов onResume", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d("Жизненный цикл LinearFragment", "Вызов onPause");
        Toast.makeText(getActivity(), "Вызов onPause", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d("Жизненный цикл LinearFragment", "Вызов onStop");
        Toast.makeText(getActivity(), "Вызов onStop", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        Log.d("Жизненный цикл LinearFragment", "Вызов onSaveInstanceState");
        Toast.makeText(getActivity(), "Вызов onSaveInstanceState", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onDestroyView(){
        super.onDestroyView();
        Log.d("Жизненный цикл LinearFragment", "Вызов onDestroyView");
        Toast.makeText(getActivity(), "Вызов onDestroyView", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("Жизненный цикл LinearFragment", "Вызов onDestroy");
        Toast.makeText(getActivity(), "Вызов onDestroy", Toast.LENGTH_SHORT).show();
    }
    public void clickButton(){

        Log.i("Тест","Работает!");
    }
}
