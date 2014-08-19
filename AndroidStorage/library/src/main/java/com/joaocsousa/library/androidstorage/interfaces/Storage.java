package com.joaocsousa.library.androidstorage.interfaces;

import com.joaocsousa.library.androidstorage.DirectoryType;

import java.io.File;

/**
 * Created by joaosousa on 17/08/14.
 */
public interface Storage {

	boolean isWritable();

	boolean isReadable();

	File createFile(String fileName);

	File createDirectory(String directoryName);

	boolean fileExists(String fileName);

	boolean pathExists(String path);

	File getFile(String path, String fileName, boolean createIfNotFound);

	File getDirectory(String path, boolean createIfNotFound);

	boolean copyFile(String origin, String destination);

	boolean copyFile(String origin, File destination);

	boolean move(File origin, String destination);

	boolean move(File origin, File destination);

	File createFile(DirectoryType directoryType, String fileName);

	File createDirectory(DirectoryType directoryType, String directoryName);

	boolean fileExists(DirectoryType directoryType, String fileName);

	boolean pathExists(DirectoryType directoryType, String path);

}
