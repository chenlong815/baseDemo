function myAjax() {
    var name=document.getElementById("userName").value;
    var password=document.getElementById("passWord").value;

    // alert("Ajax Test:"+name+"-"+password);

    $.ajax({
        url:'http://localhost:8080/baseDemo/test.do',
        type:'POST',
        data:{userName:name,passWord:password},
        dataType: "json",
        success:function(data){
            // // var x=$("#uname").val();
            // var x=$("input").eq(0).val();
            // $.cookie('username', x);

            alert("Success");
            // if(data.state == 1){
                 window.location.assign("../index.jsp");
            // }
            // if(data.state<0){
            //     alert("登录失败","请重新输入","error");
            // }
        }
    })
}