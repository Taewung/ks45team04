var time = 0;
var starFlag = true;
$(document).ready(function(){
  buttonEvt();
});

function init(){
    //document.getElementById("time").innerHTML = "00:00:00";
    let initTimeArr = document.getElementById("time").textContent.split(':');
	time += Number(initTimeArr[0]) * 60 * 60;
	time += Number(initTimeArr[1]) * 60;
	time += Number(initTimeArr[2]);
}

function buttonEvt(){
  var hour = 0;
  var min = 0;
  var sec = 0;
  var timer;

  // start btn
  $(document).on('click', '#startbtn', function(){
	
    if(starFlag){
      $(".fa").css("color","skyblue")
      this.style.color = "#4C4C4C";
      starFlag = false;

      if(time == 0){
        init();
      }

      timer = setInterval(function(){
        time++;

        min = Math.floor(time/60);
        hour = Math.floor(min/60);
        sec = time%60;
        min = min%60;

        var th = hour;
        var tm = min;
        var ts = sec;
        if(th<10){
        th = "0" + hour;
        }
        if(tm < 10){
        tm = "0" + min;
        }
        if(ts < 10){
        ts = "0" + sec;
        }

        document.getElementById("time").innerHTML = th + ":" + tm + ":" + ts;
      }, 1000);
    }
  });

  // pause btn
  $("#pausebtn").click(function(){
    if(time != 0){
      $(".fa").css("color","skyblue")
      this.style.color = "#4C4C4C";
      clearInterval(timer);
      starFlag = true;
    }
  });

  // stop btn
  $("#stopbtn").click(function(){
    if(time != 0){
      $(".fa").css("color","skyblue")
      this.style.color = "#4C4C4C";
      clearInterval(timer);
      starFlag = true;
      time = 0;
      init();
    }
  });
}