package com.example.myapplication;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import com.example.myapplication.dummy.DummyContent;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements ItemFragment.OnListFragmentInteractionListener, BlankFragment.onButtonClick {
    ImageView imageView;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeListFragment(true);


        Log.e("MainACivity", "onCreate");
    }


    private void replaceListFragment( ) {

        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.listFragment,  BlankFragment.newInstance("afgdag","agsag"));

        fragmentTransaction.commit();

//getSupportFragmentManager().beginTransaction().add(R.id.listFragment, new ItemFragment()).commit();

    }

    private void initializeListFragment( boolean addback) {

        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.listFragment,  ItemFragment.newInstance(0));
        if(addback)
        fragmentTransaction.addToBackStack("blank");
        fragmentTransaction.commit();

//getSupportFragmentManager().beginTransaction().add(R.id.listFragment, new ItemFragment()).commit();

    }

    @Override
    protected void onPause() {
        Log.e("MainACivity", "onPause");

        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.e("MainACivity", "onResume");

        super.onResume();
    }

    @Override
    protected void onStart() {
        Log.e("MainACivity", "onStart");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.e("MainACivity", "onStop");

        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e("MainACivity", "onDestroy");

        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {
        Log.e("Mainactivity", "onListFragmentInteraction");
    }

    @Override
    public void onButtonclick(String uri, String msg) {
        Log.e("onbuttonclick  ",uri);
    }
}

class ImageClickListner implements View.OnClickListener{

    @Override
    public void onClick(View view) {

    }
}