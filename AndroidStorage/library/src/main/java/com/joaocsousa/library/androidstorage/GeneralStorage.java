package com.joaocsousa.library.androidstorage;

import java.io.File;

/**
 * Created by joaosousa on 17/08/14.
 */
public interface GeneralStorage extends Storage {

	File createFile(DirectoryType directoryType, String fileName);

	File createDirectory(DirectoryType directoryType, String directoryName);

	boolean fileExists(DirectoryType directoryType, String fileName);

	boolean pathExists(DirectoryType directoryType, String path);

}
