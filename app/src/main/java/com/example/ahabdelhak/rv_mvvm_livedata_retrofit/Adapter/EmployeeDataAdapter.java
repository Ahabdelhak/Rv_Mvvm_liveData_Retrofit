package com.example.ahabdelhak.rv_mvvm_livedata_retrofit.Adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.ahabdelhak.rv_mvvm_livedata_retrofit.Employee;
import com.example.ahabdelhak.rv_mvvm_livedata_retrofit.R;
import com.example.ahabdelhak.rv_mvvm_livedata_retrofit.databinding.EmployeeListItemBinding;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

public class EmployeeDataAdapter extends RecyclerView.Adapter<EmployeeDataAdapter.EmployeeViewHolder> {

    private ArrayList<Employee> employees;

    @NonNull
    @Override
    public EmployeeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        EmployeeListItemBinding employeeListItemBinding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()),
                        R.layout.employee_list_item, viewGroup, false);
        return new EmployeeViewHolder(employeeListItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeViewHolder employeeViewHolder, int i) {
        Employee currentStudent = employees.get(i);
        employeeViewHolder.employeeListItemBinding.setEmployee(currentStudent);
    }

    @Override
    public int getItemCount() {
        if (employees != null) {
            return employees.size();
        } else {
            return 0;
        }
    }

    public void setEmployeeList(ArrayList<Employee> employees) {
        this.employees = employees;
        notifyDataSetChanged();
    }

    class EmployeeViewHolder extends RecyclerView.ViewHolder {

        private EmployeeListItemBinding employeeListItemBinding;

        public EmployeeViewHolder(@NonNull EmployeeListItemBinding employeetListItemBinding) {
            super(employeetListItemBinding.getRoot());

            this.employeeListItemBinding = employeetListItemBinding;
        }
    }
}