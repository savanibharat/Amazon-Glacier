package com.dropbox.cmpe.Dropbox.ui.views;

import java.util.ArrayList;
import java.util.List;

import com.yammer.dropwizard.views.View;

public class DeletedFileView extends View{

	//private List<String> filenames;
		List<FilesForMustach> listOfFiles =new ArrayList<FilesForMustach>();
		
		public DeletedFileView(List<FilesForMustach> listOfFiles) {
			super("deletedFiles.mustache");
			this.listOfFiles = listOfFiles;
		}
		
		/**
		 * @return the listOfFiles
		 */
		public List<FilesForMustach> getListOfFiles() {
			return listOfFiles;
		}
		/**
		 * @param listOfFiles the listOfFiles to set
		 */
		public void setListOfFiles(List<FilesForMustach> listOfFiles) {
			this.listOfFiles = listOfFiles;
		}
//		String username;
		
		
		/*public List<String> getFiles() {
			return filenames;
		}*/
}
