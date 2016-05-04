package com.example.broom_000.criminal_intent;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class Criminal_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criminal_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        public class CrimeFragment extends Fragment {
            private Crime mCrime;
          public class CrimeActivity extends FragmentActivity {
              /** Called when the activity is first created. */
          }

            @Override
            public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                mCrime = new Crime();
            }

            public class CrimeFragment extends Fragment {
                private Crime mCrime;
                private EditText mTitleField;


                @Override
            public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                                     Bundle savedInstanceState) {
                View v = inflater.inflate(R.layout.fragment_crime, parent, false);

                    mTitleField = (EditText) v.findViewById(R.id.crime_title);
                    mTitleField.addTextChangedListener(new TextWatcher(){
                        public void onTextChanged(
                                CharSequence c, int start, int before, int count) {
                            mCrime.setTitle(c.toString());
                        }
                         public void beforeTextChanged(
                                 CharSequence c, int start,int before, int count) {
                                 mCrime.setTitle(c.toString());
                         }
                          public void beforeTextChanged(
                                  CharSequence c, int start, int count, int after) {
                              //This space intentionally left blank
                          }
                            public void afterTextChange (Editable c ){
                                // This one too
                            }
                          }
                         )
                        }
                        )
            }

        }

        }
    }
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
        public class Crime {
            private UUID mId;
            private Sting mTitle;

            public Crime() {
                //Generate unique identifier
                mId = UUID.random();

                public class Crime {
                    private UUID mId;

                    private String mTitle;

                    public Crime() {
                        mId = UUID.random.UUID();
                    }
                    public String getTitle() {
                        return mTitle;
                    }
                    public void setTitle (String title) {
                        mTitle = title;
                    }

                }
            }
        }
    }
}
