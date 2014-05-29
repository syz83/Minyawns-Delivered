package com.minyawns.minyawnsdelivered;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;

public class MainActivity extends ActionBarActivity {
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);    
        /*if (savedInstanceState == null) {
        	System.out.println("Gets here?");
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }*/
        
        Button btnGetMinions = (Button) findViewById(R.id.btnGetMinions);
        btnGetMinions.setOnClickListener(new View.OnClickListener() {
        	@Override
    		public void onClick(View arg0) {
        
    			Intent nextScreen = new Intent(getApplicationContext(), SecondActivity.class);
    			startActivity(nextScreen);	
    		}
    	});

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
/*
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }
        
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
        
        @Override
        public void onActivityCreated(Bundle savedInstanceState){
        	Button btnGetMinions = (Button) getView().findViewById(R.id.btnGetMinions);
            btnGetMinions.setOnClickListener(new View.OnClickListener() {
            	@Override
        		public void onClick(View arg0) {
            		//Log.d("Test", "onClickListener ist gestartet");
        			Intent nextScreen = new Intent(getActivity().getApplicationContext(), SecondActivity.class);
        			startActivity(nextScreen);	
        		}
        	});
        }
    } */
    
}
