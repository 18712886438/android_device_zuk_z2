package org.ifaa.android.manager;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;

public abstract class IFAAManager
{
  static
  {
    System.loadLibrary("ifaa_jni");
  }

  public String getDeviceModel();

  public int getSupportBIOTypes(Context paramContext);

  public int getVersion();

  public native byte[] processCmd(Context paramContext, byte[] paramArrayOfByte);

  public int startBIOManager(Context paramContext, int paramInt);
}