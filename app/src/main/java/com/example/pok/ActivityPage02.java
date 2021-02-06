package com.example.pok;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pok.model.DeviceModel;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class ActivityPage02 extends AppCompatActivity {

    Switch F1F2SW_G;
    Switch F1SW_A;
    Switch F1SW_B;
    Switch F1SW_C;
    Switch F1SW_D;
    Switch F1SW_E;
    Switch F1SW_F;
    Switch F1SW_G;
    Switch F1SW_H;
    Switch F1SW_I;
    Switch F1SW_J;
    Switch F1SW_K;
    Switch F1SW_L;
    Switch F2SW_A;
    Switch F2SW_B;
    Switch F2SW_C;
    Switch F2SW_D;
    Switch F2SW_E;
    Switch F2SW_F;
    Switch F2SW_H;
    Switch F2SW_I;
    Switch F2SW_J;
    Switch F2SW_K;
    Switch F2SW_L;
    Switch F2SW_M;
    Switch F2SW_N;
    Switch F2SW_O;
    Switch F2SW_P;


    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference reference = database.getReference();
    DeviceModel deviceModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_page02);
        deviceModel = new DeviceModel();
        findIdFormView();
        getValeFormDatabase();


    }

    private void findIdFormView() {
        F1SW_A = findViewById(R.id.f1sw_a);
        F1SW_B = findViewById(R.id.f1sw_b);
        F1SW_C = findViewById(R.id.f1sw_c);
        F1SW_D = findViewById(R.id.f1sw_d);
        F1SW_E = findViewById(R.id.f1sw_e);
        F1SW_F = findViewById(R.id.f1sw_f);
        F1SW_G = findViewById(R.id.f1sw_g);
        F1SW_H = findViewById(R.id.f1sw_h);
        F1SW_I = findViewById(R.id.f1sw_i);
        F1SW_J = findViewById(R.id.f1sw_j);
        F1SW_K = findViewById(R.id.f1sw_k);
        F1SW_L = findViewById(R.id.f1sw_l);

    }

    private void getValeFormDatabase() {
        reference.child("device").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                deviceModel = dataSnapshot.getValue(DeviceModel.class);
                Log.d("database", String.valueOf(deviceModel.getF1SW_A()));
                setValueSwitchFomdata();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.d("database", databaseError.toString());
            }
        });
    }

    private void setValueSwitchFomdata() {
        F1SW_A.setChecked(deviceModel.getF1SW_A() == 1);
        F1SW_B.setChecked(deviceModel.getF1SW_B() == 1);
        F1SW_C.setChecked(deviceModel.getF1SW_C() == 1);
        F1SW_D.setChecked(deviceModel.getF1SW_D() == 1);
        F1SW_E.setChecked(deviceModel.getF1SW_E() == 1);
        F1SW_F.setChecked(deviceModel.getF1SW_F() == 1);
        F1SW_G.setChecked(deviceModel.getF1SW_G() == 1);
        F1SW_H.setChecked(deviceModel.getF1SW_H() == 1);
        F1SW_I.setChecked(deviceModel.getF1SW_I() == 1);
        F1SW_J.setChecked(deviceModel.getF1SW_J() == 1);
        F1SW_K.setChecked(deviceModel.getF1SW_K() == 1);
        F1SW_L.setChecked(deviceModel.getF1SW_L() == 1);
    }

    //รับค่าจากวิว
    public void switchClick(View v) {
        switch (v.getId()) {
            case R.id.f1sw_a:
                if (deviceModel.getF1SW_A() == 1) {
                    deviceModel.setF1SW_A(0);
                } else {
                    deviceModel.setF1SW_A(1);
                }
                setValueToDatabase(deviceModel);

                break;
            case R.id.f1sw_b:
                if (deviceModel.getF1SW_B() == 1) {
                    deviceModel.setF1SW_B(0);
                } else {
                    deviceModel.setF1SW_B(1);
                }
                setValueToDatabase(deviceModel);

                break;
            case R.id.f1sw_c:
                if (deviceModel.getF1SW_C() == 1) {
                    deviceModel.setF1SW_C(0);
                } else {
                    deviceModel.setF1SW_C(1);
                }
                setValueToDatabase(deviceModel);

                break;
            case R.id.f1sw_d:
                if (deviceModel.getF1SW_D() == 1) {
                    deviceModel.setF1SW_D(0);
                } else {
                    deviceModel.setF1SW_D(1);
                }
                setValueToDatabase(deviceModel);

                break;
            case R.id.f1sw_e:
                if (deviceModel.getF1SW_E() == 1) {
                    deviceModel.setF1SW_E(0);
                } else {
                    deviceModel.setF1SW_E(1);
                }
                setValueToDatabase(deviceModel);

                break;
            case R.id.f1sw_f:
                if (deviceModel.getF1SW_F() == 1) {
                    deviceModel.setF1SW_F(0);
                } else {
                    deviceModel.setF1SW_F(1);
                }
                setValueToDatabase(deviceModel);

                break;
            case R.id.f1sw_g:
                if (deviceModel.getF1SW_G() == 1) {
                    deviceModel.setF1SW_G(0);
                } else {
                    deviceModel.setF1SW_G(1);
                }
                setValueToDatabase(deviceModel);

                break;
            case R.id.f1sw_h:
                if (deviceModel.getF1SW_H() == 1) {
                    deviceModel.setF1SW_H(0);
                } else {
                    deviceModel.setF1SW_H(1);
                }
                setValueToDatabase(deviceModel);

                break;
            case R.id.f1sw_i:
                if (deviceModel.getF1SW_I() == 1) {
                    deviceModel.setF1SW_I(0);
                } else {
                    deviceModel.setF1SW_I(1);
                }
                setValueToDatabase(deviceModel);

                break;
            case R.id.f1sw_j:
                if (deviceModel.getF1SW_J() == 1) {
                    deviceModel.setF1SW_J(0);
                } else {
                    deviceModel.setF1SW_J(1);
                }
                setValueToDatabase(deviceModel);

                break;
            case R.id.f1sw_k:
                if (deviceModel.getF1SW_K() == 1) {
                    deviceModel.setF1SW_K(0);
                } else {
                    deviceModel.setF1SW_K(1);
                }
                setValueToDatabase(deviceModel);

                break;
            case R.id.f1sw_l:
                if (deviceModel.getF1SW_L() == 1) {
                    deviceModel.setF1SW_L(0);
                } else {
                    deviceModel.setF1SW_L(1);
                }
                setValueToDatabase(deviceModel);

                break;
            default:
                Log.d("switchClick", "defal");
                break;
        }

    }

    private void setValueToDatabase(DeviceModel model) {
        reference.child("device").setValue(model).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Log.d("uploadData", "Complete");
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("uploadData", "Fail");
            }
        });
    }


}