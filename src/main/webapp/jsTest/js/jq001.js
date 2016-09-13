/**
 * Created by chenlong on 2016/8/26.
 */
$(document).ready(function(){
    $("p").click(function(){
        $(this).hide();
    });
});

$(document).ready(function(){
    $("#btn1").click(function(){
        alert("Text: " + $("#test").text());
    });
    $("#btn2").click(function(){
        alert("HTML: " + $("#test").html());
    });
});

$(document).ready(function(){
    $("#tsButton").click(function(){
        alert("Value: " + $("#test2").val());
    });
});

$(document).ready(function(){
    $("#btn3").click(function(){
        $("#test3").text("Hello world!");
    });
    $("#btn4").click(function(){
        $("#test4").html("<b>Hello world!</b>");
    });
    $("#btn5").click(function(){
        $("#test5").val("Dolly Duck");
    });
});

$(document).ready(function(){
    $("#btn6").click(function(){
        $("#p2").append(" <b>Appended text</b>.");
        $("#p3").prepend(" <b>My name is ChenLong</b>.");
    });

    $("#btn7").click(function(){
        $("ol").append("<li>Appended item</li>");
    });
});

$(document).ready(function () {
    $("#btn8").click(function () {
        $("#th01").before("<b>Before</b>");
    });

    $("#btn9").click(function () {
       $("#th01").after("<i>After</i>");
    });
})

$(document).ready(function () {
    $("#btn10").click(function () {
       $("#div1").remove();
    });


})

$(document).ready(function () {
    $("#btn11").click(function(){
        $("#input2").empty();
        $("#div2").empty()
    });
})