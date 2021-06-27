package aurelliofishandy.jwork_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class ApplyJobActivity extends AppCompatActivity {
    private int jobseekerID;
    private int jobID;
    private String jobName;
    private  String jobCategory;
    private double jobFee;
    private int bonus;
    private String selectedPayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply_job);
    }

    public void onEwalletButtonClick (View view){

    }

    public void onBankButtonClick (View view){

    }
}