# NYNOA LMS 끄적이기

## select box default 값 주기 (awesome 하게)

자고로 select box란 default값이 있고, 클릭했을 때 아래 내려오는 drop down 선택(option) 중
default 값이 안보여야 한다!! (내생각)

그럴 땐 아주 꿀팁이 있다.

1. select option에 default 값을 추가한다. 여기서 disabled 속성과 기본 선택을 위한 selected attribute를 추가한다.
```html
<option value="" disabled selected>select option</option>
```

2. css를 이용하여 드롭다운 시 해당 값이 안보이게 한다!
```css
select option[value=""][disabled] {
    display: none;
}
```

이렇게 하면 select를 클릭하면 "select option" 이라는 값이 보이지 않는다 ㅎㅎ

### css 적용 우선순위(css가 적용이 안되는 문제)

jquery를 이용하여 table row가 선택되었을 때 해당 row가 선택되었다는 표시를 해주기 위해서 class를 추가 / 삭제 하도록 했다.

근데 문제가 이미 background-color 속성이 있는 row는 class를 추가해서 스타일을 줘도 적용이 안되었다.
> 이럴 때 필요한게 <i>!important</i> 이다 !!

내가 우선적으로 주고 싶은 스타일 옆에 <i>!important</i> 키워드를 붙히면, 해당 스타일을 가장 우선해서 적용시켜준다!!
```css
/* 요런 식으로 */
.main__table_sel_row {
    background: rgba(106, 98, 204, 25%) !important;
}
```

### 소소한 jquery tip.

onclick을 이용하여 해당 dom을 컨트롤 하고 싶을 때.
```html
<tr onclick="selectTableRow(this)"></tr>
```

```javascript
function selectTableRow(selectedRow) {
    const row = $(selectedRow);
    const preSelRow = $(".main__table_sel_row");
    if(preSelRow.length !== 0) {
        preSelRow.removeClass("main__table_sel_row");
    }

    row.addClass("main__table_sel_row");
}
```
이런식으로 접근하면 클릭된 대상을 바로 jquery에 연결할 수 있다!!