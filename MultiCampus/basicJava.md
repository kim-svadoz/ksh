# 0. basicJAVA

* 단순 코더가 아니라 구조를 바꿀 수 있어야 한다.
* R&D에서 개발할 거면 전체적인 흐름을 파악할 수 있어야 한다.

## 0. 초기 환경설정

1. jdk 다운로드
2. 실행
3. 환경설정
   1. JAVA_HOME
   2. PATH
4. 에디터 다운로드
   1. eclipse
   2. edieplus

## 1. 자바 application

### 0. 실행환경

* java "인터프리터"로 실행
  * start point -> public static void main(String [agrs]){}
* jar파일 - java아카이브. (rt.jar) => API 라이브러리
* jar을 JVM에 올려놓으면 알아서 실행
* output -> 자동으로 bin폴더에 저장
* 소스파일 -> src 폴더에 저장

#### 1. 메모리

**static**              /                 **stack**                   /             **heap**

​						/  -실행될 파일이 올라온다 / 		- API의 클래스 => 객체(인스턴스)

​						/											/ 		 - 어디에 올라온다는 주소가 따로 있다.

​					   /  				int i = 10			/  		- JVM이 인식할 수 있는 공간

​									main문{

​									i = 10				}

### 1. 실행순서

1. java 소스파일 설정
   1. 모든 파일로 변경
   2. 확장자는 .java
2. 컴파일
   * JVM 위에서 실행될 수 있도록 변경
   * java 파일명.java
3. .class파일 생성(byte code or classfile)
4. 자바실행
   * java 파일명(.class파일의 파일명)



## 2. 자바 기본문법

### 1. 이모저모

​	메소드명(type    name)

* 외부에서 값을 입력받을 매개변수를 설정해주어야 한다.

* why? - JVM이 인식하기 위해서 = 메모리에 올려놓아야 하기 때문에!

* return : Method 처리 후에 되돌아 오는 결과값 => 오직 한 개만 가능하다

  * void는 return값이 없다

* Throws : 주의사항

* 자바는 메모리 관리를 개발자가 안한다 !! 자체적으로 기능한다!!

* 글자열('  ')이 여러개면 문자열("  ") String.

  * String str = new String(    )
    - type 변수명 = new 사용할클래스명
  * str.length(    )
    * str 이라는 것은 str이라는 변수명이 참조하는 String클래스를 이용해 작업할 것이라는 것
    * "  .  " 은 찾아가서 참조하라는 명령.

* java.lang 패키지만 JVM이 자동으로 인식하고, 나머지 패키지는 직점 import 해야한다.

  * ctrl + shift + O : 자동 import

* length() : 문자열의 길이

* CharAt(index) : index의 스펠링

* 새로 사용하려는 클래스가 있다면 new로 생성해주어야 한다

  * String같은 경우 같은 문자열만 사용할 경우 new를 쓰지 않지만
  * 다른 값으로 쓸거라면 new를 이용해 새로 만들어야 한다

* Random은 단순히 Random의 기능만 쓸것이기 때문에 한번만 만들면 된다

* 코드를 디버깅할 때 원하는 곳에서 sysout으로 하나씩 점검하면서 진행하는 것이 좋다

* next() => space나 enter가 입력되기 전까지 인식

* System.out 표준출력

* System.in 표준입력

* switch 내부 속도 + 가독성 > multiIF 내부 속도

* *코드의 중복을 제거하고, 가독성을 높이고, 실행시간을 줄이자!*

* **자바는 완벽한 OOP이다. why?  기본형데이터,오류 를 객체로 관리할 수 있기 때문!**

* < String으로 입력받은 명령형 매개변수를 int로 변환하는 방법 >

  * String[] args : 명령행 매개변수

  * Run - Run Configurations - Arguments - $(String_prompt) 입력

  * ```java
    int num1 = Integer.parseInt(args[0])
    ```

* 문자열 비교는 무조건 equals를 이용해서 비교하자( ==는 X)

  ```java
  ex) this.cardNo.equals(cardNo)
  ```

* 하나의 클래스에서 하나의 역할 , 하나의 메소드에선 하나의 기능

### 2. 변수

1. 지역변수
   1. {  } (블럭) 안에서 선언된 변수
   2. 선언된 블럭이 종료되면 메모리에서 해제
   3. 선언된 블럭 내부에서만 사용이 가능
   4. 반드시 초기화 작업을 해야한다.

### 3. 연산자

1. 사칙연산자

2. 연결연산자

3. 논리연산자

   1. &, | 같이 하나 짜리는 무조건 양쪽 두개 다 계싼한다 

      => 오류를 걸러낼 때 사용가능

   2. &&, || 같이 두개 짜리는 

      => 연산자를 먼저 체크 => 아 Or(And) 연산이네? => 첫번째 항만 검사 => 두번째 항은 검사 X

### 4. 제어구문

1. 데이터 타입

   1. 기본형

      1. 숫자
         * byte / short / int / long / float / double
         * 정수형 변수에 기본으로 할당되는 리터럴의 타입은 int
           * long 타입인 경우 접미사 L이나 l 추가
         * 실수형 변수에 기본으로 할당되는 리터럴의 타입은 double
           * float 타입인 경우 접미사 F나 f 추가
      2. 문자
         * char / boolean

   2. 참조형

      * 어떤 값이 가진 주소를 값으로 갖는다.

   3.  기본 형변환

      1. 자동 형변환

         * 큰데이터 타입의 변수 = 작은 데이터타입 변수

         * byte > short > int > long > float > double
         * char > int => 문자에 대한 Ascii 값 출력 

      2. 명시적 형변환

         * (type) ~~

2. 순차형

   * 위에서부터 순차적으로 내려오면서 문장을 실행

3. 선택형

   * 제어문끼리 중첩가능하다.

   1. if문

      * if( 조건 ){ 조건이 만족할 경우 실행할 문장 };

   2. if-else문

      * if( 조건 ){ 조건이 만족할 경우 실행할 문장 }else{ 조건이 만족하지 않는 경우 실행할 문장 };

   3. Switch

      * switch( 조건 ){ case 1

        ​						실행문;

        ​						  case 2

        ​						실행문 ; }

      * switch의 조건문은 int로 casting될 수 있는 값을 담고있는 변수/연산식/메소드호출문이다.

4. 순환형

   > break는 swtich와 반복문안에서 사용하지만 continue는 반복문에서만 사용한다!

   1. for문

      * 횟수에 대한 반복이 용이

   2. while문

      * while( 참/거짓이 return 되는 조건식 )

      * 조건처리에 대한 반복이 용이
      * 위에서 조건 판단

   3. do-while

      * 무조건 한번은 실행이 된다.



### 5. 배열

> 여러개의 데이터를 편하게 저장 가능하다 =>  **참조형** 데이터 타입으로 쓰이는 것!

* 배열에는 배열의 사이즈를 저장하고 있는 기본 변수 length가 들어가있다.
  * 

#### 1.  1차원 배열

1. 배열의 선언
   * int[ ]   myarr;
2. 배열의 생성
   * myarr  =  new  int[ ];
   * heap으로 가는것!!
3. 배열의 초기화

####  2. 2차원 배열

> 배열을 참조하는 배열이다.

1. 배열의 선언
   * int[ ] [ ]   myarr;
   * myarr = int[ 2 ] [ 3 ]
     * 3개의 요소를 갖고있는 배열을 참조하는 배열요소가 2개.
2. for문작성
   * 뒤에서부터 for문을 작성해주자



## 3. 자바 제대로 알기

* 클래스 구성요소 
  * 멤버변수
  * 메소드
  * 생성자
* OOP
  * 특성
    * 캡슐화
    * 상속성
    * 다형성
    * 추상화
  * 패턴
  * 아키텍쳐, 프레임워크
* API
  * java.lang
  * java.util
  * ....

### 1. 클래스

```java
Class 클래스명{
    private 데이터
    public 메소드{

    }    
}
```

* 은닉하고 싶은 데이터를 private통해 정보를 은닉하고, public 메소드를 통해 은닉한다

* 클래스를 정의하고 멤버변수를 정의하는 방법

  * 멤버변수를 정의할 때는 특별한 경우를 제외하고 초기값을 주지 않는다.

  * 초기값을 정의하지 않아도 참조형은null, 정수형은0, 실수형은0.0, boolean은 false

  * 멤버변수를 정의할 때 접근 제어자를 추가해서 접근을 제어할 수 있다.

    * public -  클래스나 메소드는 외부에서 써야하니 public으로 설정
    * default
    * protected
    * private - 일반클래스의 멤버변수는 외부에서 접근하지 못하도록 private으로 제어

  * 변수(데이터)를 직접 엑세스하지 말고, 메소드를 통해서 액세스할 수 있도록 코드를 작성.

  * 클래스를 정의 할 때 멤버변수는 private으로 설정해서 외부에서 접근할 수 없도록 정보를 은닉하고 public 메소드를 통해서 접근할 수 있도록 구현하자.

    

    

#### 1. 메소드

```java
public 리턴타입 메소드명(데이터타입 변수명...){
	처리할 명령문
	(실행결과가 없는 경우는 리턴타입이 void)
}
```

* 메소드의 매개변수와 리턴타입으로 참조형, 배열, 기본형 모두 사용할 수 있다.
* 메소드를 정의할 때 한 개의 값만 리턴할 수 있는데 동일한 타입의 데이터를 여러개 리턴해야 한다면, 배열을 리턴타입으로 정의하고 사용할 수 있다.
* 타입이 다른 여러 개의 데이터를 리턴하고 싶은 경우에는 리턴하고 싶은 값을 갖고 있는 객체를 생성해서 리턴한다.
* 모든 멤버변수는 private으로 선언되어 있기 때문에 값을 설정하는 메소드와 값을 가져올 수 있는 메소드가 필요하다.
  * "setter 메소드"
    * 변수에 값을 설정하는 메소드 => 값을 바꾸는 메소드
    * set+Name (리턴 값은 void)
  * "getter 메소드"
    * 변수에 저장된 값을 호출하는 메소드
    * get+Name(리턴 값은 O)

#### 2. 생성자

```java
Person p = new Person();

public Person(){};
public Person(String name, String addr, int age){
    this.name = name;
    this.addr = addr;
    this.age = age;
}
```

* 기본생성자도 반드시 만들어줘야 한다.
* 여기서 Person()이 생성자메소드이다.
* 생성자메소드는 객체가 생성될 때  딱 한번 호출된다. => *객체의초기화* 
* 자바에서 쓸 수 있는 모든 데이터 타입을 사용 가능하다.

* java에서 시작되는 index는 거의 다 0번부터 시작한다
  - java
  - 0123

* 생성자는 메소드다. 객체가 생성될 때 호출되는 특별한 메소드이며 주로 자원을 액세스하거나 자원을 사용하기 위해서 객체가 가지고 있는 멤버변수를 초기화하는 작업을 정의한다.( 자원 - DBMS, 네트워크, 파일시스템, ....)

* *규칙*

  1. 생성자 메소드명은 클래스명과 대소문자까지 정확하게 동일한 이름으로 정의해야 한다.

     => 리턴타입을 명시하지 않는다.

  2. 생성자 메소드를 정의하지 않으면 컴파일러가 기본생성자를 제공한다.

     - 기본생성자 : 매개변수가 없는 생성자
     - 생성자 메소드를 개발자가 정의하면 컴파일러가 기본생성자를 제공하지 않는다.
     - 처리되는 일이 없다고 하더라도 무조건 기본생성자는 정의해야 한다.

  3. 생성자 메소드도 일반메소드처럼 매개변수를 정의하고 외부에서 값을 전달받아 사용할 수 있다.

     * 주로 객체에 정의된 멤버변수의 값을 초기화 하는작업

  4. 생성자 메소드도 일반 메소드처럼 오버로딩을 허용한다.

  5. 생성자 메소드 내부에서 다른 생성자 메소드를 호출할 수 있다.

     * this(매개변수 ....)
     * 반드시 첫 번째 문장에서 호출해야 한다.

#### 3. static

##### 1. 변수

*  static으로 선언한 변수는 인스턴스의 고유한 값을 저장하는 인스턴스 변수가 아니므로 인스턴스 변수로 선언할 수 없다.
* static 멤버는 인스턴스의 소유가 아니므로 반드시 클래스명으로 접근해야 한다.
* 인스턴스화 되도 고정되는 값을 저장할 때 사용된다.
* 모든 객체가 공통으로 값는 값 -> static !! **공유변수**

##### 2. 메소드

* static 멤버를 제어하기 위한 용도
* 유틸리티처럼 자주 사용하는 메소드
* static메소드는 시작할때 부터 바로 메모리에 올라간다. 그래서 static을 붙임.

### 2. OOP

#### 1. 상속

* 상속관계에서 **멤버변수**가 갖는 특징

  1.  상속관계에서는 상위클래스에서 정의된 멤버변수를 하위클래스에서 사용할 수 있다.

     (하위클래스 참조 변수를 통해서 접근할 수 있다.)

  2. 상위클래스의 변수와 동일한 이름의 변수를 하위클래스에 정의하는 경우 하위클래스의 멤버변수가 우선순위가 높다.

  3. 부모클래스의 변수를 액세스 하려면 super를 이용해서 접근한다.

     * this - 자기자신의 객체
     * super - 부모 객체

  4. private으로 선언된 변수는 상속관계에 있다고 하더라도 하위클래스에서 접근할 수 없다.

  5. 상위클래스는 하위클래스의 일반적인 내용을 정의하기 위해서 사용하는 클래스이므로 주로 하위클래스를 생성해서 사용한다.

  6. 상위클래스를 쓰는게 아니라 하위클래스(자식)를 쓰는 것이다.

* 상속관계에서 **메소드**가 갖는 특징

  1. 상속관계에서는 상위클래스에 정의된 메소드를 하위클래스에서 사용할 수 있다.

     (하위클래스 참조 변수를 통해서 접근할 수 있다.)

  2. 상위클래스에 정의된 메소드와 동일한 메소드를 하위클래스에서 정의하고 사용할 수 있다. 이런 경우 하위클래스의 메소드가 호출된다.

     * 메소드를 재정의 했으면 부모보다 재정의한 메소드가 우선인식된다.

     * 상위클래스에 선언된 메소드와 동일한 메소드를 하위클래스에 정의하는 것을 메소드 재정의

       (*메소드 오버라이딩*)이라고 한다.

       * 메소드 선언부가 부모클래스의 메소드 선언부와 반드시 일치해야한다.

         => 메소드명, 매개변수 갯수, 매개변수 타입, 리턴타입이 모두 동일해야한다

  3. 부모클래스의 메소드를 사용하고 싶은 경우 super로 호출한다.

  4. 모든 클래스의 첫째줄에는 자동으로 object가 상속되어 있다.

* 상속관계에서 **생성자**가 갖는 특징
  1. 클래스의 모든 생성자메소드의 첫 번째 문장에는 부모클래스의 기본 생성자를 호출하는 명령문이 생략되어 있다.
     * 부모클래스도 메모리에 할당되어야 사용할 수 있으므로
     * 부모의 생성자를 호출하는 방법은 super(...)
       - super()는 부모의 매개변수 없는 기본 생성자
     * 이미 다른 생성자를 호출하는 경우에는 super()를 할 수없다.
       * this()를 호출하는 경우 super를 호출할 수 있다.
  2. 모든 클래스의 최상위 클래스는 java.lang.Object이다.
     * 자바에서 실행되는 모든 객체가 갖는 공통의 특징을 정의한 클래스로 상속받고 있는 클래스가 없는 경우 컴파일러가 자동으로 상속하도록 한다.
  3. 부모클래스에 정의되어 있는 멤버변수가 값을 셋팅해야 하는 경우에도 하위클래스에서 전달될 수 있도록 정의한다.
     * super(값1, 값2, .....)를 통해 접근한다
  
* * 

#### 2. 추상화

* 추상클래스 - abstract의 의미
  * 미완성된 클래스, 모든 내용이 구현이 되어있지 않은 클래스로 완성되지 않았으므로 객채생성을 할 수 없다.
  * 메소드의 body가 구현되지 않은 메소드를 갖고 있는 클래스(추상메소드)
* 추상 메소드를 선언하는 방법
  * 접근제어자 abstract 리턴타입 메소드명(매개변수 list 1, 2, 3, ...)
  * 추상메소드가 정의된 클래스는 미완성된 추상클래스가 되므로, 일반클래스와 다르다.
  * 따라서, 추상클래스를 정의하는 경우 클래스 선언부에도 abstract을 추가해야 한다.
* 추상 클래스의 특징
  * 일반메소드와 추상메소드 모두 정의할 수 있다.
  * 내가 기능을 작성하는게 아니라 하위클래스에서 기능을 한다.
  * 추상메소드가 한 개라도 정의되어 있는 클래스는 반드시 abstract을 추가해야 한다.
  * 추상클래스는 인스턴스화 할수 없다.(객체 생성 불가능)
  * 추상클래스(abstract클래스)를 상속하면 에러가 발생한다?
  * AbstractSub클래스가 abstract메소드를 갖고있는 AbstractSuper클래스를 상속하면서 AbstarctSub클래스도 추상클래스로 변경된 것이다.
  * [해결방법]
    * 상위클래스로 사용될 목적으로 만들어진 클래스라면 클래스 선언부에 abstract을 추가한다.
    * 모든 "추상메소드"를 반드시 오버라이딩해야 한다.
* 추상클래스와 추상메소드를 사용하는 이유?
  * **다형성을 정의하기 위해**
  * 상위클래스로 사용하기 위한 목적(객채생성을 문법적으로 제한하기 위해)
  * 하위클래스에서 반드시 재정의해야하는 메소드를 문법적으로 정의하여 반드시 재정의하도록 하기위해

#### 3. 다형성

> 다형성은 아래 개념들의 총체적 융합이다.

##### 1) 상속

##### 2) 오버라이딩

##### 3) 추상클래스

##### 4) 객체의 형변환

* 상속관계에 있는 경우에만 가능하다.

* 변수는 참조변수타입에 따라서 결정, 메소드는 생성되는 객체가 기준이다.
* 자동 형변환
* 명시적 형변환

##### *  다형성 이모저모

* 부모타입의 변수로 선언하면 모두 받을 수 있다.

* type이 Parent라면 Parent밖에 접근 못한다.

* 동일한 타입(상위 타입)의 변수를 선언 => 실행시점에 다양한 객체가 실행될 수 있게끔 =>

  => **다양한 객체의 다양한 메소드 실행**(상속관계에 있어야 한다.)

* 유지보수하고 추가된 것들을 반영하기 위해 

* 시스템의 모듈화

* 이 모든것의 베이스는 "다형성"을 적용할 수 있기 때문이다. - API가 가장 좋은 예시.

* 결국 상속관계, 클래스 설계를 잘 해야한다.

* **조상클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조할 수 있도록 하기위해**

#### 4. 인터페이스

> 추상메소드(상수도 포함)만 정의하는 특별한 클래스

* 인터페이스는 interface키워드를 이용해서 정의

* 인터페이스는 추상메소드만 정의하는 특별한 클래스

  * public abstract이 생략 가능
  * 상속을 받으면 자동으로 추가된다.

* 인터페이스가 인터페이스를 상속할 수 있다.(extends 이용)

  * 하위 인터페이스가 상위인터페이스의 추상메소드를 상속받는다.

* 클래스가 인터페이스를 상속할 수 있다.(implements 이용)

  * 인터페이스를 상속받는 클래스가 이미 다른클래스를 상속하는 경우에 extends를 먼저 정의하고 implements를 정의해야 한다.

* 인터페이스는 여러개를 상속할 수 있다. 즉, 다중 상속이 가능하다.

  * implements 뒤에서 인터페이스를 정의할 때, " , " 로 구분해서 나열

* 클래스와 인터페이스들을 상속받는 하위클래스는 모든 클래스와 인터페이스의 하위로 인식된다.

  (상속받는 모든 클래스, 인터페이스의 하위 타입이 된다.) - 하위 메소드들에게 스펙을 제시.

* 원래 자바는 단일상속만 가능하지만, 인터페이스를 이용해 다중상속을 구현한다.

##### 1. 사용목적

1. 다중 상속을 허용하고 다형성을 적용할 수 있도록 하는 것.
2. 기본적으로 구현해야 하는 기능이 무엇인지 정의하기 위한 목적



#### 5. 예외

```java
try{
    예외가 발생할 수 있는 문장
}
catch(Exception e){
    예외 발생시 처리할 문장
}
finally{
    반드시 실행할 명령문; => 무조건 실행
}
```

* 사용자가 입력하는 값에 따라 예외가 다르게 발생한다.

1. 사용자가 제대로 값을 입력

   => 예외가 발생되지 않으므로 catch블럭은 실행되지 않는다.

2. 사용자가 나눌 숫자에 0을 입력

   => ArithmeticException이 발생

   => Exception e(상위 타입) = new ArithmeticException(....)(하위  객체)

   => Exception이 상위타입이기 때문에 가능하다.(다형성이 적용되있음)

3. 사용자가 숫자가 아니라 문자를 입력

   => InputMismatchException이 발생

   => Exception e = new InputMismatchException();



- 다양한 Exception 처리를 위해서 catch블럭을 여러 개 정의하고 사용할 수 있다.
- 상위타입에 속하는 Exception은 가장 나중에 정의해야 한다.
- throws는 호출한 곳으로 예외를 던질 때
- throw는 예외를 임의적으로 발생시킬 때

```java
public class MyException extends Exception{
    public MyException(String msg){
        super(msg);      
    }       
}
public class MyExceptionTest{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
        System.out.print("숫자입력:");
        int num = key.nextInt();
        try{
            if(num%2 == 1){
                //예외상황발생
                //JVM이 인식하는 오류가 아니라 사용자가 정의한 오류이므로 예외를 발생시킬수 있도록 정의
                throw new MyException();
            }
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}
```

```java
public class Prob1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자로 변환할 문자열을 입력바랍니다.");
		String str = scan.nextLine();
		int result = 0;
		try {
			result = convert(str);
			System.out.println("변환된 숫자는 " + result + "입니다.");
		} catch (IllegalArgumentException e) {
			System.out.println("예외가 발생되었습니다. 문자열을 입력않고 Enter를 누르셨습니다.");
		}
	}

	private static int convert(String str) throws IllegalArgumentException {
		int num = Integer.parseInt(str);
			if (str == null | str.length() == 0) {
				throw new IllegalArgumentException();
			}
		return num;

	}
}
```

* static에서 non-static을 호출할 때는 자신의 클래스에서의 메소드를 호출한다 해도 반드시 클래스로 객체를 불러서 호출해야 한다.
* 예외가 발생된 곳에서 예외를 처리하면 호출하는 곳에서는 어떤 예외가 발생했는지 알 수 없고 예외가 발생할 때 경우에 따라서 다르게 처리하고 싶어도 할 수 없다.

### 3. API

#### 1. String 클래스

* 문자열 처리 메소드를 자주호출하거나 +연산자로 문자를 연결하는 작업이 많은 경우 String을 사용하지 않고, StringBuffer or StringBuilder를 이용한다.
  * StringBuffer는 동시접속에 대한 고려 O
  * StringBuilder는 동시접속에 대한 고려 X
  * WEB에서는 고려 필요없지만, 안드로이드에서는 직접 쓰레드 처리를 해야하기때문에 고려해야 한다.
* String클래스는 원본을 변경하는게 아니라, 원본을 읽어서 또다른 string객체를 생성하는 것.
