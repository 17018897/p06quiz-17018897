package sg.edu.rp.soi.p06_quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Num1;
    EditText Num2;
    TextView Operation;
    TextView Results;
    Button Reset;
    int total = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num1 = findViewById(R.id.etNum1);
        Num2 = findViewById(R.id.etNum2);
        Operation = findViewById(R.id.tvOperation);
        Results = findViewById(R.id.textViewResult);
        Reset = findViewById(R.id.btnReset);

        registerForContextMenu(Operation);
    }
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        // …
        menu.add(0,0,0,"+");
        menu.add(0,1,1,"-");
    }
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getItemId()==0) { //check whether the selected menu item ID is 0
            //code for action

            total = Num1.getText().
            Results.setText(total);

            return true; //menu item successfully handled
        }
        else if(item.getItemId()==1) { //check if the selected menu item ID is 1
            //code for action


            return true;  //menu item successfully handled
        }

        return super.onContextItemSelected(item);
    }

}

