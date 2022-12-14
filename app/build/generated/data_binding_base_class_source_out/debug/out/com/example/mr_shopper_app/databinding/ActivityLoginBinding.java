// Generated by view binder compiler. Do not edit!
package com.example.mr_shopper_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mr_shopper_app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnSingup;

  @NonNull
  public final ImageView imgFacebook;

  @NonNull
  public final ImageView imgGoogle;

  @NonNull
  public final ImageView imgUpdate;

  @NonNull
  public final ImageView imgeTwitter;

  @NonNull
  public final LinearLayout lniearlogin;

  @NonNull
  public final EditText singupEmail;

  @NonNull
  public final EditText singupPwd;

  @NonNull
  public final TextView singupname;

  @NonNull
  public final TextView txtForget;

  @NonNull
  public final TextView txtUsernameEmail;

  @NonNull
  public final TextView txtbottem;

  @NonNull
  public final TextView txtforget;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnSingup,
      @NonNull ImageView imgFacebook, @NonNull ImageView imgGoogle, @NonNull ImageView imgUpdate,
      @NonNull ImageView imgeTwitter, @NonNull LinearLayout lniearlogin,
      @NonNull EditText singupEmail, @NonNull EditText singupPwd, @NonNull TextView singupname,
      @NonNull TextView txtForget, @NonNull TextView txtUsernameEmail, @NonNull TextView txtbottem,
      @NonNull TextView txtforget) {
    this.rootView = rootView;
    this.btnSingup = btnSingup;
    this.imgFacebook = imgFacebook;
    this.imgGoogle = imgGoogle;
    this.imgUpdate = imgUpdate;
    this.imgeTwitter = imgeTwitter;
    this.lniearlogin = lniearlogin;
    this.singupEmail = singupEmail;
    this.singupPwd = singupPwd;
    this.singupname = singupname;
    this.txtForget = txtForget;
    this.txtUsernameEmail = txtUsernameEmail;
    this.txtbottem = txtbottem;
    this.txtforget = txtforget;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_singup;
      Button btnSingup = ViewBindings.findChildViewById(rootView, id);
      if (btnSingup == null) {
        break missingId;
      }

      id = R.id.img_facebook;
      ImageView imgFacebook = ViewBindings.findChildViewById(rootView, id);
      if (imgFacebook == null) {
        break missingId;
      }

      id = R.id.img_google;
      ImageView imgGoogle = ViewBindings.findChildViewById(rootView, id);
      if (imgGoogle == null) {
        break missingId;
      }

      id = R.id.img_update;
      ImageView imgUpdate = ViewBindings.findChildViewById(rootView, id);
      if (imgUpdate == null) {
        break missingId;
      }

      id = R.id.imge_twitter;
      ImageView imgeTwitter = ViewBindings.findChildViewById(rootView, id);
      if (imgeTwitter == null) {
        break missingId;
      }

      id = R.id.lniearlogin;
      LinearLayout lniearlogin = ViewBindings.findChildViewById(rootView, id);
      if (lniearlogin == null) {
        break missingId;
      }

      id = R.id.singup_email;
      EditText singupEmail = ViewBindings.findChildViewById(rootView, id);
      if (singupEmail == null) {
        break missingId;
      }

      id = R.id.singup_pwd;
      EditText singupPwd = ViewBindings.findChildViewById(rootView, id);
      if (singupPwd == null) {
        break missingId;
      }

      id = R.id.singupname;
      TextView singupname = ViewBindings.findChildViewById(rootView, id);
      if (singupname == null) {
        break missingId;
      }

      id = R.id.txt_forget;
      TextView txtForget = ViewBindings.findChildViewById(rootView, id);
      if (txtForget == null) {
        break missingId;
      }

      id = R.id.txt_username_email;
      TextView txtUsernameEmail = ViewBindings.findChildViewById(rootView, id);
      if (txtUsernameEmail == null) {
        break missingId;
      }

      id = R.id.txtbottem;
      TextView txtbottem = ViewBindings.findChildViewById(rootView, id);
      if (txtbottem == null) {
        break missingId;
      }

      id = R.id.txtforget;
      TextView txtforget = ViewBindings.findChildViewById(rootView, id);
      if (txtforget == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, btnSingup, imgFacebook,
          imgGoogle, imgUpdate, imgeTwitter, lniearlogin, singupEmail, singupPwd, singupname,
          txtForget, txtUsernameEmail, txtbottem, txtforget);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
