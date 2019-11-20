//https://github.com/TalAter/annyang

if (annyang) {
	// define the functions our commands will run.
    var firstlevel = function() {
    	$('#one_day').trigger('click');
    };

    var exitapp = function() {
    	$('#exitfromsite')[0].click();
    };

	
  // Let's define a command.
  var commands = {
    'дневной стационар': firstlevel,
  	'выход': exitapp,
  };

  //OPTIONAL: activate debug mode for detailed logging in the console
  annyang.debug();

  // Add our commands to annyang
  annyang.addCommands(commands);

  // OPTIONAL: Set a language for speech recognition (defaults to English)
  // For a full list of language codes, see the documentation:
  // https://github.com/TalAter/annyang/blob/master/docs/README.md#languages
  annyang.setLanguage('ru');
  
  // Start listening.
  annyang.start();
}
