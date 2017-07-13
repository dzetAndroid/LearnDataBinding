package com.zet.learndatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zet.learndatabinding.bean.User;
import com.zet.learndatabinding.databinding.MainActivityBinding;
import com.zet.learndatabinding.event.MyHandlers;
import com.zet.learndatabinding.event.Presenter;
import com.zet.learndatabinding.event.Task;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.main_activity);

        User user1 = new User("Test", "User");
        binding.setUser(user1); // 1
        MyHandlers myHandlers = new MyHandlers();
        binding.setHandler(myHandlers); // 2
        Task task = new Task();
        binding.setTask(task); // 3
        Presenter presenter = new Presenter();
        binding.setPresenter(presenter); // 4

        binding.setIsChecked(true); // 5

//        View view = null;
//        view.setVisibility(View.GONE)
    }
}
