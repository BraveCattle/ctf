package com.x64m.xsfmnative;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import c.c;

/* loaded from: classes.dex */
public class MainActivity extends c {

    /* renamed from: o  reason: collision with root package name */
    public String f1581o;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ RadioGroup f1582b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ EditText f1583c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ EditText f1584d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ TextView f1585e;

        public a(RadioGroup radioGroup, EditText editText, EditText editText2, TextView textView) {
            this.f1582b = radioGroup;
            this.f1583c = editText;
            this.f1584d = editText2;
            this.f1585e = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainActivity mainActivity;
            String jniADD;
            MainActivity.this.f1581o = "";
            switch (this.f1582b.getCheckedRadioButtonId()) {
                case R.id.rbadd /* 2131230931 */:
                    mainActivity = MainActivity.this;
                    jniADD = mainActivity.jniADD(this.f1583c.getText().toString(), this.f1584d.getText().toString());
                    break;
                case R.id.rbdiv /* 2131230932 */:
                    mainActivity = MainActivity.this;
                    jniADD = mainActivity.jniDIV(this.f1583c.getText().toString(), this.f1584d.getText().toString());
                    break;
                case R.id.rbmul /* 2131230933 */:
                    mainActivity = MainActivity.this;
                    jniADD = mainActivity.jniMUL(this.f1583c.getText().toString(), this.f1584d.getText().toString());
                    break;
                case R.id.rbsub /* 2131230934 */:
                    mainActivity = MainActivity.this;
                    jniADD = mainActivity.jniSUB(this.f1583c.getText().toString(), this.f1584d.getText().toString());
                    break;
                default:
                    mainActivity = MainActivity.this;
                    jniADD = "INVALID OPERATION";
                    break;
            }
            mainActivity.f1581o = jniADD;
            this.f1585e.clearComposingText();
            this.f1585e.setText(MainActivity.this.f1581o);
        }
    }

    static {
        System.loadLibrary("native-lib");
    }

    public native String jniADD(String str, String str2);

    public native String jniDIV(String str, String str2);

    public native String jniMUL(String str, String str2);

    public native String jniSUB(String str, String str2);

    @Override // c.c, k0.b, androidx.activity.ComponentActivity, u.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        EditText editText = (EditText) findViewById(R.id.num1textedit);
        EditText editText2 = (EditText) findViewById(R.id.num2textedit);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        TextView textView = (TextView) findViewById(R.id.answertextfield);
        ((TextView) findViewById(R.id.msgtext)).setText("firebird{0f_c0z_1_w1ll_n0t_put_7h3_fl4g_h3r3)}");
        ((Button) findViewById(R.id.button8)).setOnClickListener(new a(radioGroup, editText, editText2, textView));
    }
}