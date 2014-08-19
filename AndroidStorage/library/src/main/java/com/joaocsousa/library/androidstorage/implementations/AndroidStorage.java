package com.joaocsousa.library.androidstorage.implementations;

import android.content.Context;

import com.joaocsousa.library.androidstorage.DirectoryType;
import com.joaocsousa.library.androidstorage.interfaces.Storage;

import java.io.File;

/**
 * Created by joaosousa on 19/08/14.
 */
public abstract class AndroidStorage implements Storage {

	Context mContext;

	public Storage withContext(Context context) {
		mContext = context;
		return this;
	}

	public abstract File getRootDirectory(DirectoryType type);

}
