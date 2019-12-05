// Generated by data binding compiler. Do not edit!
package com.example.ahabdelhak.rv_mvvm_livedata_retrofit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.ahabdelhak.rv_mvvm_livedata_retrofit.Employee;
import com.example.ahabdelhak.rv_mvvm_livedata_retrofit.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class EmployeeListItemBinding extends ViewDataBinding {
  @NonNull
  public final CardView cvEmployee;

  @NonNull
  public final ImageView ivPic;

  @NonNull
  public final TextView tvEmail;

  @NonNull
  public final TextView tvFullName;

  @Bindable
  protected Employee mEmployee;

  protected EmployeeListItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cvEmployee, ImageView ivPic, TextView tvEmail, TextView tvFullName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cvEmployee = cvEmployee;
    this.ivPic = ivPic;
    this.tvEmail = tvEmail;
    this.tvFullName = tvFullName;
  }

  public abstract void setEmployee(@Nullable Employee employee);

  @Nullable
  public Employee getEmployee() {
    return mEmployee;
  }

  @NonNull
  public static EmployeeListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.employee_list_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static EmployeeListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<EmployeeListItemBinding>inflateInternal(inflater, R.layout.employee_list_item, root, attachToRoot, component);
  }

  @NonNull
  public static EmployeeListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.employee_list_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static EmployeeListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<EmployeeListItemBinding>inflateInternal(inflater, R.layout.employee_list_item, null, false, component);
  }

  public static EmployeeListItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static EmployeeListItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (EmployeeListItemBinding)bind(component, view, R.layout.employee_list_item);
  }
}