package com.joaocsousa.library.androidstorage.implementations;

import com.joaocsousa.library.androidstorage.DirectoryType;

import java.io.File;
import java.io.IOException;

import static java.lang.String.valueOf;
import static java.util.Calendar.getInstance;

/**
 * Created by joaosousa on 19/08/14.
 */
public class InternalStorage extends AndroidStorage {

	/**
	 * Same as {@link com.joaocsousa.library.androidstorage.implementations.InternalStorage#createFile(String)}
	 * @param directoryType - ignored
	 * @param fileName - the file name
	 * @return
	 */
	@Override
	public Boolean createFile(DirectoryType directoryType, String fileName) {
		return createFile(fileName);
	}

	/**
	 * Same as {@link com.joaocsousa.library.androidstorage.implementations.InternalStorage#createDirectory(String)}
	 * @param directoryType - ignored
	 * @param directoryName - the directory name
	 * @return
	 */
	@Override
	public Boolean createDirectory(DirectoryType directoryType, String directoryName) {
		return createDirectory(directoryName);
	}

	/**
	 * Same as {@link com.joaocsousa.library.androidstorage.implementations.InternalStorage#fileExists(String)}
	 * @param directoryType - ignored
	 * @param fileName - the file name
	 * @return
	 */
	@Override
	public Boolean fileExists(DirectoryType directoryType, String fileName) {
		return fileExists(fileName);
	}

	/**
	 * Same as {@link com.joaocsousa.library.androidstorage.implementations.InternalStorage#directoryExists(String)}
	 * @param directoryType - ignored
	 * @param path - the path name
	 * @return
	 */
	@Override
	public Boolean directoryExists(DirectoryType directoryType, String path) {
		return directoryExists(path);
	}

	@Override
	public Boolean isWritable() {
		return true;
	}

	@Override
	public Boolean isReadable() {
		return true;
	}

	@Override
	public Boolean createFile(String fileName) {
		return getDirectory(fileName, true) != null;
	}

	@Override
	public Boolean createDirectory(String directoryName) {
		return getDirectory(directoryName, true) != null;
	}

	@Override
	public Boolean fileExists(String fileName) {
		File file = new File(fileName);
		return file.isFile() && file.exists();
	}

	@Override
	public Boolean directoryExists(String path) {
		File directory = new File(path);
		return directory.isDirectory() && directory.exists();
	}

	@Override
	public File getFile(String path, String fileName, Boolean createIfNotFound) {
		File file = new File(getRootDirectory(null), fileName);
		if (createIfNotFound) {
			try {
				if (!file.createNewFile()) {
					file = null;
				}
			} catch (IOException e) {
				file = null;
				e.printStackTrace();
			}
		}
		return file;
	}

	@Override
	public File getDirectory(String path, Boolean createIfNotFound) {
		File file = new File(getRootDirectory(null), path);
		if (createIfNotFound) {
			if (!file.mkdirs()) {
				file = null;
			}
		}
		return file;
	}

	@Override
	public Boolean copyFile(String origin, String destination) {
		Boolean result;
		try {
			copy(new File(getRootDirectory(null), origin), new File(getRootDirectory(null), destination));
			result = false;
		} catch (IOException e) {
			e.printStackTrace();
			result = false;
		}
		return result;
	}

	@Override
	public Boolean copyFile(String origin, File destination) {
		Boolean result;
		try {
			copy(new File(getRootDirectory(null), origin), destination);
			result = false;
		} catch (IOException e) {
			e.printStackTrace();
			result = false;
		}
		return result;
	}

	@Override
	public Boolean move(File origin, String destination) {
		return origin.renameTo(new File(getRootDirectory(null), destination));
	}

	@Override
	public Boolean move(File origin, File destination) {
		return origin.renameTo(destination);
	}

	/**
	 * Returns the root directory
	 * @param type directory type is ignored
	 * @return
	 */
	@Override
	public File getRootDirectory(DirectoryType type) {
		return mContext.getFilesDir();
	}
}
