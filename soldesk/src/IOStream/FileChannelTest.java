package IOStream;

// 파일의 입출력을 고속으로 처리할 경우 필요.
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.*;

public class FileChannelTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		// FileChannel에서 파일의 내용을 읽기
		try( FileInputStream in = new FileInputStream("d:/example/test.txt");
				FileChannel channel = in.getChannel()){
			
			int bufferSize = 1024*8;	// 버퍼 사이즈 설정
			//버퍼를 만들기
			ByteBuffer buffer = ByteBuffer.allocate(bufferSize);
			
			//콘솔에 출력하기 위한 채널 생성
			WritableByteChannel out = Channels.newChannel(System.out);
			
			//채널에서 파일의 내용을 읽기
			while(channel.read(buffer) != -1){
				buffer.flip();		// 버퍼의 리미트를 읽은 위치에 설정하고, 포지션을 앞부분으로 되돌린다.
				out.write(buffer); // 버퍼의 내용을 콘솔에 출력
				buffer.clear();
			}
		}
		
		// FileChannel로 파일에 출력
		try( FileOutputStream out = new FileOutputStream("d:/example/out.txt");
				FileChannel channel = out.getChannel()){
			
			int bufferSize = 1024*8;
			ByteBuffer buffer = ByteBuffer.allocate(bufferSize);
			
			buffer.put("가나다라마사바아차카타파하".getBytes("EUC-KR"));
			buffer.put("123".getBytes());
			buffer.put("abcdefghijklmnopqrstuvwxyz".getBytes("UTF-8"));
			buffer.putInt(456);
			buffer.flip();	// 위치 이동
			
			channel.write(buffer);
		}

	}

}








