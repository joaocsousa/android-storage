package com.joaocsousa.library.androidstorage;

import java.io.File;

/**
 * Created by joaosousa on 19/08/14.
 */
public class ExternalPublicStorage extends ExternalStorage {
	@Override
	public File createFile(DirectoryType directoryType, String fileName) {
		return null;
	}

	@Override
	public File createDirectory(DirectoryType directoryType, String directoryName) {
		return null;
	}

	@Override
	public boolean fileExists(DirectoryType directoryType, String fileName) {
		return false;
	}

	@Override
	public boolean pathExists(DirectoryType directoryType, String path) {
		return false;
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
}