package com.example.ahabdelhak.rv_mvvm_livedata_retrofit.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.ahabdelhak.rv_mvvm_livedata_retrofit.Adapter.EmployeeDataAdapter;
import com.example.ahabdelhak.rv_mvvm_livedata_retrofit.Employee;
import com.example.ahabdelhak.rv_mvvm_livedata_retrofit.R;
import com.example.ahabdelhak.rv_mvvm_livedata_retrofit.ViewModel.MainViewModel;
import com.example.ahabdelhak.rv_mvvm_livedata_retrofit.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private MainViewModel mainViewModel;
    private EmployeeDataAdapter employeeDataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // bind RecyclerView
        RecyclerView recyclerView = activityMainBinding.viewEmployees;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        employeeDataAdapter = new EmployeeDataAdapter();
        recyclerView.setAdapter(employeeDataAdapter);
        getAllEmployee();
    }

    private void getAllEmployee() {
        mainViewModel.getAllEmployee().observe(this, new Observer<List<Employee>>() {
            @Override
            public void onChanged(@Nullable List<Employee> employees) {
                employeeDataAdapter.setEmployeeList((ArrayList<Employee>) employees);
            }
        });
    }
}