// Generated by view binder compiler. Do not edit!
package com.example.mr_shopper_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mr_shopper_app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityProfileBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ScrollView LiId;

  @NonNull
  public final ImageView imageArrow;

  @NonNull
  public final ImageView imgPro;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView txtProname;

  @NonNull
  public final TextView txtSubname;

  private ActivityProfileBinding(@NonNull ScrollView rootView, @NonNull ScrollView LiId,
      @NonNull ImageView imageArrow, @NonNull ImageView imgPro, @NonNull TextView textView,
      @NonNull TextView txtProname, @NonNull TextView txtSubname) {
    this.rootView = rootView;
    this.LiId = LiId;
    this.imageArrow = imageArrow;
    this.imgPro = imgPro;
    this.textView = textView;
    this.txtProname = txtProname;
    this.txtSubname = txtSubname;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ScrollView LiId = (ScrollView) rootView;

      id = R.id.image_arrow;
      ImageView imageArrow = ViewBindings.findChildViewById(rootView, id);
      if (imageArrow == null) {
        break missingId;
      }

      id = R.id.img_pro;
      ImageView imgPro = ViewBindings.findChildViewById(rootView, id);
      if (imgPro == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.txt_proname;
      TextView txtProname = ViewBindings.findChildViewById(rootView, id);
      if (txtProname == null) {
        break missingId;
      }

      id = R.id.txt_subname;
      TextView txtSubname = ViewBindings.findChildViewById(rootView, id);
      if (txtSubname == null) {
        break missingId;
      }

      return new ActivityProfileBinding((ScrollView) rootView, LiId, imageArrow, imgPro, textView,
          txtProname, txtSubname);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
