# WY_JAVA_GAME

### 게임 시작 화면
![스타트 메뉴](https://github.com/wooyoon224/WY_JAVA_GAME/assets/122513968/b314920d-f63a-4aef-a362-3860234ccc79)

게임 시작 시, "던전 탈출 시뮬레이션"이라는 START MENU가 뜨고 q이외의 키를 누르면 시작 된다.
### 
  
![캡처](https://github.com/wooyoon224/WY_JAVA_GAME/assets/122513968/4d8295df-ae2c-4366-aa65-52033485013d)

그리고 다음 메세지가 뜨면 플레이어 이름을 정해주면 된다.

### 게임 메인 메뉴
![메인메뉴](https://github.com/wooyoon224/WY_JAVA_GAME/assets/122513968/81e4117e-8fea-4dee-81a0-31dc7e6a1449)

#### 1. 플레이어 정보
![플레이어 정보](https://github.com/wooyoon224/WY_JAVA_GAME/assets/122513968/198b5fb8-b832-4851-9720-c9ce61d0c50e)

진행 스테이지, 입력했던 플레이어 이름, HP, 공격력을 확인할 수 있다.

설정한 이름, HP는 최대 100으로 고정, 공격력은 최소 20으로 고정된다.

진행 스테이지는 스테이지를 지날 때 마다 증가하고, 스테이지 수는 10~15개의 랜덤한 수가 배정된다.

플레이어의 경우 일반공격 +0~15, 10%의 확률로 크리티컬로 공격*2의 데미지가 들어간다. 이는 몬스터 습격에서 사용된다.

#### 2. 게임 진행 [갈림길 선택]

![갈림길](https://github.com/wooyoon224/WY_JAVA_GAME/assets/122513968/cfdf686f-8100-4d54-9d16-bb38df9976d0)

게임 진행을 할 수 있으며 갈림길(왼쪽, 중간, 오른쪽)을 고를 수 있고, 그 후에 맵이 확률에 따라 나타나게 된다.

##### 쉼터(25%)
10~30의 HP를 랜덤으로 회복한다.

![쉼터](https://github.com/wooyoon224/WY_JAVA_GAME/assets/122513968/f4839c3f-dfe9-4541-97f8-42f231fcbad7)

##### 함정(25%)
0~15의 HP가 랜덤으로 감소한다.

![함정](https://github.com/wooyoon224/WY_JAVA_GAME/assets/122513968/572e26e9-8470-403f-a335-d3822141ad1d)

##### 몬스터 습격(40%)
몬스터의 종류는 몬스터 A와 몬스터 B가 있으며, 몬스터 A는 25% 확률로 등장하며 30%의 확률로 회피를 할 수 있는 몬스터이며, HP는 15~40사이로 등장한다. 

몬스터 B의 경우는 일반 몬스터로 일반 공격만 가능하다. HP는 25~50 사이로 등장한다.

몬스터의 공격력은 +0~10의 랜덤값이 더해져서 공격된다. 

<몬스터 A>

![몬스터A 습격(회피)](https://github.com/wooyoon224/WY_JAVA_GAME/assets/122513968/32219bc7-4775-48b6-a61f-1e29c40bc30a)


<몬스터 B>

![몬스터B 습격(싸움)](https://github.com/wooyoon224/WY_JAVA_GAME/assets/122513968/d5df9cff-0539-4353-b193-afd19c9e1911)

싸움과 도망 중 하나를 선택할 수 있고, 10%의 확률로 도망에 성공한다. 도망에 실패시 일반 공격과 같은 턴이 된다.

![몬스터B 습격(도망)](https://github.com/wooyoon224/WY_JAVA_GAME/assets/122513968/5d8e3962-58a2-4f69-a093-5e6552b71e05)

![몬스터B 습격(도망실패)](https://github.com/wooyoon224/WY_JAVA_GAME/assets/122513968/aa87c6ce-edaf-48a8-9fc3-a1f36424632d)

- 몬스터 처치 -

![몬스터 처치](https://github.com/wooyoon224/WY_JAVA_GAME/assets/122513968/44531826-7bc1-4199-8196-c71a0aba5de1)


##### 공터(10%) 
아무 일도 일어나지 않고 다음 스테이지로 넘어간다.

![공터](https://github.com/wooyoon224/WY_JAVA_GAME/assets/122513968/0eb02063-ced0-4ad7-8a13-029a9889e105)


#### 3. 게임설명
![설명창](https://github.com/wooyoon224/WY_JAVA_GAME/assets/122513968/4e277b2a-9139-43c9-93a4-5ff294131f66)
![게임 설정](https://github.com/wooyoon224/WY_JAVA_GAME/assets/122513968/dd7519de-ce9d-4f30-b812-5365a24bd63a)
![플레이어](https://github.com/wooyoon224/WY_JAVA_GAME/assets/122513968/6575757b-365b-414f-916a-47dcdeae7bd4)
![몬스터](https://github.com/wooyoon224/WY_JAVA_GAME/assets/122513968/662bba9a-9037-47d3-ac9c-c9a4798f7923)
![공격력](https://github.com/wooyoon224/WY_JAVA_GAME/assets/122513968/145054b7-c96e-46b8-8e23-ea7c47a36ddb)
![맵](https://github.com/wooyoon224/WY_JAVA_GAME/assets/122513968/89a748ec-8619-428a-a7a8-ee4427adf4b9)

#### 4. 게임종료
![게임종료](https://github.com/wooyoon224/WY_JAVA_GAME/assets/122513968/8e5a3474-e0fc-4d54-8d9f-16899f344e50)

게임을 종료합니다.

### 게임 클리어 & 게임 오버

게임 오버 이유가 뜨고, 진행했던 스테이지를 출력한다.

![게임오버](https://github.com/wooyoon224/WY_JAVA_GAME/assets/122513968/307b7db8-bacb-4c21-aec7-90c7494a554b)

게임클리어 메세지 후, 진행했던 스테이지를 출력한다.

![클리어](https://github.com/wooyoon224/WY_JAVA_GAME/assets/122513968/d18c2dbb-3f45-4879-b138-feb97ebf806c)
