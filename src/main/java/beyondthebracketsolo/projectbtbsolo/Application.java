package beyondthebracketsolo.projectbtbsolo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//TODO: Redis 연결
		//TODO: JWT 토큰 연결
		//TODO: 리모트 서버 설정
		//TODO: sonar cloud 설정
		//TODO: git action 설정(빌드 -> 배포 -> 테스트 서버 구동)
		SpringApplication.run(Application.class, args);
	}

}
