package com.joaocsousa.library.androidstorage;

import android.os.Environment;

import java.io.File;

/**
 * Created by joaosousa on 18/08/14.
 */
public abstract class ExternalStorage implements GeneralStorage {

	@Override
	public boolean isWritable() {
		Boolean result = false;
		String state = Environment.getExternalStorageState();
		if (Environment.MEDIA_MOUNTED.equals(state)) {
			result = true;
		}
		return result;
	}

	@Override
	public boolean isReadable() {
		Boolean result = false;
		String state = Environment.getExternalStorageState();
		if (Environment.MEDIA_MOUNTED.equals(state) ||
			Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) {
			result = true;
		}
		return result;
	}

}
