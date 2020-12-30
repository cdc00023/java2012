# swcodingschool's Java Programming 
## 과정명 : 프레임워크활용 클라우드 기반 마이크로서비스 개발   
> 2020년 12월   
> 1. 자바 기초  
> 1. 자바 중급  
> 1. 자바 심화  
---  

# 1. 자바 기초 
  1. 개발 환경 구축과 'hello swcodingschool'    
    - 자바 설치하기  
      + https://www.oracle.com/kr/downloads/   
      + Java JRE, JDK 다운로드  
    - IDE 설치하기  
      + https://www.eclipse.org/downloads/  
      + eclipse IDE Installer or Packages 클릭 후  
      + Eclipse IDE for Enterprise Java Developers 선택  
    - 첫번째 프로그램, 'Hello, swcodingschool'    
      ```java
      public class HelloSwcodingschool { 
        public static void main(String[] args) {
		// 문자열 출력
		System.out.println("hello, swcodingschool!!");
        }//end of main()
      }// end of class
      
      ```  
      
      - eclipse short keys  
        + Ctrl + F11 : 실행  
        + Alt + 방향키(위/아래) : 현재 커서가 있는 줄 또는 블록을 위/아래로 이동시킨다.  
        + Alt + 방향키(좌/우) : 현재 파일에서 이전 또는 이후에 보던 파일로 이동  
        + Ctrl + Alt + 방향키(위/아래) : 현재 커서가 있는 한줄을 위/아래로 복사한다. Ctrl+C, V보다 편리함.  
        + Ctrl + D : 커서에 있는 한줄을 모두 지운다.  
        + Ctrl + I : 자동 들여쓰기  
        + Ctrl + Shift + F : 문단 자동 정렬  
        + Ctrl + 마우스 좌클릭 : 클래스, 메소드 등 확인  
        + Ctrl + M : 이클립스 창을 전체 화면으로 확대/축소  
        + Ctrl + Shift + C : 커서가 있는 라인 또는 선택 영역 전부를 라인 주석 처리   
        + Ctrl + SpaceBar : 함수 또는 변수 자동완성(이름이 기억안나거나 다른 함수들은 뭐가 있는지 확인할 때  
        + sysout 입력 후 Ctrl + SpaceBar : System.out.println() 자동 생성  
        + Ctrl + shift + W : 열려있는 모든 창을 닫는다. 마우스 우클릭 > Close all과 동일  
        + Ctrl + W : 현재 열려있는 창 하나를 닫는다.  
        + Ctrl + Shift + O : 자동 import  
        + Ctrl + L : 원하는 라인으로 이동  
        + Ctrl + Shift + L : 단축키 확인  
        + Ctrl + Shift + + : 확대  
        + Ctrl + Shift + - : 축소   
        + Ctrl + Alt + H : 선택된 함수를 호출한 곳 찾기. 실행 순서의 역으로 찾아가기 유용  
  1. 자바 사용 이점  
    - 플랫폼 독립적  
    - 객체지향 언어, 쉬운 유지보수와 뛰어난 확장성  
    - 풍부한 기능의 오픈 소스  
  1. 자바로 무엇을 할 수 있을까?  
    - 웹 애플리케이션  
    - 안드로이드 앱  
    - 게임  
  1. 변수와 기본 데이터타입  
  1. 제어흐름 
     ```java
     		// if문, if-else문, 비교연산자, 논리연산자, switch문

		Scanner fromUser = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		String theAge = fromUser.next();

		int age = Integer.parseInt(theAge);

		//if (age >= 20) {
		//	System.out.println("성인입니다.\n");
		//} else {
		//	System.out.println("미성년입니다.\n");
		//} // end of else

		if (age >= 20 && age < 40) {
			System.out.println("청년");
		} else if (age >= 40 && age < 60) {
			System.out.println("장년");
		} else {
			System.out.println("기타");
		}

		Scanner in = new Scanner(System.in);
		System.out.print("좋아하는 색깔은? ");

		String color = in.next();

		switch (color) {
		case "red":
			System.out.println("열정적이시군요?");
			break;
		case "blue":
			System.out.println("감성적이시군요.");
			break;
		case "green":
		case "yellow":
			System.out.println("잘 모르겠어요.");
			break;
		default:
		}// end of switch
     ```
  1. 객체 데이터타입   
  1. ArrayList와 Map  
    - 배열의 단점
      + 같은 타입의 엘레먼트만 사용 가능  
      + 한번 생성하면 길이를 바꿀 수 없음  
    - ArrayList
      + 배열을 사용하기 쉽도록 만든 클래스
      + 객체 내부에서 배열을 관리
        - 자동으로 길이를 조절
      + ArrayList의 생성과 사용
      ```java
         // ArrayList 생성
         ArrayList<String> colors = new ArrayList<>();
         // ArrayList에 데이터 추가
         colors.add("red");
         colors.add("yellow");
         colors.add("green");
         // 데이터접근-인덱스 사용
         colors.get(0);
         colors.get(1);
         // 데이터 모두 삭제
         colors.clear();
      ```
      + ArrayList 특징
        - 데이터 저장을 인덱스 기반으로 수행(배열과 동일)  
        - 데이터의 순서가 있음 sequence data type    
        - 인덱스는 제로 베이스  
      + Map  
        - 데이터를 유일한 키를 통해 관리
        - 데이터를 키/값 쌍으로 저장/관리
          key/value pair  
          인덱스가 없다, 즉 데이터 순서가 없다.
      ```java
         //Map 생성
         HashMap<String, String> products = new HashMap<>();
         //Map에 데이터 추가
         products.put("k01", "korea");
         products.put("k02", "it");
         products.put("k03", "academy");
         //데이터 접근 -키 사용
         products.get("k01");
         //데이터 모두 삭제
         products.clear();
      ```
      
      ```java
      //List 사용
      List<String> myList = new ArrayList<>();  
      myList.add("red");
      myList.add("blue");
      myList.add("green");
      myList.add("yellow");
      System.out.println(myList);
      myList.add("black");
      
      String third = myList.get(2);
      System.out.println(third);
      
      myList.clear();
      System.out.println(myList);
      
      //Immutable list(unmodifiedlist, readonly)
      List<String> readOnlyList = Collections.unmodifiableList(myList);
      System.out.println(readOnlyList);
      
      readOnly.List.add("white");  //컨텐츠 변경 불가 오류 발생
      System.out.println(readOnlyList);
      
      
      // java9의 of method
      List<String> java9List = List.of("red", "blue", "green"); //리스트 생성, 디폴트로 immutable list
      System.out.println(java9List);
      java9List.add("white"); // 변경 불가 오류 발생
      
      // Map (HashMap)
      Map<String, String> myMap = new HashMap<>();
      myMap.put("key1","korea");
      myMap.put("key2","china");
      myMap.put("key3","japan");
      System.out.println(myMap);
      
      myMap.clear();
      System.out.println(myMap);
      
      // Immutable Map
      Map<String, String> immutableMap = Collections.unmodifiableMap(myMap);
      
      
      // Java9 of 메소드
      Map<String, String> java9Map = Map.of("k1","korea", "k2","china","k3","japan");
      
      java9Map.put("k4","america")// 변경불가 오류 발생
      ```
   
  1. 함수  
    - 함수와 메소드  
      + Java에서 함수와 메소드는 동일한 의미로 사용  
      + 메소드가 좀더 기술적으로는 맞는 용어    
        - 클래스 내부에 있는 함수를 특별히 메소드라고 함(자바는 모든 것이 클래스로 구성)  
      + main메소드가 길어지면 클래스로 분리 또는 여러 함수로 분리 가능  
    - 메소드 구조
      + 반환값의 타입(없으면 void)  
      + 메소드 이름
      + 파라미터 타입과 이름
      + 메소드 구현부-구현할 내용 작성
      + 반환할 결과가 있으면 return
      ```java
      public class 클래스이름 {
        접근제한자 반환타입 메소드명(파라미터타입 파라미터명,...){
          ... 실행할 코드 ...
          return 반환변수 혹은 값 또는 수식;
        }
      }
      ```
    - 정적 메소드 선언하고 호출하기
    ```java
    //정적 메소드 선언
    public static double average(double x, double y){
      double sum = x + y;
      return sum / 2;
    }
    
    // main 메소드에서 호출
    public static void main(Stgring[] args){
      double a = 3.0;
      doule b = 2.0;
      double result = average(a,b);
    }
    ```java
   - 배열 파라미터와 반환 값
     + 배열도 파라미터로 전달 가능  
     + 배열은 참조를 통해 전달되어 배열의 내용을 바꿀 수 있음  
     + 배열도 반환 가능  
     ```java
       // 배열안에 두 요소를 맞바꾸는 메소드
       public static int[] firstlast(int[] values){
         if(vlaues.length == 0) return new int[0];
         else return new int[]{values[0], vlaues[values.length-1]};
       }
     ```
   - 가변 인자
     + 파라미터의 개수를 제한하지 않고 여러 개의 파라미터를 받을 수 있음
     + 대표적으로 printf함수
     + 가변 인자는 반드시 메소드 마지막 파라미터이어야 함
     ```java
      //파라미터가 double 배열로 전달됨
      public static double average(double... values){
        double sum = 0;
        for (double v : values) sum += v;
        return vaues.length == 0 ? 0 : sum /values.length;
      }
     ```
  - 값에 의한 호출
    + 기본 자료형에 적용
    + 변수에 값 자체를 저장
    + 변수를 복사하면 변수의 값 자체를 복사
  - 참조에 의한 호출
    + 배열이나 객체를 참조
    + 변수에는 값이 아니라 객체의 주소 값(참조)이 저장
    + 변수를 복사하면 주소가 복사되어 하나의 객체를 참조하게 됨
  ```java
  public static void main(String[] args) {
		// 함수와 메서드 설명
		// 메서드 파라미터 전달 방식-기본타입과 참조타입의 차이점 이해
		int a = 5;
		int b = 3;
		
		int result = a + b;
		System.out.println(result);

		// 덧셈 처리 부분을 메소드로 구성 후 호출
		System.out.println(add(a,b));
		
		// call by value에 의한 값 변경 가능 여부 확인
		int byValue = 5;
		callByValue(byValue);
		System.out.println(byValue);
		
		// call by reference에 의한 값 변경 가능 여부 확인
		ArrayList<String> byRef = new ArrayList<>();
		byRef.add("red");
		byRef.add("blue");
		System.out.println(byRef);
		callByReference(byRef);
		System.out.println(byRef);

	}// end of main
	
	// 메소드로 분리
	public static int add(int first, int second) {
		return first + second;
	}
	// call by value
	public static void callByValue(int param) {
		param += 5;
	}// end of callByValue
	
	// call by reference
	public static void callByReference(ArrayList param) {
		param.add("green");
	}// end of callByReference
  ```
    
      
# 2. 자바 중급   
  1. 객체지향 모델링   
  1. 상속   
  1. 인터페이스   
  1. 람다 표현식  
  1. 예외 처리  
  1. 제네릭과 컬렉션  
  1. 스트림  
  1. 입출력 처리하기  
# 3. 자바 심화  
  1. 스레드  
  1. Reflection & Annotation
  1. JDBC  
  1. GUI Programming
