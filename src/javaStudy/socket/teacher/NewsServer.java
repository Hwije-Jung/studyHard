package javaStudy.socket.teacher;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewsServer {
	private static DatagramSocket datagramSocket = null;

	private static ExecutorService es = Executors.newFixedThreadPool(10);
	//10개로 제한
	public static void main(String[] args) throws Exception {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("서버를 종료하려면 q를 입력하고 Enter 키를 입력하세요.");
		System.out.println("--------------------------------------------------------------------");		
		
		//UDP 서버 시작
		startServer();
		
		//키보드 입력
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String key = scanner.nextLine();
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}
		scanner.close();
		
        //TCP 서버 종료
		stopServer();
	}	
		
	public static void startServer() {
		//작업 스레드 정의

		es.execute( ()-> {
			try {
				//DatagramSocket 생성 및 Port 바인딩
				datagramSocket = new DatagramSocket(50001);
				// udp 통신에는 datagramsocket 을 쓴다.
				// serversocket 을 만들어서 accept 함수를 통해 소켓을 받지 않는다.
				// 서버쪽 udp 포트만 명시해둔다 (받은 패킷에서는 ip, port를 알 수 있어서 전달가능)
				System.out.println( "[서버] 시작됨");

				while(true) {
					//클라이언트가 구독하고 싶은 뉴스 주제 얻기
					DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
					//의 첫 번째 매개값은 수신된 데이터를 저장할 배열이고 두 번째 매개값은 수신할 수 있는 최대 바이트 수
					// 받을 데이터그램 패킷의 사이즈를 정의 해줘야 한다.

					datagramSocket.receive(receivePacket);
					String newsKind = new String(receivePacket.getData(), 0, receivePacket.getLength(), "UTF-8");

					//클라이언트의 IP와 Port 얻기
					SocketAddress socketAddress = receivePacket.getSocketAddress();
					//  이걸로 클라이언트 패킷에서 ip 와 포트번호를 알수 있다.

					//10개의 뉴스를 클라이언트로 전송
					for(int i=1; i<=10; i++) {
						String data = newsKind + ": 뉴스" + i;
						byte[] bytes = data.getBytes("UTF-8");
						DatagramPacket sendPacket = new DatagramPacket(bytes, 0, bytes.length, socketAddress);

						// 보낼 데이터그램 패킷의 사이즈를 정의 해줘야한다.
						datagramSocket.send(sendPacket);
					}
				}
			} catch (Exception e) {
				System.out.println("[서버] " + e.getMessage());
			}});
		};
		//스레드 시작

		
	public static void stopServer() {
		//DatagramSocket을 닫고 Port 언바인딩
		datagramSocket.close();
		System.out.println( "[서버] 종료됨 ");
	}
}