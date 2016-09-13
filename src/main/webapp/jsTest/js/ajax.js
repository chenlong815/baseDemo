// $('#enterbtn').click(function() {
//     var uname = $('#userName').val();
//     var upsw = $('#passWord').val();
//
//     $.ajax({
//         url: '.../testDo.do',
//         type: 'POST',
//         data: {userName: uname, passWord: upsw},
//         dataType: "json",
//         success: function (data) {
//             // // var x=$("#uname").val();
//             // var x=$("input").eq(0).val();
//             // $.cookie('username', x);
//
//             if(data.state == 1){
//                 window.location.assign("../index.jsp");
//             }
//             if(data.state<0){
//                 alert("登录失败","请重新输入","error");
//             }
//         }
//     })
// })

// // function myAjax() {
// //     var name=document.getElementById("userName").value;
// //     var password=document.getElementById("passWord").value;
//
//     // alert("Ajax Test:"+name+"-"+password);
//     $('#enterbtn').click(function() {
//         var uname = $('#userName').val();
//         var upsw = $('#passWord').val();
//
//         $.ajax({
//             url: '/testDo.do',
//             type: 'POST',
//             data: {userName: uname, passWord: upsw},
//             dataType: "json",
//             success: function (data) {
//                 // // var x=$("#uname").val();
//                 // var x=$("input").eq(0).val();
//                 // $.cookie('username', x);
//
//                 alert("Success");
//                 // if(data.state == 1){
//                 window.location.assign("../index.jsp");
//                 // }
//                 // if(data.state<0){
//                 //     alert("登录失败","请重新输入","error");
//                 // }
//             }
//         })
//     })
// // }