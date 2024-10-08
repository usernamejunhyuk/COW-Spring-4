# [WEEK 01] 온보딩 (기간 : 9/23 ~ 9/26)

## COW SPRING 4기 PRE-ONBOARDING 학습 과제

본격적으로 Spring 학습에 들어가기 전에 여러분은 객체지향 코드에 대해 학습하고 이해하는 시간을 가지실겁니다!

객체지향 코드를 짜기 위해서는 우리가 사용할 언어인 JAVA에 대해 이해하고 있어야합니다.

이 온보딩 과제는 이번 COW Server 파트에 함께 하시는 7분의 개개인의 역량이 다르기 때문에 가장 최소한으로 알고 계셔야 할 내용을 중심으로 선정해봤어요!

많은 양의 정리를 요구하지 않는 과제이니 이해하신 내용을 토대로 간단하게 정리해주시면 됩니다. (1, 2, 3기의 학습자료가 github에 나와있으니 참고하셔도 좋아요☺️)

개인적으로, 분명 학습했던걸 다 기억하실 수 없으실거예요! 저도 마찬가지이고요.. 공부했던 것을 잘 정리해두는 습관을 가지는 것은 분명 큰 도움으로 돌아올 것이라 생각합니다. 그런 의미로 다들 파이팅해봐요!

---
> 아래의 필수 질문은 모든 분들이 정리하고 학습하셔야하는 내용입니다. 선택 질문은 원하시는 분들만 하시면 되지만 분명 학습하시면 큰 도움이 될 것들을 추려봤습니다!

# 필수

## www.google.com 을 치면 일어나는일

1. URL을 입력하면 가장 먼저 DNS를 조회한다.
2. 여러 DNS를 거쳐 IP 주소를 파악한다. 이때 브라우저는 도메인이 캐시에 있는지 확인하고, 없다면 hosts파일, gethostbyname 함수를 통해 IP 주소를 받아온다.
3. IP 주소를 얻은 후 웹 브라우저는 TCP/IP 프로토콜을 이용해 서버와의 연결을 시도한다. 이때 TCP 소켓 통신을 사용한다.
4. 연결에 성공한다면, HTTP 통신을 통해 서버와 웹 브라우저가 통신한다.
5. 통신을 통해 브라우저가 HTML 컨텐츠를 사용자에게 보여준다.<br/>

이러한 일련의 과정을 거쳐 www.google.com 과 같은 url을 입력했을때 브라우저에 사이트를 띄울 수 있다.<br/>

### DNS

DNS란, 네트워크에서 도메인이나 호스트 이름을 숫자로 된 IP 주소로 해석해주는 TCP/IP 네트워크 서비스이다.<br/>
계층적 이름 구조를 갖는 분산형 데이터베이스로 구성되고 클라이언트 서버 모델을 사용한다.<br/>
DNS는 3가지 요소로 구성되는데,<br/>
도메인 네임 스페이스": 데이터에 대한 이름 관련 규칙을 정의하고 IP 주소 요청에 IP 주소를 반환한다.<br/>
네임 서버: 도메인 트리 구조와 트리에 보관된 정보 집합체를 관리하는 프로그램이다.<br/>
해석기: 네임 서버로부터 클라이언트의 요청 정보를 얻어내는 프로그램이다.<br/>

### TCP/IP 프로토콜

프로토콜은 통신 시스템이 데이터를 교환하기 위해 사용하는 통신 규칙이다.<br/>
네트워크 프로토콜을 통해 데이터를 교환할 때는 먼저 데이터를 특정 형태로 규격화 하려는 작업이 필요한데, 이는 네트워크에서 데이터를 프로토콜에 맞춰 묶어주기 때문이다.<br/>
TCP/IP 프로토콜이란 컴퓨터들이 인터넷에 엑세스 가능하게 하는 네트워크 프로토콜들의 모음으로, TCP/IP가 가장 많이 사용되는 대표적인 핵심 프로토콜이다.<br/>
일반적으로 네트워크는 계층적으로 구성이 되는데, TCP/IP는 네트워크 엑세스 계층, 인터넷 계층, 전달 게층 및 응용 계층의 4개층으로 구성되어 있다.<br/>
가장 상위 계층은 애플리케이션 계층으로 일반적으로 사용자가 접하는 웹서비스, 메일 전송 등의 서비스를 제공하며 HTTP, SMTP, FTP 등의 프로토콜을 포함한다.<br/>
전달 계층은 종점간 연결과 데이터 전달을 담당한다. 애플리케이션의 메시지를 좀 더 작은 패킷으로 나누고, 수신된 패킷들을 원래대로 재조립하는 일을 수행한다.<br/>
전송 제어 프로토콜(TCP 프로토콜)은 오류를 제어하고, 흐름제어 및 혼잡제어와 같은 일을 수행한다.<br/>
IP 프로토콜은 인터넷 계층을 담당하며, IP 주소에 기반해 각 패킷이 목적지까지 가도록 하는 라우팅(routing)을 담당한다.<br/>
네트워크 엑세스 계층은 IP 패킷이 물리적 네트워크를 통해 실제적으로 전달되도록 데이터 전송을 담당한다. 최하위 계층이며 MAC 주소를 기반으로 노드 간 전송 또한 담당한다.<br/>

### WS, WAS

WS는 Web Server의 약자, WAS는 Web Application Server의 약자이다.<br/>
DNS 및 IP 주소 조회, TCP 연결 HTML 컨텐츠를 웹 브라우저(클라이언트)에 전달하는 것은 WS의 역할이다.<br/>
WAS는 주로 동적인 컨텐츠를 제공하는 역할로, 요청에 맞는 데이터를 데이터베이스에서 가져와 그때 그때 결과를 제공하는데에 주로 사용된다.<br/>
보통 WS와 WAS를 조합해서 서버를 구성하며 이 경우 역할 분담을 통한 서버 부하 방지, 한 서버에서 여러 WAS를 사용할 수 있는 등의 장점이 있다.<br/>

---

## API, HTTP통신

API란, 운영체제와 응용프로그램 사이에 통신에 사용되는 언어나 메세지 형식을 말한다.<br/>
API는 프로그램 내에서 실행을 위해 특정 서브루틴에 연결을 제공하는 함수를 호출해 구현한다.<br/>
쉽게 말해서 응용 프로그램과 소통하기 위한 일련의 약속이 API라고 할 수 있다.<br/>
최근에는 여러 기업이나 국가 기관이 자체 서버를 운영하며 데이터를 관리하고 있는데, 이런 서버에 접근하여 데이터를 사용할 수 있도록 '오픈 API'라는 형태로 API를 공개하고 있다.<br/>

HTTP 통신이란, Hyper Text Transfer Protocol의 약자로 클라이언트와 서버 간 통신을 위한 통신 규칙 세트 또는 프로토콜을 말한다.<br/>
네트워크 통신을 작동하게 하는 기본 기술으로, HTTPS는 HTTP에서 서버와 클라이언트 간 통신에서 암호화된 연결을 지원하는 기술이다.<br/>
HTTP 통신은 먼저 HTTP 클라이언트가 요청문, 헤더, 바디로 구성된 형식에 맞춰서 HTTP 서버에 요청 메시지를 보낸다.<br/>
그 후 HTTP 서버는 HTTP 클라이언트가 보낸 요청 메시지를 수신해 상태문, 헤더, 바디로 구성된 형식에 맞춰 응답 메시지를 보낸다.<br/>
이러한 통신 방식을 비상태 연결이라고 한다.<br/>
HTTP의 요청 및 응답 메시지는 MIME(Multipurpose Internet Message Extensions) 유사 구조를 사용해 데이터를 전송한다.<br/>

---

## 백엔드가 하는 일

1. 데이터베이스 제작, 유지 및 보수<br/>
2. 데이터 유효성 검사<br/>
3. 서버 측 소프트웨어 프로그래밍<br/>

이 외에도 서버 측에서 발생하는 모든 코드를 작성하는 것이 백엔드의 업무이기에, 계산 수행이나 머신 러닝 사용 등의 업무도 맡을 수 있다.


---

## 객체지향 특징 및 장점

프로세스 지향 방법과 데이터 지향 방법의 문제점을 해결하기 위해 고안된 것이 객체 지향(Object-oriented) 방법이다.<br/>
기능이나 데이터 대신 객체가 중심이 되는 것이 특징으로, 데이터(속성)를 가장 먼저 찾고 그 데이터를 조작하는 메서드(함수)를 찾아 그 둘을 객체로 묶어 모듈을 구성한다.<br/>
또한 필요한 객체를 간단히 추가할 수 있어 확장성이 높고, 객체의 재사용을 통해 개발 비용과 시간을 줄일 수 있다.<br/>

---

## 코드 컨벤션이란

코드 컨벤션이란 프로그램 개발을 위한 스타일 가이드라인이다.<br/>
기본적으로 변수와 함수에 대한 명명 및 선언에 대한 규칙, 공백 및 들여쓰기 사용 규칙 등을 포함하고 있으며, 개발 환경에 따라 추가되기도 한다.<br/>
이러한 코드 컨벤션을 사용하면 코드 가독성의 향상을 기대할 수 있으며, 프로젝트에서 코드의 유지 및 관리가 원활해질 수 있다.<br/>
Oracle에서 97년에 투고한 Java 코드 컨벤션에 코드 컨벤션은 '소프트웨어의 가독성을 높여주며 새 엔지니어들이 코드를 더 빠르고 철저히 이해할 수 있도록 한다.' 라고 명시되어 있을 정도로 예전부터 개발의 중요한 축이었다고 할 수 있다.
<br/>

---

## MVC 패턴
소프트웨어 설계에서 3가지의 구성 요소인 모델(Model), 뷰(View), 컨트롤러(Controller)를 활용한 설계 방식이다.<br/>
모델(Model)은 소프트웨어 내에서 데이터(Data)를 의미하고, 뷰(View)는 사용자에게 보이는 영역을 의미한다.<br/>
이러한 모델과 뷰의 상호작용을 컨트롤러(Controller)가 관리하는 구조로 MVC는 구성되어 있다.<br/>
이러한 모델, 뷰, 컨트롤러가 독립적으로 분리되어있기 때문에 다수의 프로그래머가 각 기능을 개발할 수 있고, 기능을 업데이트 할 때에도 기존 요소를 활용할 수 있어 편리하다.<br/>
GUI 개발에 지속적으로 사용되어 왔으며 오늘날 업계 표준 개발 프레임워크로 사용되고 있다.<br/>
MVC 모델을 웹 애플리케이션에 쉽게 적용가능한 라이브러리로는 앵귤러자바스크립트(AngularJS), 엠버자바스크립트(EmberJS), 자바스크립트엠브이시(javaScriptMVC) 등이 있다.<br/>
<br/>

1. 컨트롤러(Controller)<br/>
컨트롤러는 기본적으로 뷰와 모델 간 상호 연결을 중개하는 역할을 맡는다.<br/>
사용자의 입력을 받아 모델을 업데이트하고 맞는 뷰를 찾아 데이터를 전송한다.<br/>
<br/>
2. 뷰(View)<br/>
사용자를 위한 사용자 인터페이스를 생성한다.<br/>
뷰에 띄우는 데이터는 모델에 구성되어 있으며 컨트롤러를 통해 데이터를 가져온다.<br/>
즉 뷰는 컨트롤러와만 상호작용하지 모델과는 상호작용 하지 않는다.<br/>
<br/>
3. 모델(Model)<br/>
일반적인 유저 데이터 부터 비즈니스 로직 관련 데이터 등 모든 데이터 관련 논리는 모델에 해당한다.<br/>
데이터베이스에서 데이터를 추가할 수 있으며, 컨트롤러는 자체적으로 데이터베이스와 상호 작용할 수 없기 때문에 필연적으로 모델을 거쳐 상호 작용한다.<br/>
<br/>
---

## 참고 자료
[모델 · 뷰 · 컨트롤러](https://terms.naver.com/entry.naver?docId=5714708&cid=42346&categoryId=42346)<br/>
[MVC Framework Introduction](https://www.geeksforgeeks.org/mvc-framework-introduction/#what-is-mvc)<br/>
[JavaScript Style Guide](https://www.w3schools.com/js/js_conventions.asp#:~:text=Coding%20conventions%20are%20style%20guidelines%20for%20programming.%20They,the%20use%20of%20white%20space%2C%20indentation%2C%20and%20comments.)<br/>
[Java Code Conventions](https://www.oracle.com/technetwork/java/codeconventions-150003.pdf)<br/>
[객체지향 방법](https://terms.naver.com/entry.naver?docId=3532990&cid=58528&categoryId=58528)<br/>
[What Does a Back-End Developer Do?](https://www.codecademy.com/resources/blog/what-does-a-back-end-developer-do/?utm_source=ccblog&utm_medium=ccblog&utm_campaign=ccblog&utm_content=cw_what_is_back_end_blog)<br/>
[API](https://terms.naver.com/entry.naver?docId=1179553&cid=40942&categoryId=32837)<br/>
[API](https://terms.naver.com/entry.naver?docId=6653674&cid=69974&categoryId=69974)<br/>
[HTTP와 HTTPS의 차이점은 무엇인가요?](https://aws.amazon.com/ko/compare/the-difference-between-https-and-http/)<br/>
[요청과 응답](https://terms.naver.com/entry.naver?docId=2271986&cid=51207&categoryId=51207&expCategoryId=51207)<br/>
[HTTP의 동작 과정](https://terms.naver.com/entry.naver?docId=2271987&cid=51207&categoryId=51207&expCategoryId=51207)<br/>
[웹 브라우저에서 URL을 입력했을 때 일어나는 과정](https://f-lab.kr/insight/web-browser-url-process)<br/>
[주소창에 url을 검색하면 생기는 일들 (DNS, ARP, TCP, TLS/SSL, HTTP)](https://goldfishhead.tistory.com/23)<br/>
[DNS](https://terms.naver.com/entry.naver?docId=2271994&cid=51207&categoryId=51207#TABLE_OF_CONTENT3)<br/>
[DNS](https://terms.naver.com/entry.naver?docId=1179826&cid=40942&categoryId=32848)<br/>
[[WEB] 🌐 웹 서비스 구조 (Web서버 / 웹컨테이너 / WAS) 정리](https://inpa.tistory.com/entry/WEB-%F0%9F%8C%90-%EC%9B%B9-%EC%84%9C%EB%B9%84%EC%8A%A4-%EA%B5%AC%EC%A1%B0-%EC%A0%95%EB%A6%AC#web_server)<br/>
[WAS, WS 그리고 servlet](https://velog.io/@qf9ar8nv/WAS-WS-%EC%A0%95%EB%A6%AC)<br/>
