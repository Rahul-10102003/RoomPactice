// Generated by view binder compiler. Do not edit!
package com.example.roompactice.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.roompactice.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout linear;

  @NonNull
  public final EditText setname;

  @NonNull
  public final EditText setroll;

  @NonNull
  public final EditText setsubject;

  private ItemLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull LinearLayout linear,
      @NonNull EditText setname, @NonNull EditText setroll, @NonNull EditText setsubject) {
    this.rootView = rootView;
    this.linear = linear;
    this.setname = setname;
    this.setroll = setroll;
    this.setsubject = setsubject;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.linear;
      LinearLayout linear = ViewBindings.findChildViewById(rootView, id);
      if (linear == null) {
        break missingId;
      }

      id = R.id.setname;
      EditText setname = ViewBindings.findChildViewById(rootView, id);
      if (setname == null) {
        break missingId;
      }

      id = R.id.setroll;
      EditText setroll = ViewBindings.findChildViewById(rootView, id);
      if (setroll == null) {
        break missingId;
      }

      id = R.id.setsubject;
      EditText setsubject = ViewBindings.findChildViewById(rootView, id);
      if (setsubject == null) {
        break missingId;
      }

      return new ItemLayoutBinding((ConstraintLayout) rootView, linear, setname, setroll,
          setsubject);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
