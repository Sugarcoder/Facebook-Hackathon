package sugarcoder.com.notalone;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    String[] suiWords = new String[]{"feeling suicidal", "sintiendo suicida", "suicidaires"};
    EditText editPost;
    Button btnPost;
    TextView msgPost;
    TextView msgHotline;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPost = (Button) findViewById(R.id.btnPost);
        btnPost.setOnClickListener(this);

        //String editPost = ((EditText) findViewById(R.id.editPost)).getText().toString();


    btnPost.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            editPost = (EditText) findViewById(R.id.editPost);
            msgPost = (TextView) findViewById(R.id.msgPost);
            msgHotline = (TextView) findViewById(R.id.msgHotline);


            if (editPost.length() == 0) {
                Toast.makeText(getApplicationContext(), "You need to write a message.",
                        Toast.LENGTH_SHORT).show();
            }
            else {
                String e = String.valueOf(editPost.getText().toString());
                msgPost.setText(e);
            }

            /*
            if (v == btnPost) {
                textPost.setVisibility(View.VISIBLE);
            }
            */

            /* for (int i = 0; i < suiWords.length; i++) {
            if (msgPost.getText().toString().equals(suiWords[i])) {
                msgHotline.setVisibility(View.VISIBLE);
                break;
            }
            } */


            for (String suiWord : suiWords) {
                if (msgPost.getText().toString().equals(suiWord)) {
                    msgHotline.setVisibility(View.VISIBLE);
                    break;
                }
            }
        }
    });
    }



// Menu Options

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

       // noinspection SimplifiableIfStatement
       /*
        if (id == id.action_settings) {
          return true;
       } */
       return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

    }
}