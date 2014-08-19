package com.joaocsousa.library.androidstorage;

import android.content.Context;

import com.joaocsousa.library.androidstorage.implementations.ExternalPrivateStorage;
import com.joaocsousa.library.androidstorage.implementations.ExternalPublicStorage;
import com.joaocsousa.library.androidstorage.implementations.InternalStorage;
import com.joaocsousa.library.androidstorage.interfaces.Storage;

/**
 * Created by joaosousa on 19/08/14.
 */
public class StorageManager {

	private Context mContext;

	private StorageManager(Context context) {
		mContext = context;
	}

	public static StorageManager from(Context context) {
		return new StorageManager(context);
	}

	public Storage getInternalStorage() {
		return new InternalStorage().withContext(mContext);
	}

	public Storage getExternalPrivateStorage() {
		return new ExternalPrivateStorage().withContext(mContext);
	}

	public Storage getExternalPublicStorage() {
		return new ExternalPublicStorage().withContext(mContext);
	}

}
