package cpumonitor.ybdesire.com.androidcpumonitor;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SysMonitorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sys_monitor);

        // button home listener
        Button btn=(Button)findViewById(R.id.btn_home);//find button by id(defined at activity_main.xml)
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intnt = new Intent(SysMonitorActivity.this, MainActivity.class);
                startActivity(intnt);
            }
        });

        // text view details
        String str = "\n\n\n\n\n\n";

        str += "Device OS Version: "  + DeviceUtil.getAndroidOSVersion() + "\n\n";
        str += "Device Type: " + DeviceUtil.getDeviceType() + "\n\n";
        str += "Device Manufacturer: " + DeviceUtil.getManufacturer() + "\n\n";
        str += "Device Fingerprintf: " + DeviceUtil.getfingterprint()+ "\n\n";
        str += "Device Product: " + DeviceUtil.getProduct()+ "\n\n";
        str += "Device Display: " + DeviceUtil.getDisplay()+ "\n\n";
        str += "Device User: " + DeviceUtil.getUser()+ "\n\n";
        str += "Device Type: " + DeviceUtil.getType()+ "\n\n";

        TextView txt=(TextView)findViewById(R.id.txtDetails);//find output label by id
        txt.setText(str);

    }

}
