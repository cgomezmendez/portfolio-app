package me.cristiangome.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mBtnSpotifyStreamer;
    private Button mBtnScoresApp;
    private Button mBtnLibraryApp;
    private Button mBtnBuildItBigger;
    private Button mBtnXyzReader;
    private Button mBtnCapStone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeView();
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

    private void initializeView() {
        mBtnSpotifyStreamer = (Button) findViewById(R.id.a_activity_main_btn_spotify_streamer);
        mBtnSpotifyStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String appName = getString(R.string.spotify_streamer);
                String message = getString(R.string.a_activity_main_t_message);
                message = String.format(message, appName);
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
        mBtnScoresApp = (Button) findViewById(R.id.a_activity_main_btn_scores_app);
        mBtnScoresApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String appName = getString(R.string.scores_app);
                String message = getString(R.string.a_activity_main_t_message);
                message = String.format(message, appName);
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
        mBtnLibraryApp = (Button) findViewById(R.id.a_activity_main_btn_library_app);
        mBtnLibraryApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String appName = getString(R.string.library_app);
                String message = getString(R.string.a_activity_main_t_message);
                message = String.format(message, appName);
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
            }
        });
        mBtnBuildItBigger = (Button) findViewById(R.id.a_activity_main_btn_build_it_bigger);
        mBtnBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String appName = getString(R.string.build_it_bigger);
                String message = getString(R.string.a_activity_main_t_message);
                message = String.format(message, appName);
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
        mBtnXyzReader = (Button) findViewById(R.id.a_activity_main_btn_xyz_reader);
        mBtnXyzReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String appName = getString(R.string.xyz_reader);
                String message = getString(R.string.a_activity_main_t_message);
                message = String.format(message, appName);
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
        mBtnCapStone = (Button) findViewById(R.id.a_activity_main_btn_capstone);
        mBtnCapStone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String appName = getString(R.string.capstone);
                String message = getString(R.string.a_activity_main_t_message);
                message = String.format(message, appName);
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
