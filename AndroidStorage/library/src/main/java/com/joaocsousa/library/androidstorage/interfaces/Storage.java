package com.joaocsousa.library.androidstorage.interfaces;

import com.joaocsousa.library.androidstorage.DirectoryType;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by joaosousa on 17/08/14.
 */
public interface Storage {

	Boolean isWritable();

	Boolean isReadable();

	Boolean createFile(String fileName) throws IOException;

	Boolean createDirectory(String directoryName);

	Boolean fileExists(String fileName);

	Boolean directoryExists(String path);

	File getFile(String path, String fileName, Boolean createIfNotFound);

	File getDirectory(String path, Boolean createIfNotFound);

	Boolean copyFile(String origin, String destination);

	Boolean copyFile(String origin, File destination);

	Boolean move(File origin, String destination);

	Boolean move(File origin, File destination);

	Boolean createFile(DirectoryType directoryType, String fileName);

	Boolean createDirectory(DirectoryType directoryType, String directoryName);

	Boolean fileExists(DirectoryType directoryType, String fileName);

	Boolean directoryExists(DirectoryType directoryType, String path);

}
