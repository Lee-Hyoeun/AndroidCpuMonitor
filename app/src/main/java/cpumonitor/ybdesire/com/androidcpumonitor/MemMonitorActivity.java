package cpumonitor.ybdesire.com.androidcpumonitor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MemMonitorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mem_monitor);


        // button home listener
        Button btn=(Button)findViewById(R.id.btn_home);//find button by id(defined at activity_main.xml)
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intnt = new Intent(MemMonitorActivity.this, MainActivity.class);
                startActivity(intnt);
            }
        });
    }


}
