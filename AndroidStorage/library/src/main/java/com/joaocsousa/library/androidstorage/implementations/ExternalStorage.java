package com.joaocsousa.library.androidstorage.implementations;

import android.content.Context;
import android.os.Environment;

import com.joaocsousa.library.androidstorage.DirectoryType;

import java.io.File;

import static android.os.Environment.MEDIA_MOUNTED;
import static android.os.Environment.MEDIA_MOUNTED_READ_ONLY;
import static android.os.Environment.getExternalStorageState;

/**
 * Created by joaosousa on 18/08/14.
 */
public abstract class ExternalStorage extends AndroidStorage {

	@Override
	public Boolean isWritable() {
		Boolean result = false;
		String state = getExternalStorageState();
		if (MEDIA_MOUNTED.equals(state)) {
			result = true;
		}
		return result;
	}

	@Override
	public Boolean isReadable() {
		Boolean result = false;
		String state = getExternalStorageState();
		if (MEDIA_MOUNTED.equals(state) ||
			MEDIA_MOUNTED_READ_ONLY.equals(state)) {
			result = true;
		}
		return result;
	}

}
