package com.frabbi.googlesigninauth;

import android.os.Bundle;

import com.frabbi.googlesigninauth.base.BaseActivity;
import com.frabbi.googlesigninauth.databinding.ActivityDashBoardBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class DashBoardActivity extends BaseActivity<ActivityDashBoardBinding> {

    @Override
    protected ActivityDashBoardBinding onCreateViewBinding() {
        return ActivityDashBoardBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void setViewCreated(Bundle saveInstanceState) {

        FirebaseAuth auth = FirebaseAuth.getInstance();
        FirebaseUser currentUser = auth.getCurrentUser();
        vB.textView.setText(currentUser.getEmail());

    }
}