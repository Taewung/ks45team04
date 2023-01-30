(function() {
  var questions = [{
    question: "User Interface 설계 시 오류 메시지나 경고에 관한 지침으로 가장 거리가 먼 것은?",
    choices: ["메시지는 이해하기 쉬워야 한다.", "오류로부터 회복을 위한 구체적인 설명이 제공되어야 한다.", "오류로 인해 발생 될 수 있는 부정적인 내용을 적극적으로 사용자들에게 알려야 한다.", "소리나 색의 사용을 줄이고 텍스트로만 전달하도록 한다.", "공정과 도구보다 개인과의 상호작용을 더 가치 있게 여긴다."],
    correctAnswer: 3
  }, {
    question: "다음 중 애자일(Agile) 소프트웨어 개발에 대한 설명으로 틀린 것은?",
    choices: ["공정과 도구보다 개인과의 상호작용을 더 가치 있게 여긴다.",  "동작하는 소프트웨어보다는 포괄적인 문서를 가치 있게 여긴다.", "계약 협상보다는 고객과의 협력을 가치 있게 여긴다.", "계획을 따르기보다 변화에 대응하기를 가치 있게 여긴다."],
    correctAnswer: 1
  }, {
    question: "소프트웨어 설계에서 요구사항 분석에 대한 설명으로 틀린 것은?",
    choices: ["소프트웨어가 무엇을 해야하는가를 추적하여 요구사항 명세를 작성하는 작업이다.",		"사용자의 요구를 추출하여 목표를 정하고 어떤 방식으로 해결할 것인지 결정하는 단계이다.","소프트웨어 시스템이 사용되는 동안 발견되는 오류를 정리하는 단계이다.","소프트웨어 개발의 출발점이면서 실질적인 첫 번째 단계이다."
	],
    correctAnswer: 2
  }, {
    question: "객체지향 기법에서 상위 클래스의 메소드와 속성을 하위 클래스가 물려받는 것을 의미하는 것은?",
    choices: ["Abstraction	","Polymorphism'","Encapsulation'","Inheritance'"
	],
    correctAnswer: 3
  }, {
    question: "설계 기법 중 하향식 설계 방법과 상향식 설계 방법에 대한 비교 설명으로 가장 옳지 않은 것은?",
    choices: ["하향식 설계에서는 통합 검사 시 인터페이스가 이미 정의되어 있어 통합이 간단하다."," 하향식 설계에서 레벨이 낮은 데이터 구조의 세부 사항은 설계초기 단계에서 필요하다.","상향식 설계는 최하위 수준에서 각각의 모듈들을 설계하고 이러한 모듈이 완성되면 이들을 결합하여 검사한다.","상향식 설계에서는 인터페이스가 이미 성립되어 있지 않더라도 기능 추가가 쉽다."
	],
    correctAnswer: 3
  }];
  
  var questionCounter = 0; //Tracks question number
  var selections = []; //Array containing user choices
  var quiz = $('#quiz'); //Quiz div object
  
  // Display initial question
  displayNext();
  
  // 다음버튼 클릭 시 
  $('#next').on('click', function (e) {
    e.preventDefault();
    
    // Suspend click listener during fade animation
    if(quiz.is(':animated')) {        
      return false;
    }
    choose();
    
    // 답안 미선택시 
    if (isNaN(selections[questionCounter])) {
      alert('답안을 선택해주세요.');
    } else {
      questionCounter++;
      displayNext();
    }
  });
  
  // 이전버튼 클릭 시
  $('#prev').on('click', function (e) {
    e.preventDefault();
    
    if(quiz.is(':animated')) {
      return false;
    }
    choose();
    questionCounter--;
    displayNext();
  });
  
  // 시험 종료버튼 클릭 시
  $('#start').on('click', function (e) {
    e.preventDefault();
    
    if(quiz.is(':animated')) {
      return false;
    }
    questionCounter = 0;
    selections = [];
    displayNext();
    $('#start').hide();
  });
  
  // Animates buttons on hover
  $('.button').on('mouseenter', function () {
    $(this).addClass('active');
  });
  $('.button').on('mouseleave', function () {
    $(this).removeClass('active');
  });
  
  // Creates and returns the div that contains the questions and 
  // the answer selections
  function createQuestionElement(index) {
    var qElement = $('<div>', {
      id: 'question'
    });
    
    var header = $('<h2>Question ' + (index + 1) + ':</h2>');
    qElement.append(header);
    
    var question = $('<p>').append(questions[index].question);
    qElement.append(question);
    
    var radioButtons = createRadios(index);
    qElement.append(radioButtons);
    
    return qElement;
  }
  
  // Creates a list of the answer choices as radio inputs
  function createRadios(index) {
    var radioList = $('<ul>');
    var item;
    var input = '';
    for (var i = 0; i < questions[index].choices.length; i++) {
      item = $('<li>');
      input = '<input type="radio" name="answer" value=' + i + ' />';
      input += questions[index].choices[i];
      item.append(input);
      radioList.append(item);
    }
    return radioList;
  }
  
  // Reads the user selection and pushes the value to an array
  function choose() {
    selections[questionCounter] = +$('input[name="answer"]:checked').val();
  }
  
  // Displays next requested element
  function displayNext() {
    quiz.fadeOut(function() {
      $('#question').remove();
      
      if(questionCounter < questions.length){
        var nextQuestion = createQuestionElement(questionCounter);
        quiz.append(nextQuestion).fadeIn();
        if (!(isNaN(selections[questionCounter]))) {
          $('input[value='+selections[questionCounter]+']').prop('checked', true);
        }
        
        // Controls display of 'prev' button
        if(questionCounter === 1){
          $('#prev').show();
        } else if(questionCounter === 0){
          
          $('#prev').hide();
          $('#next').show();
        }
      }else {
        var scoreElem = displayScore();
        quiz.append(scoreElem).fadeIn();
        $('#next').hide();
        $('#prev').hide();
        $('#start').show();
      }
    });
  }
  
  // 결과확인
  function displayScore() {
    var score = $('<p>',{id: 'question'});
    
    var numCorrect = 0;
    for (var i = 0; i < selections.length; i++) {
      if (selections[i] === questions[i].correctAnswer) {
        numCorrect++;
      }
    }
    
    score.append(' 정답 수:' + numCorrect + '  / 총 문항 수: ' +
                 questions.length);
    return score;
  }
})();