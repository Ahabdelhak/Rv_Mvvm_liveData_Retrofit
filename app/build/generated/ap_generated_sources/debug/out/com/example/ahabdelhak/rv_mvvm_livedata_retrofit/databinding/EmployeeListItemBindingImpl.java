package com.example.ahabdelhak.rv_mvvm_livedata_retrofit.databinding;
import com.example.ahabdelhak.rv_mvvm_livedata_retrofit.R;
import com.example.ahabdelhak.rv_mvvm_livedata_retrofit.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class EmployeeListItemBindingImpl extends EmployeeListItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cvEmployee, 4);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public EmployeeListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private EmployeeListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.ivPic.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvEmail.setTag(null);
        this.tvFullName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.employee == variableId) {
            setEmployee((com.example.ahabdelhak.rv_mvvm_livedata_retrofit.Employee) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEmployee(@Nullable com.example.ahabdelhak.rv_mvvm_livedata_retrofit.Employee Employee) {
        this.mEmployee = Employee;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.employee);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.ahabdelhak.rv_mvvm_livedata_retrofit.Employee employee = mEmployee;
        java.lang.String employeeEmail = null;
        java.lang.String employeeLastName = null;
        java.lang.String employeeFirstName = null;
        java.lang.String employeeFirstNameConcatTvFullNameAndroidStringSpaceConcatEmployeeLastName = null;
        java.lang.String javaLangStringEmailEmployeeEmail = null;
        java.lang.String employeeFirstNameConcatTvFullNameAndroidStringSpace = null;
        java.lang.String employeeAvatar = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (employee != null) {
                    // read employee.email
                    employeeEmail = employee.getEmail();
                    // read employee.lastName
                    employeeLastName = employee.getLastName();
                    // read employee.firstName
                    employeeFirstName = employee.getFirstName();
                    // read employee.avatar
                    employeeAvatar = employee.getAvatar();
                }


                // read ("Email - ") + (employee.email)
                javaLangStringEmailEmployeeEmail = ("Email - ") + (employeeEmail);
                if (employeeFirstName != null) {
                    // read employee.firstName.concat(@android:string/space)
                    employeeFirstNameConcatTvFullNameAndroidStringSpace = employeeFirstName.concat(tvFullName.getResources().getString(R.string.space));
                }


                if (employeeFirstNameConcatTvFullNameAndroidStringSpace != null) {
                    // read employee.firstName.concat(@android:string/space).concat(employee.lastName)
                    employeeFirstNameConcatTvFullNameAndroidStringSpaceConcatEmployeeLastName = employeeFirstNameConcatTvFullNameAndroidStringSpace.concat(employeeLastName);
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.ahabdelhak.rv_mvvm_livedata_retrofit.Employee.loadImage(this.ivPic, employeeAvatar);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvEmail, javaLangStringEmailEmployeeEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFullName, employeeFirstNameConcatTvFullNameAndroidStringSpaceConcatEmployeeLastName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): employee
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}