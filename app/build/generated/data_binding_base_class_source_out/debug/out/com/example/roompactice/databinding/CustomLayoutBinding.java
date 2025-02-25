// Generated by view binder compiler. Do not edit!
package com.example.roompactice.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.roompactice.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CustomLayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText tvdescription;

  @NonNull
  public final EditText tvsubject;

  @NonNull
  public final AppCompatButton updateBtn;

  private CustomLayoutBinding(@NonNull LinearLayout rootView, @NonNull EditText tvdescription,
      @NonNull EditText tvsubject, @NonNull AppCompatButton updateBtn) {
    this.rootView = rootView;
    this.tvdescription = tvdescription;
    this.tvsubject = tvsubject;
    this.updateBtn = updateBtn;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CustomLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CustomLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.custom_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CustomLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tvdescription;
      EditText tvdescription = ViewBindings.findChildViewById(rootView, id);
      if (tvdescription == null) {
        break missingId;
      }

      id = R.id.tvsubject;
      EditText tvsubject = ViewBindings.findChildViewById(rootView, id);
      if (tvsubject == null) {
        break missingId;
      }

      id = R.id.updateBtn;
      AppCompatButton updateBtn = ViewBindings.findChildViewById(rootView, id);
      if (updateBtn == null) {
        break missingId;
      }

      return new CustomLayoutBinding((LinearLayout) rootView, tvdescription, tvsubject, updateBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
