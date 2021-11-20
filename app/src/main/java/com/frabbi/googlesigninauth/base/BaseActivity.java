package com.frabbi.googlesigninauth.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

public abstract class BaseActivity<V extends ViewBinding> extends AppCompatActivity {
    protected V vB;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        vB = onCreateViewBinding();
        setContentView(vB.getRoot());
        setViewCreated(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        vB = null;
        super.onDestroy();
    }

    protected abstract V onCreateViewBinding();

    protected abstract void setViewCreated(Bundle saveInstanceState);
}
