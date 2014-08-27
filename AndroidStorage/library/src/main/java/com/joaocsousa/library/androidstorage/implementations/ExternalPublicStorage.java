package com.joaocsousa.library.androidstorage.implementations;

import android.content.Context;

import com.joaocsousa.library.androidstorage.DirectoryType;

import java.io.File;

import static android.os.Environment.getExternalStoragePublicDirectory;

/**
 * Created by joaosousa on 19/08/14.
 */
public class ExternalPublicStorage extends ExternalStorage {

	@Override
	public Boolean createFile(DirectoryType directoryType, String fileName) {
		return null;
	}

	@Override
	public Boolean createDirectory(DirectoryType directoryType, String directoryName) {
		return null;
	}

	@Override
	public Boolean fileExists(DirectoryType directoryType, String fileName) {
		return false;
	}

	@Override
	public Boolean directoryExists(DirectoryType directoryType, String path) {
		return false;
	}

	@Override
	public Boolean createFile(String fileName) {
		return null;
	}

	@Override
	public Boolean createDirectory(String directoryName) {
		return null;
	}

	@Override
	public Boolean fileExists(String fileName) {
		return false;
	}

	@Override
	public Boolean directoryExists(String path) {
		return false;
	}

	@Override
	public File getFile(String path, String fileName, Boolean createIfNotFound) {
		return null;
	}

	@Override
	public File getDirectory(String path, Boolean createIfNotFound) {
		return null;
	}

	@Override
	public Boolean copyFile(String origin, String destination) {
		return false;
	}

	@Override
	public Boolean copyFile(String origin, File destination) {
		return false;
	}

	@Override
	public Boolean move(File origin, String destination) {
		return false;
	}

	@Override
	public Boolean move(File origin, File destination) {
		return false;
	}

	@Override
	public File getRootDirectory(DirectoryType type) {
		return getExternalStoragePublicDirectory(type.getType());
	}
}
