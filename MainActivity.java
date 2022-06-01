package com.example.mycardlist;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView courseRV;


    private ArrayList<CourseModel> courseModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        courseRV = findViewById(R.id.idRVCourse);


        courseModelArrayList = new ArrayList<>();
        courseModelArrayList.add(new CourseModel("Дурак", 0, R.drawable.card0));
        courseModelArrayList.add(new CourseModel("Маг", 1, R.drawable.card1));
        courseModelArrayList.add(new CourseModel("Жрица", 2, R.drawable.card2));
        courseModelArrayList.add(new CourseModel("Императрица", 3, R.drawable.card3));
        courseModelArrayList.add(new CourseModel("Император", 4, R.drawable.card4));
        courseModelArrayList.add(new CourseModel("Жрец", 5, R.drawable.card5));
        courseModelArrayList.add(new CourseModel("Влюбленные", 6, R.drawable.card6));
        courseModelArrayList.add(new CourseModel("Колесница", 7, R.drawable.card7));
        courseModelArrayList.add(new CourseModel("Сила", 8, R.drawable.card8));
        courseModelArrayList.add(new CourseModel("Отшельник", 9, R.drawable.card9));
        courseModelArrayList.add(new CourseModel("Колесо Фортуны", 10, R.drawable.card10));
        courseModelArrayList.add(new CourseModel("Равновесие",11, R.drawable.card11));
        courseModelArrayList.add(new CourseModel("Повешанный",  12, R.drawable.card12));
        courseModelArrayList.add(new CourseModel("Смерть", 13, R.drawable.card13));
        courseModelArrayList.add(new CourseModel("Умеренность", 14, R.drawable.card14));
        courseModelArrayList.add(new CourseModel("Дьявол", 15, R.drawable.card15));
        courseModelArrayList.add(new CourseModel("Башня", 16, R.drawable.card16));
        courseModelArrayList.add(new CourseModel("Звезда", 17, R.drawable.card17));
        courseModelArrayList.add(new CourseModel("Луна", 18, R.drawable.card18));
        courseModelArrayList.add(new CourseModel("Солнце", 19, R.drawable.card19));
        courseModelArrayList.add(new CourseModel("Возрождение", 20, R.drawable.card20));
        courseModelArrayList.add(new CourseModel("Мир", 21, R.drawable.card21));


        CourseAdapter courseAdapter = new CourseAdapter(this, courseModelArrayList);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        courseRV.setLayoutManager(linearLayoutManager);
        courseRV.setAdapter(courseAdapter);
    }
}
