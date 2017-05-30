package IOStream;

import java.io.*;

public class FileExam8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File(".");
		{
			String[] fileName = dir.list();
			for(String fileN : fileName){
				System.out.println(fileN);
			}
			
			File[] files = dir.listFiles();
			for(File file : files){
				System.out.println(file.getAbsolutePath());
			}
		}
		
		// FileNameFilter ÀÛ¾÷
		{
			String[] fileNames = dir.list(new FilenameFilter() {
				
				@Override
				public boolean accept(File dir, String name) {
					// TODO Auto-generated method stub
					
					return !name.startsWith(".");
				}
			});
			
			for(String fileName : fileNames){
				System.out.println("Filter fileName : "+fileName);
			}
		}
		
		{
			File[] files = dir.listFiles(new FileFilter() {
				
				@Override
				public boolean accept(File pathname) {
					// TODO Auto-generated method stub
					return pathname.isFile();
				}
			});
			
			for(File file : files){
				System.out.println(file.getAbsolutePath());
			}
		}
	}

}










