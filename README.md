# FixedScrollView


If the length of the image is longer than the width, you can use it while maintaining the ratio completely.
---

[상황]
* 우선 imageView는 background가 아닌 src에 넣어야 fitXY등 sclae이 잘 먹는 것을 유의하자.

> 이미지 크기가 세로로 너무 긴 상태에서 사용할 수 있다.
> 가로로 늘리면서 비율을 유지하고 싶을 경우, ScrollView로 감싸고 해당 부분에 drawable을 준다. 
> 그리고 scrollbar를 xml에서 none을 처리해서 보이지 않도록 처리하고, 스크롤뷰를 상속받은 커스텀뷰를 만들어 
> intercept형태로 FixedScrollView 클래스를 활용하여 코드단에서 스크롤을 막는 처리를 boolean변수로 세팅한다.

> 이렇게 하게 되면, 세로가 가로에 비해 매우 큰 경우에도 비율을 유지한 채 페이지에 이미지 처리가 가능하다.
ex) layer형태의 안내팝업 페이지와 같은 상황에서 유용하다.


# 참고 
[baekdata](baekdata.github.io)
