package com.example.ahabdelhak.rv_mvvm_livedata_retrofit.ViewModel;

import android.app.Application;

import com.example.ahabdelhak.rv_mvvm_livedata_retrofit.Employee;
import com.example.ahabdelhak.rv_mvvm_livedata_retrofit.Model_of_VM.EmployeeRepository;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class MainViewModel extends AndroidViewModel {
    private EmployeeRepository employeeRepository;

    public MainViewModel(@NonNull Application application) {
        super(application);
        employeeRepository = new EmployeeRepository();
    }

    public LiveData<List<Employee>> getAllEmployee() {
        return employeeRepository.getMutableLiveData();
    }
}