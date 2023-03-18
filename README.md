# project1

## 예제 연습
* 게시판(웹 애플리케이션) 구현 및 AWS 배포
---
### AWS EC2(6장)
* 지정된 IP에서만 ssh 접속이 가능하도록 설정
* pem키 생성
* EIP(탄력적 IP) 할당
* putty로 ssh 접속
  * pem키를 ppk파일로 변환 후 사용가능
* 리눅스 설정
  * Java 설치
  * 타임존 변경(KST)
  * Hostname 변경
  * /etc/hosts 파일에 Hostname 등록

### AWS RDS(7장)
* MariaDB
* 파라미터 설정
  * 타임존
  * Character Set
  * Max Connection
* 파라미터 그룹을 DB에 연결
* 인바운드 규칙 적용으로 EC2와 RDS간에 접근이 가능
* 인텔리제이 DB플러그인을 이용해 RDS 연결
* putty로 ssh 접속 
  * MySQL CLI 설치
  * RDS에 접속

### EC2 서버에 프로젝트 배포(8장)
* EC2에 접속 후 git 설치
  * 디렉토리 생성 후 git clone 진행
* 배포
  * git clone 혹은 git pull을 통해 새버전의 프로젝트를 받음
  * Gradle이나 Maven을 통해 프로젝트 테스트와 빌드
  * EC2 서버에서 해당 프로젝트 실행 및 재실행
* 빔으로 편집 진행
  * 쉘 스크립트 작성
  * 외부 Security 파일 등록하기
* 스프링 부트 프로젝트로 RDS 접근하기