package IOStream;

// ������ ������� ������� ó���� ��� �ʿ�.
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.*;

public class FileChannelTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		// FileChannel���� ������ ������ �б�
		try( FileInputStream in = new FileInputStream("d:/example/test.txt");
				FileChannel channel = in.getChannel()){
			
			int bufferSize = 1024*8;	// ���� ������ ����
			//���۸� �����
			ByteBuffer buffer = ByteBuffer.allocate(bufferSize);
			
			//�ֿܼ� ����ϱ� ���� ä�� ����
			WritableByteChannel out = Channels.newChannel(System.out);
			
			//ä�ο��� ������ ������ �б�
			while(channel.read(buffer) != -1){
				buffer.flip();		// ������ ����Ʈ�� ���� ��ġ�� �����ϰ�, �������� �պκ����� �ǵ�����.
				out.write(buffer); // ������ ������ �ֿܼ� ���
				buffer.clear();
			}
		}
		
		// FileChannel�� ���Ͽ� ���
		try( FileOutputStream out = new FileOutputStream("d:/example/out.txt");
				FileChannel channel = out.getChannel()){
			
			int bufferSize = 1024*8;
			ByteBuffer buffer = ByteBuffer.allocate(bufferSize);
			
			buffer.put("�����ٶ󸶻�پ���īŸ����".getBytes("EUC-KR"));
			buffer.put("123".getBytes());
			buffer.put("abcdefghijklmnopqrstuvwxyz".getBytes("UTF-8"));
			buffer.putInt(456);
			buffer.flip();	// ��ġ �̵�
			
			channel.write(buffer);
		}

	}

}








