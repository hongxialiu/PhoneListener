package com.andrew.systemservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * 监听android开机广播（只要手机一开机就开始监听）
 */
public class BootReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Intent i = new Intent(context,SystemService.class);
		context.startService(i);
	}
}
