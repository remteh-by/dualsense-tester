package com.remteh.dualsensetester;

import android.graphics.Color;

public class DualSenseTestActivity extends BaseTestActivity {
    @Override protected int getAccentColor() { return Color.parseColor("#0070D1"); }
    @Override protected String getControllerTitle() { return "🔵  DUALSENSE PS5"; }
    @Override protected String[] getFaceButtonLabels() { return new String[]{"✕", "○", "□", "△"}; }
    @Override protected int[] getFaceButtonColors() {
        return new int[]{ 0xFF6E97D4, 0xFFE8564A, 0xFFD490C5, 0xFF56C7A2 };
    }
    @Override protected String getShoulderLeftLabel() { return "L1"; }
    @Override protected String getShoulderRightLabel() { return "R1"; }
    @Override protected String getTriggerLeftLabel() { return "L2"; }
    @Override protected String getTriggerRightLabel() { return "R2"; }
    @Override protected String getStartLabel() { return "OPTIONS"; }
    @Override protected String getSelectLabel() { return "CREATE"; }
    @Override protected String getSystemLabel() { return "PS ⓟ"; }
    @Override protected String getExtraLabel() { return "TOUCHPAD"; }
}
