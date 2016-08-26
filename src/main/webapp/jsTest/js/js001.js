/**
 * Created by chenlong on 2016/8/25.
 */

function changeEleValue() {
    x=document.getElementById("demo")  //查找元素
    if(x.innerHTML=="Hello JavaScript"){
        x.innerHTML="Change Color";    //改变内容
    }else if(x.innerHTML=="Change Color"){
        x.innerHTML="Back";    //改变内容
        x.style.color="#ff0000";           //改变样式
    }
    else{
        x.innerHTML="Hello JavaScript";    //改变内容
        x.style.color="#000000";           //改变样式
    }
}

function confirm(){
    x=document.getElementById("input1")  //查找元素
    if(x.innerHTML==""){
        alert("必须输入项为空");
    }
}