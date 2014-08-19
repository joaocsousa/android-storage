package com.joaocsousa.library.androidstorage.implementations;

import android.content.Context;
import android.util.Log;

import com.joaocsousa.library.androidstorage.DirectoryType;
import com.joaocsousa.library.androidstorage.StorageManager;
import com.joaocsousa.library.androidstorage.interfaces.Storage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import static java.lang.String.valueOf;
import static java.util.Calendar.getInstance;

/**
 * Created by joaosousa on 19/08/14.
 */
public class InternalStorage extends AndroidStorage {

	@Override
	public File createFile(DirectoryType directoryType, String fileName) {
		throw new UnsupportedOperationException("Internal storage does not support directory types");
	}

	/**
	 * Same as {@link com.joaocsousa.library.androidstorage.implementations.InternalStorage#createDirectory(String)}
	 * because directoryType is ignored
	 * @return
	 */
	@Override
	public File createDirectory(DirectoryType directoryType, String directoryName) {
		return createDirectory(directoryName);
	}

	/**
	 * Same as {@link com.joaocsousa.library.androidstorage.implementations.InternalStorage#fileExists(String)}
	 * because directoryType is ignored
	 * @return
	 */
	@Override
	public boolean fileExists(DirectoryType directoryType, String fileName) {
		return fileExists(fileName);
	}

	/**
	 * Same as {@link com.joaocsousa.library.androidstorage.implementations.InternalStorage#pathExists(String)}
	 * because directoryType is ignored
	 * @return
	 */
	@Override
	public boolean pathExists(DirectoryType directoryType, String path) {
		return pathExists(path);
	}

	@Override
	public boolean isWritable() {
		return true;
	}

	@Override
	public boolean isReadable() {
		return true;
	}

	@Override
	public File createFile(String fileName) {
		return null;
	}

	@Override
	public File createDirectory(String directoryName) {
		return null;
	}

	@Override
	public boolean fileExists(String fileName) {
		return false;
	}

	@Override
	public boolean pathExists(String path) {
		return false;
	}

	@Override
	public File getFile(String path, String fileName, boolean createIfNotFound) {
		return null;
	}

	@Override
	public File getDirectory(String path, boolean createIfNotFound) {
		return null;
	}

	@Override
	public boolean copyFile(String origin, String destination) {
		return false;
	}

	@Override
	public boolean copyFile(String origin, File destination) {
		return false;
	}

	@Override
	public boolean move(File origin, String destination) {
		return false;
	}

	@Override
	public boolean move(File origin, File destination) {
		return false;
	}

	@Override
	public File getRootDirectory(DirectoryType type) {
		return mContext.getFilesDir();
	}
}
