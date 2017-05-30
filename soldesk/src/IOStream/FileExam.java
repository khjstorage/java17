package IOStream;

import java.io.*;

public class FileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("d:/example/filefolder/sample.txt");
		
		if(file.exists()){
			try{
				System.out.println("getName : "+file.getName());
				System.out.println("getPath : "+file.getPath());
				System.out.println("getAbsolutePath : " + file.getAbsolutePath());
				System.out.println("getCanonicalPath : "+file.getCanonicalPath());
				System.out.println("getParent : "+file.getParent());
				
				// 파일의 속성 알아보기
				if(file.canWrite()) 
					System.out.println(file.getName()+"은 쓸 수 있습니다.");
				if(file.canRead())
					System.out.println(file.getName()+"은 읽을 수 있습니다.");
				
				// 객체의 파일 또는 폴더 여부 체크
				if(file.isFile()){
					System.out.println(file.getName()+"은 파일입니다.");
				}else if(file.isDirectory()){
					System.out.println(file.getName()+"은 폴더입니다.");
				}else{
					System.out.println(file.getName()+"은 파일도 폴더도 아닙니다.");
				}
				
				System.out.println(file.getName()+"의 길이는 "+file.length()+" 입니다.");
			}catch(IOException e){
				System.err.println(e);
			}
		}else{
			System.out.println("파일을 찾을 수 없습니다.");
		}
	}

}








