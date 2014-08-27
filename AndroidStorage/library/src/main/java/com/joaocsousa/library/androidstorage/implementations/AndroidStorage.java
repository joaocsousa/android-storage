package com.joaocsousa.library.androidstorage.implementations;

import android.content.Context;

import com.joaocsousa.library.androidstorage.DirectoryType;
import com.joaocsousa.library.androidstorage.interfaces.Storage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

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

	protected void copy(File source, File destination) throws IOException {
		FileInputStream inStream = new FileInputStream(source);
		FileOutputStream outStream = new FileOutputStream(destination);
		FileChannel inChannel = inStream.getChannel();
		FileChannel outChannel = outStream.getChannel();
		inChannel.transferTo(0, inChannel.size(), outChannel);
		inStream.close();
		outStream.close();
	}

}
