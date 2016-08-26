/**
 * Created by chenlong on 2016/8/26.
 */
$(document).ready(function(){
    $("#btn20").click(function(){
        $("#th001,#th002,#tp001,#tp002").addClass("blue");
        $("#div21").addClass("important");
    });

    $("#btn21").click(function(){
        $("#th001,#th002,#tp001,#tp002").removeClass("blue");
        $("#div21").removeClass("important");
    });

    $("#btn22").click(function(){
        $("#th001,#th002,#tp001,#tp002").toggleClass("blue");
        $("#div21").toggleClass("important");
    });

});

$(document).ready(function () {
    $("#btn23").click(function () {
        $("#tp003").css("background-color","red");
    });

    $("#btn24").click(function () {
        $("#tp003").css({"background-color":"yellow","font-size":"200%"});
    });
})

$(document).ready(function () {
    $("#btn25").click(function () {
        var txt="";
        txt+="Width of div: " + $("#div22").width() + "</br>";
        txt+="Height of div: " + $("#div22").height()+ "</br>";
        txt+="Inner width of div: " + $("#div22").innerWidth() + "</br>";
        txt+="Inner height of div: " + $("#div22").innerHeight()+ "</br>";
        txt+="Outer width of div: " + $("#div22").outerWidth() + "</br>";
        txt+="Outer height of div: " + $("#div22").outerHeight();
        $("#div22").html(txt);
    });

    $("#btn26").click(function () {
        $("#div22").width(500).height(500);
    });

    $("#btn27").click(function () {
        var txt="";
        txt+="Document width/height: " + $(document).width();
        txt+="x" + $(document).height() + "\n";
        txt+="Window width/height: " + $(window).width();
        txt+="x" + $(window).height();
        alert(txt);
    });
})